class MyThread2 implements java.lang.Runnable{
	private int threadId;
	private static Object lock = new Object();
	public MyThread2(int id){
		this.threadId = id;
		
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(lock){
			
			for(int i=0;i<100;i++){
				
				System.out.println("Thread ID:"+this.threadId+":"+i);
			}
			
		}
	}

}

public class SynchronizedThread2 {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException{
		
		Object obj = new Object();
		for(int i=0;i<10;i++){
			
			new Thread(new MyThread2(i)).start();
			Thread.sleep(1);
		}
		
	}
}

