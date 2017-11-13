# libra

Libra is a Java package for creating and evaluating predicate. Java-based and SQL-like predicate are both supported. For SQL predicates, it is using ANTLR to parse the string against a predefined grammar. Thus it is of best interest to cache the parsed version and if possible, try to load them at startup.

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
- Variables: alphanumerics, `_` and `.`, must starts with alphabet characters.

## example

Some examples of SQL predicates:

```
name is 'John' and age > 27
employment contains 'LEGO assistant' and name is 'Anh Dzung Bui'
experiences >= 4 or (skills contains 'Java' and projects is not empty)
```

## how to use

A `PredicateContext` needs to be passed to the `satisfiedBy` method.

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

## extends

The `SqlPredicate` class allows you to pass your own `SqlPredicateParser`:

```java
SqlPredicate predicate = new SqlPredicate(predicateString, new MySqlPredicateParser());
```

you can implement your own `SqlPredicateParser`, or extend the `AbstractAntlrSqlPredicateParser` to use your own grammar. For the former, the interface has only one method `public Predicate parse(String predicate) throws MalformedSyntaxException;`, so you can even use lambda expression to construct it, like:

```java
SqlPredicate predicate = new SqlPredicate(predicateString, predicate -> {
   return something; 
});
```

or use method reference:

```java
SqlPredicate predicate = new SqlPredicate(predicateString, this::parseSql);
```
