package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	static int i = 50;
	/* HINT: You will most likely need to do this with recursion */
	public static void main (String[] args) {
		createThread(50);
	}
	
	public static void createThread(int currentThread) {
		if (currentThread == 0) {
			System.out.println("Hello from thread" + i);
		return;
	}
		 i = currentThread; 
		 i--;
		Thread r3 = new Thread(() -> createThread(i));
		r3.start();
		System.out.println("Hello from thread" + i);
		
}
}