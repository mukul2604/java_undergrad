class big extends java.lang.Thread implements Runnable 
{
	
	
		
		public void run()
		{
			try{
			
			System.out.println("Mukul Sharma");
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if((i+j)%2!=0)
					System.out.print(" * ");
					else
					System.out.print(" $ ");
					sleep(50);
				}
				System.out.println();
				sleep(100);
			}
			
			
		
			for(int i=1;i<=10;i++)
			{
				for(int j=10;j>=i;j--)
				{
					if((i+j)%2==0)
					System.out.print(" * ");
					else
					System.out.print(" $ ");
					sleep(50);
				}
				System.out.println();
				sleep(100);
			}
			
		
			
			}
			catch(Exception r)
			{
				r.printStackTrace();
			}
		
	}
}

public class muku extends big
{
	public static void main(String v[]) throws Exception
	{
		Runnable r=new big();
		Thread t=new Thread(r);
		t.start();
		t.sleep(1000);
	}
}