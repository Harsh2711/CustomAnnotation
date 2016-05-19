package com.support;

import java.lang.reflect.Method;

public class TestAnnotationParser {

	public void parser(Class<?> clazz) throws InstantiationException, IllegalAccessException
	{
		Object obj = clazz.newInstance();
		Method[] methods=clazz.getMethods();
		int pass=0;
		int fail=0;
		for(Method method:methods)
		{
			
			if(method.isAnnotationPresent(Test.class))
			{
				Test test=method.getAnnotation(Test.class);
				
				System.out.println("Method Name....."+method.getName());
				System.out.println("Method ANnotation PArameter"+test.info());
				try
				{
					method.invoke(obj,null);
					pass++;
				}
				catch(Exception e)
				{
					fail++;
					
				}
			}
		}
		System.out.println("No Of Pass..."+pass);
		System.out.println("No OF Fialed ......"+fail);
	}
}
