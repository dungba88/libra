package org.joo.libra.test.support;

import java.util.Collection;

import lombok.Data;

@Data
public class UserVO {
	private Bar bar;
	private int age;
	private String name;
	private boolean isFemale;
	private String data;

	private long time;
	
	@Data
	public static class Foo {
		private String name;
		private int value;
		private Collection<String> collection;
		private Collection<Integer> collection1;
	}
	
	@Data
	public static class Bar {
		private Foo foo;
	}
}