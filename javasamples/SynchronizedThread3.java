class MyThread3 implements java.lang.Runnable{
	private int threadId;
	public MyThread3(int id){
		
		this.threadId = id;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		taskHandler(this.threadId);
	}
	
	private static synchronized void taskHandler(int threadId){
		for(int i=0;i<100;i++){
		System.out.println("Thread ID:"+threadId+":"+i);
		}
	}

}
public class SynchronizedThread3 {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main() throws InterruptedException{
		
		for(int i=0;i<10;i++){
			
			new Thread(new MyThread3(i)).start();
		    Thread.sleep(1);
		}
	}
}
