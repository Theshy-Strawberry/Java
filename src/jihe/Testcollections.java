package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Testcollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("ssa");
		list.add("wwa");
		list.add("qqa");
		list.add("ffa");
		//Collections.sort(list);
		Iterator it = list.iterator();
		System.out.println(list);
		while(it.hasNext()){
			String temp= (String) it.next();
			if(temp.equals("qqa")){
				temp="kid";
			}
			
		}
		
		System.out.println(list);
		
		
	}

}
