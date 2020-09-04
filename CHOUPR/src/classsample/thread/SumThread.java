package classsample.thread;

public class SumThread implements Runnable {

	int sum = 0;
    @Override
    public void run() {
    	synchronized(this) {
    		for (int i = 0 ; i <= 100 ; i++) {
                sum = sum + i;
            }
    		notify();
    	}
        
    }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SumThread sum = new SumThread();
        Thread thread = new Thread(sum);
        thread.start();
        synchronized(thread) {
        	thread.wait();
        }
        
        int result = sum.sum;
        System.out.println("Count result is:" + result);
	}

}
