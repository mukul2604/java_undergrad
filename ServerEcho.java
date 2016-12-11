import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEcho
{
	public static void main(String[] args)
	{
		
try{
		ServerSocket s=new ServerSocket(80);
System.out.println("Waiting for client.....");
		Socket incoming=s.accept();
		
		System.out.println(" client connected.....");
		try{
			InputStream inStream=incoming.getInputStream();
			OutputStream outstream=incoming.getOutputStream();
			
			Scanner in=new Scanner(inStream);
			PrintWriter out=new PrintWriter(outstream);
			
			
			out.println("Hello! It's Mukul....");
			boolean done=false;
			
			while(!done && in.hasNextLine())
			{
				String line=in.nextLine();
				out.println("Mukul:"+line);
				if(line.trim().equals("BYE") || line.trim().equals("bye"))
					done=true;
			}
		}
		finally{
			incoming.close();
		}
	
			}
			
			
			catch(Exception r)
		{
			r.printStackTrace();
		}	
			
		}
		}
		
	