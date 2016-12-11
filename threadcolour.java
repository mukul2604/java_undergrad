import java.awt.*;
import javax.swing.*;
import java.lang.Thread.*;
import java.io.*;

class mukt extends JFrame implements Runnable
{
	
JPanel p=new JPanel();
	
	int x,y,z,l,u;
	
	public void run()
	{
	//	sleep(1000);
	try{	
	    add(p);
		setSize(255,255);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	for(x=0;x<=255;x++)
	{
		for(y=0;y<=255;y++)
		{
			for(z=0;z<=255;z++)
			{
				p.setBackground(new Color(x,y,z));
			for (u=0;u<100;u++){
				for(l=0;l<60000;l++)
				{
					l++;
				}
				l=0;
				u++;
				}
				u=0;
			
			
			
				
				
			}
				}
		
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
		
	}

}

public class threadcolour extends java.lang.Thread
{
	public static void main(String[] args) throws Exception
	{
		Runnable r=new mukt();
		Thread t=new Thread(r);
		t.start();
		t.sleep(20000);
		t.start();
	}
}