package suanfa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Tuzi {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
//		小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少?
//				　　1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21….
		
//		224610
		List l = new ArrayList();
		l.add(1);
		l.add(1);
		int temp=0;
		for(int i=2;i<=10;i++){
			temp=(int) l.get(i-1)+(int)l.get(i-2);
			l.add(temp);
		}
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
