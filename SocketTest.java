import java.io.*;
import java.net.*;
import java.util.*;
 public class SocketTest
 {
 public static void main(String[] args)
 {

 try
 {
 
 Socket s = new Socket("10.1.1.19",80);


	InputStream inStream =s.getInputStream();
	OutputStream outstream =s.getOutputStream();
     Scanner in =new Scanner(inStream); 
     	PrintWriter out= new PrintWriter(outstream);
     	while(in.hasNextLine())
     		{ 
     			out.println("Mukul");
     				}
     				
 }			
    catch (IOException e)
     {
     e.printStackTrace();
     }
 
 
 }
 }
 