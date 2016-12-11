
import java.io.*;
class prog
{
public static void main(String v[]) throws IOException
{


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("------PROGRAM ON VARIOUS BASIC OPERATION-------");
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println("------MENU------");
System.out.println("Select Option Pressing Keys:");
System.out.println("1=>Matrix Multiplication.");
System.out.println("2=> Quadratic Equation Solution.");
System.out.println("3=>Table Evaluation");
int d=Integer.parseInt(br.readLine());
int r1,c1,r2,c2;
int i,j,k;
int a[][]=new int[50][50];
int b[][]=new int[50][50];
int c[][]=new int[50][50];
int a1,b1,c3,d1,D,x,y;
switch(d)
  {
   case 1:
   
   {   		
	System.out.println("--------MATRIX MULTIPLICATION--------");
	System.out.println("Enter the number of rows of first Matrix ");
	r1=Integer.parseInt(br.readLine());	
	System.out.println("Enter the number of cloumns of first Matrix ");
	c1=Integer.parseInt(br.readLine());	
	System.out.println("Enter the number of rows of second Matrix");
	r2=Integer.parseInt(br.readLine());	
	System.out.println("Enter the number of coloumns of second Matrix");
	c2=Integer.parseInt(br.readLine());	
                 
 	if(c1!=r2)
		{
		 System.out.println("Matrix multiplication is not possible");
		}
	else
	{
	
	 System.out.println("Enter the elements of the first Matrix row-wise :");
    	for(i=0;i<r1;i++)
	 {
		for(j=0;j<c1;j++)
		{	
		a[i][j]=Integer.parseInt(br.readLine());
		}
		}

	System.out.println("Enter the elements of the second Matrix row-wise :");
	for(i=0;i<r2;i++)
	 {
		for(j=0;j<c2;j++)
		{	
		b[i][j]=Integer.parseInt(br.readLine());
		}
		}
	
                 for(i=0;i<r1;i++)
	{
	for(j=0;j<c2;j++)
	    {
	c[i][j]=0;
	for(k=0;k<r2;k++)
	    {
		c[i][j]=c[i][j]+a[i][k]*b[k][j];
	     }	
	}
               }	
        
   System.out.println("The resultant Matrix is:");
          
       for(i=0;i<r1;i++)
	 {
		for(j=0;j<c2;j++)
		{	
		System.out.print("      "+c[i][j]);
		}
                   System.out.println( );
		}   

	break;
	}
   }
 case 2:	
   	{

	
	System.out.println("------------SOLUTION OF QUADRATIC EQUATION---------");	  	
	System.out.println("Enter the co-efficients of the quadratic equation :");
 
	a1=Integer.parseInt(br.readLine());
	
	b1=Integer.parseInt(br.readLine());
	
	c3=Integer.parseInt(br.readLine());
                    
                    d1=b1*b1-4*a1*c3;
	if(a1!=0)
	{
                             if(d1>0)
		{
	System.out.println("----The roots are real----");
	System.out.println("SOLUTION:");
	D=(int)Math.sqrt(d1);
	x= (-b1+D)/(2*a1);
	y=(-b1-D)/(2*a1);
                System.out.println("X1="+x);
                System.out.println("X2="+y);
	}
	else if(d1<0)
	{
		System.out.println("The roots are imaginary");
		System.out.println("SOLUTION:");
		D=(int)Math.sqrt(-d1);
		x=-b1/(2*a1);
		y=D/(2*a1);
		System.out.println("X1="+x+"+"+y+"i");
		System.out.println("X2="+x+"-"+y+"i");
	}
            
             else{
             	x=-b1/(2*a1);
                   System.out.println("The Roots are equal:");
	System.out.println("X1=X2="+x);
                 }
	
              }


              else
                   {
	
	if(b1==0)
	{
                   System.out.println("The solution is TRIVIAL ");
	}
	
             else
	{
	System.out.println("The solution is LINEAR");
	System.out.println("X="+(-c3/b1));
	}	

	break;
	}
   	}

case 3:

{
                System.out.println("---------TABLE EVALUATION-----------");
                System.out.println("Enter the number:");
                 j=Integer.parseInt(br.readLine());

               for(i=1;i<=10;i++)
		{
		System.out.println("j"+"x"+i+"="+(j*i));
		}

    break;
}
	default:{
	
	
        
		System.exit(0);
   	}

	    }

           	}


         }
