package suanfa;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuanfaColletion {

	
	
	//判断101-200之间有多少个素数，并输出所有素数。
	@Test
	public void testSushu() {
		for (int i = 101; i < 200; i++) {
			boolean flag= false;
			for (int j = 2; j <i; j++) {
				if(i%j==0){
					flag=true;
					break;
				}
			}
			if(!flag){
				System.out.println(i);
			}
		}
		
	}
//	打印出所有的 “水仙花数 “，所谓 “水仙花数 “是指一个三位数，其各位数字立方和等于该数本身。
//	例如：153是一个 “水仙花数 “，因为153=1的三次方+5的三次方+3的三次方。
	@Test
	public void testShuixianhua(){
		int a,b,c;
		for(int i=100;i<1000;i++){
			a=Integer.parseInt(String.valueOf(i).substring(0,1));
			b=Integer.parseInt(String.valueOf(i).substring(1,2));
			c=Integer.parseInt(String.valueOf(i).substring(2,3));
			if(a*a*a+b*b*b+c*c*c==i){
				System.out.println(i);
			}
		}
	}
	@Test
	public  void tiaoxuan(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <9999; i++) {
			String temp = String.valueOf(i);
			if(temp.indexOf("6")!=-1&&temp.length()==4){
				System.out.println(i);
			}
		}
	}

}
