class SampleThread implements Runnable{
	
	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("i = " + i);
		}
	}	
}

public class My_Thread_Test {

	public static void main(String[] args) {
		SampleThread threadObject = new SampleThread();
		Thread thread = new Thread(threadObject);
		System.out.println("Thread about to start...");
		thread.start();
	}
}

