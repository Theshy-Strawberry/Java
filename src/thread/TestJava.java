package thread;
public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=1;
//		int b = 5;
//		b+=a;
//		int f = -9;
//		Math.abs(f);
//	Scanner sc = new Scanner(System.in);
//	int   chang = sc.nextInt();
//	int  kuan = sc.nextInt(); 
//		char sc = (char) System.in.read();
	
//		System.out.println("面积是："+kuan*chang);
//		int i =0;
//		int j =0;
//		boolean b;
//		b = i++>0&++j>0;
//		int c=1;
//		++c;
//		System.out.println(c);
		//System.out.println(b+"  "+i+" "+j);
		//java  字符串比较
//		 String s1 = "Programming";
//	        String s2 = new String("Programming");
//	        String s3 = "Program" + "ming";
//	        System.out.println(s1 == s2);
//	        System.out.println(s1 == s3);
//	        System.out.println(s1 == s1.intern());
		System.out.println(reverse("junjun"));
		System.out.println( new StringBuilder("abcdefghijkl").reverse().toString());
		System.out.println(new StringBuffer("asdfghj").reverse().toString());
	}
	 public static String reverse(String originStr) {
	        if(originStr == null || originStr.length() <= 1) {
	            return originStr;}
	        String a = originStr.substring(1);
	       // char b =  originStr.charAt(0);
	        String c = originStr.substring(0, 1);
	        
	        return reverse(a) + c;
	    }

	
}
