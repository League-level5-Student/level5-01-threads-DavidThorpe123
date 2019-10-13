package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable, Task {
ConcurrentLinkedQueue<Task> taskQueue = new ConcurrentLinkedQueue<>();
public Worker(ConcurrentLinkedQueue<Task> taskQueue) {
	taskQueue = new ConcurrentLinkedQueue<>();
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(taskQueue.isEmpty() == false) {
			
			taskQueue.remove();
		}
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}


}
