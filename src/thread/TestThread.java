package thread;

public class TestThread extends Thread{
	private String name;
	public TestThread(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1030; i++) {
			System.out.println(name+i);
		}
		super.run();
	}
}
