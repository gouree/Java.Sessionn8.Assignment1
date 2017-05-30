
public class SimpleTimer 
{
	//static class updaterThread 
		private static class UpdaterThread extends Thread
		{
			
			//set timeout to 3000
			private final int TIMEOUT = 3000;

			//run method
			public void run() 
			{
				while (true) 
				{
					try 
					{
						//message displayed before thread is set to sleep for timeout
						System.out.println("Thread is sleeping ");
						
						Thread.sleep(TIMEOUT);
						
						//print message 
						System.out.println("Thread is active ");
					}
                
					catch (InterruptedException ex) 
					{
						System.out.println("Exception occured");
					}
				}
			}
		}
        
        public static void main(String[] args) 
        {
            try
            {
            	//create a new thread u
                Thread u = new UpdaterThread();
                u.start();
               
            } 
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    