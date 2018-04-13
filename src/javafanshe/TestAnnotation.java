package javafanshe;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class TestAnnotation {

	@Test
	public void testAnnotation() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person p = new Person();
		p.setAge(10);
		String classname= "javafanshe.Person";
		Class  clazz=Class.forName(classname);
		Object  obj = clazz.newInstance();
		Method method = clazz.getDeclaredMethod("setAge",int.class);
		int value=220;
		Annotation annotation = method.getAnnotation(Validator.class);
		if(annotation!=null){
			if(annotation instanceof Validator){
				Validator validator=(Validator) annotation;
				if(value<validator.min()||value>validator.max()){
					throw new RuntimeException("年龄非法");
				}else{
					
				}
			}
		}
		method.invoke(obj, 10);
		System.out.println(obj);
		
	}

}
