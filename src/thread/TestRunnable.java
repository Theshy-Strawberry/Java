package thread;

public class TestRunnable implements Runnable {
	private String name;
	public TestRunnable(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1111; i++) {
			System.out.println(name+i);
		}
	}

}
