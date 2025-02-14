package multithreading;

class Programming{
	public void code() {
		System.out.println("Coding is fun!");
	}
}
//1.Creating user defined thread using Thread class 
class JavaThread extends Thread {
	@Override
	public void run() {
		// define thread job
		for (int i = 1; i <= 5; i++) {
			System.out.println("java-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//2. Creating user defined thread using runnable interface 
class PythonThread implements Runnable {
	@Override
	public void run() {
		// define thread job
		for (int i = 1; i <= 5; i++) {
			System.out.println("python-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		PythonThread p = new PythonThread();
		Thread t = new Thread(p);
		t.start();
		t.join();

		JavaThread j = new JavaThread();
		j.start();// begin thread exception
		// j.reu(); // new thread cannot be created
		t.join();
		// main thread job
		for (int i = 1; i <= 5; i++) {
			System.out.println("main-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}