import java.io.*;

 class ThreadTest1 extends java.lang.Thread implements Runnable 
 {
 	
 	
 	public void run()
 	{
 	try
 		{
 			int i,j;
 		j=2;
 		for(i=1;i<=10;i++)
 		{
 			System.out.println(j+"x"+i+"="+(i*j));
 			sleep(100);
 		}
 	
 	}
 	
 	
 	catch(Exception e)
 	{
 		
 		e.printStackTrace();
 	}
 }
 }
 
 
  class ThreadTest2 extends java.lang.Thread implements Runnable 
 {
 	
 	
 	public void run()
 	{
 	try
 		{
 		
 			int i,j;
 		j=3;
 		for(i=1;i<=10;i++)
 		{
 			System.out.println(j+"x"+i+"="+(i*j));
 			sleep(100);
 		}
 	
 	}
 	
 	
 	catch(Exception e)
 	{
 		
 		e.printStackTrace();
 	}
 }
 }
 
 public class ThreadTest
 {
 	public static void main(String v[]) throws Exception
 	{
 		Runnable r=new ThreadTest1();
 		Runnable r2=new ThreadTest2();
 		Thread t1=new Thread(r);
 		Thread t2=new Thread(r2);
 		
 	
 		
 		t1.start();
 		System.out.println("t1 is alive??"+t1.isAlive());
 	
 		t2.sleep(2000);
 		System.out.println("t1 is alive??"+t1.isAlive());
 		
 	System.out.println("t2 is alive??"+t2.isAlive());
 		t2.start();
 		System.out.println("t2 is alive??"+t2.isAlive());
 	
 	
 		System.out.println("t2 is alive??"+t2.isAlive());
 	
 	}
 }