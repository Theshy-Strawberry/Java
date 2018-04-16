package thread;

public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestThread t1= new TestThread("aaa");
//		TestThread t2= new TestThread("bbb");
//		t1.start();
//		t2.start();
//		TestRunnable t1= new TestRunnable("sss");
//		
//		TestRunnable t2= new TestRunnable("ddd");
//		Thread te1= new Thread(t1);
//		Thread te2= new Thread(t2);
//		te1.start();
//		te2.start();
		RunnableDemo r1=new RunnableDemo("sas");
		Thread t1 = new Thread(r1);
		t1.start();
		for (int i = 0; i < 100; i++) {
			if(i>30){
				try {
					t1.join();
					Thread.yield();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//			if (i==10) {
//				System.out.println("lirang+++++++++++++++++++++++++++++++++++++++++++++++");
//				Thread.yield();
//			}
			System.out.println("主线程的"+i);
		}
	}

}
class RunnableDemo implements Runnable{
	private String name ;
	public RunnableDemo(String name ){
		this.name=name;
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}