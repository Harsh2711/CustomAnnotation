package com.support;

public class DemoMyTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		TestAnnotationParser parserq = new TestAnnotationParser();
		parserq.parser(MyTest.class);
	}
	
}
