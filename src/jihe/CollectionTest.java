package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import jihe.Person;
public class CollectionTest {
	/**
	 * add添加元素
	 */
	@Test
	public void testAdd(){
		Collection collection = new ArrayList();
		System.out.println(collection.size());
		collection.add("ad");
		collection.add(new Person("amy",11));
		collection.add(new Person("bob",21));
		System.out.println(collection);
	}
	//一组
	@Test
	public void testAll(){
		Collection collection2 = new ArrayList();
		collection2.add("styz");
		Collection collection = new ArrayList();
		collection.add("ad");
		collection.add(new Person("amy",11));
		collection.add(new Person("bob",21));
		collection2.addAll(collection);
		System.out.println(collection2.size());
	}
	
	// 无法获取指定元素  可以遍历出来
	// 1 增强for 循环
	// 2 iterator
	@Test
	public void testIterator(){
		Collection collection = new ArrayList();
		collection.add("ad");
		collection.add(new Person("amy",11));
		collection.add(new Person("bob",21));
//		for(Object obj:collection){
//			System.out.println(obj);
//		}
 		Iterator it= collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	//在person类中  写hashcode &  equal    removeall
	@Test
	public void testRemove(){
		Collection collection = new ArrayList();
		collection.add("ad");
		collection.add(new Person("amy",11));
		collection.add(new Person("bob",21));
		System.out.println(collection.size());
		collection.remove(new Person("amy",11));
		System.out.println(collection.size());
	}
	
	//test 
	@Test
	public void i(){
		List list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("v");
		list.add("c");
		Iterator it = list.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
	}
	
	@Test
	public void testTreeSet(){
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList();
	}
}
