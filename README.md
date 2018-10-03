# libra
[![License](https://img.shields.io/github/license/dungba88/libra.svg?maxAge=2592000)](LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/org.dungba/joo-libra.svg?maxAge=604800)](http://mvnrepository.com/artifact/org.dungba/joo-libra)
[![Javadocs](http://javadoc.io/badge/org.dungba/joo-libra.svg)](http://javadoc.io/doc/org.dungba/joo-libra)

**continous integration**

[![Build Status](https://travis-ci.org/dungba88/libra.svg?branch=master)](https://travis-ci.org/dungba88/libra)
[![Coverage Status](https://coveralls.io/repos/github/dungba88/libra/badge.svg?branch=master&maxAge=604800)](https://coveralls.io/github/dungba88/libra?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b5162a68d84944299bd36ebdfd56987b)](https://www.codacy.com/app/dungba88/libra?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=dungba88/libra&amp;utm_campaign=Badge_Grade)

Libra is a Java package for creating and evaluating predicate. Java-based and SQL-like predicate are both supported. For SQL predicates, it is using ANTLR to parse the string against a predefined grammar. The Java-based predicates are implementation of Specification pattern and support numeric/text/collection related conditions.

## grammar

Libra supports the following syntax for SQL predicates:

- Logic operators: `and`, `or` and `not`
- Comparison operators: >, >=, <, <=, =, ==, !=, `is`, `is not`
- Parenthesises
- List and string operators: `contains` (for both list and string) and `matches` (only for string)
- Array indexing: `a[0]` (this cannot be used to evaluate a `Map`)
- String literals, single quoted, e.g: `'John'`
- Numeric literals: `1`, `1.0`
- Boolean literals: `true`, `false`
- Other literals: `null`, `undefined`, `empty`
- Variables: alphanumerics, `_`, `.` (to denote nested object) and `[`, `]` (to denote array index), must starts with alphabet characters.

## example

Some examples of SQL predicates:

```
name is 'John' and age > 27
employments contains 'LEGO assistant' and name is 'Anh Dzung Bui'
experiences >= 4 or (skills contains 'Java' and projects is not empty)
```
## install

Libra can be easily installed with Maven:

```xml
<dependency>
    <groupId>org.dungba</groupId>
    <artifactId>joo-libra</artifactId>
    <version>1.0.3</version>
</dependency>
```

## how to use

By default, you can simply use `SqlPredicate` class for all the functionality, which supports `satisfiedBy` method to perform the evaluation. A `PredicateContext` needs to be passed to the method.

```java
PredicateContext context = new PredicateContext(anObject);
SqlPredicate predicate = new SqlPredicate(predicateString);
predicate.satisfiedBy(context);
```

You can optionally check for syntax errors:
```java
if (predicate.hasError()) {
    predicate.getCause().printStackTrace();
}
```

or throw the exception if any
```java
predicate.checkForErrorAndThrow();
```

## edge cases and limitations

Some special cases or limitations are covered here:
- Literals, if stand alone in their own branch, will be converted into predicate according to their types:
  + String literals will be considered as `true` if and only they are was *not null* and *not empty*
  + Number literals will be considered as `true` if and only they are was *not null* and *not zero*
  + `null` will always be considered as `false`
- If literals are compared with any other type, the comparison will be as normal
  + `0 is false` will be evaluated as `false`, since `0` and `false` have different type
- Variables, if stand alone in their own branch, will be converted into predicate according to their types:
  + String variables will be considered as `true` if and only if they are *not null* and *not empty*
  + Number variables will be considered as `true` if and only if they are *not null* and *not zero*
  + Boolean variables will be considered as their own values
  + `null` variables will always be considered as `false`
- When comparing number, they will be converted into `BigDecimal`, so `0.0`, `0` or `0L` are all equal
- Limitations with `contains` expression: the type of the collection and that of the item must match. `grades contains 5` where items in `grades` are decimal number will be evaluated as `false`

## optimizers

Libra currently supports a simple [Constant Folding](https://en.wikipedia.org/wiki/Constant_folding) optimization. It will reduces constant-only conditional branches into a single branch. To enable the optimizations, use `OptimizedAntlrSqlPredicateParser` as below:

```java
SqlPredicate predicate = new SqlPredicate(predicateString, new OptimizedAntlrSqlPredicateParser());
```

This will take more time to compile the SQL but will reduce evaluation time.

## extends

The `SqlPredicate` class allows you to pass your own `SqlPredicateParser`:

```java
SqlPredicate predicate = new SqlPredicate(predicateString, new MyPredicateParser());
```

you can implement your own `SqlPredicateParser`, or extend the `AbstractAntlrSqlPredicateParser` to use your own grammar. For the former, the interface has only one method `public Predicate parse(String predicate) throws MalformedSyntaxException`, so you can even use lambda expression to construct it, like:

```java
SqlPredicate predicate = new SqlPredicate(predicateString, predicate -> {
   return something; 
});
```

or use method reference:

```java
SqlPredicate predicate = new SqlPredicate(predicateString, this::parseSql);
```

## performance considerations

It is of best interest to cache the parsed version of sql and if possible, try to load all of them at startup. If you keep the `SqlPredicate` objects, they will contain the parsed predicate to be reused.

The runtime evaluation is quite fast (2 millions ops/sec with Java object or 5 millions ops/sec with `Map`). You can also consider using `Map` because it's significantly faster.
