package multithreading;

import multithreading.JavaThread.PythonThread;

public class RedYellowGreen {

	public static void main(String[] args) {
		class RedThread extends Thread {
			@Override
			public void run() {
				// define thread job
				for (int i = 1; i <= 5; i++) {
					System.out.println("Red-" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

			// 2.creating user defined thread using runnable interface
			class YellowThread implements Runnable {
				@Override
				public void run() {
					// define thread job
					for (int i = 1; i <= 5; i++) {
						System.out.println("Yellow-" + i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}

			public class Green {
				public static void main(String[] args) throws InterruptedException {
					GreenThread p = new GreenThread();
					Thread t = new Thread(p);
					r.start();
					y.join();
					//y.join(2000);

					JavaThread j = new JavaThread();
					j.start(); // begin thread execution
					// j.run(); // new thread won't be started
		            j.join();
		            
					// main thread job
					for (int i = 1; i <= 5; i++) {
						System.out.println("Green-" + i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

}
