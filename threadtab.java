class muk1 extends java.lang.Thread implements Runnable
{
	int i;
	
	public void run()
		{
	try
		{
		        System.out.println("Thread t1 is started");	
		        	System.out.println();
for(i=1;i<100;i++)
    {
    	if(i%2==0)
    	{
    		System.out.println(i);
    		sleep(50);
    	}
    
        }
        System.out.println("Thread t1 is finished");
    	System.out.println();
        System.out.println("Thread t2 is started");
        	System.out.println();
        
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
}

class muk2 extends java.lang.Thread implements Runnable
{
	int i;

	
	public void run()
		{
			try{
		
		for(i=1;i<=100;i++)
		{
			System.out.println(i*Math.random()+"x"+i+"="+(i*Math.random()*i));
			sleep(500);
		}
		sleep(50);
		System.out.println("Thread t2 is finished");
	
			}
			catch(Exception e)
			{
				System.out.println("Thread2 is interrupted");
			}
	}
}


public class threadtab extends java.lang.Thread
{
	public static void main(String v[]) throws Exception
	{
		Runnable r1=new muk1();
		Runnable r2=new muk2();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
	
		t1.start();
 	     sleep(6000);
		t2.start();
	
			
		
	}
}