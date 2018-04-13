package javafanshe;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.junit.Test;

public class Reflection {

	@Test
	public void testClass() throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		Class clazz = null;
		// 得到class对象
		clazz = Person.class;
		// clazz=Class.forName("javafanshe.Person");
		// Field [] field =clazz.getDeclaredFields();
		// ClassLoader classLoader = clazz.getClassLoader();
		// System.out.println(classLoader);
		// //测试jdk 有哪个类加载器加载
		// classLoader= Class.forName("java.lang.Object").getClassLoader();
		// System.out.println(classLoader);
		Method method = clazz.getDeclaredMethod("setName", String.class,
				Integer.class);
		Object obj = clazz.newInstance();
		method.invoke(obj, "qqqqq", 12);
	}

	@Test
	public void testFoeld() throws ClassNotFoundException {
		String calssName = "javafanshe.Person";
		Class clazz = Class.forName(calssName);
		// 截取字段
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}

	}

	@Test
	public void testConstructor() throws SecurityException, ClassNotFoundException {
		String className = "javafanshe.Person";
		Constructor<Person> [] constructors=(Constructor<Person>[]) Class.forName(className).getConstructors();
		for(Constructor<Person> constructor: constructors){
			System.out.println(constructor);
		}
	}
}
