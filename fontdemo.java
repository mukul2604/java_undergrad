import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Font;


public class fontdemo extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JButton b1,b2;
	JLabel l;
	Container pane;
	int size=14;
	String s;
	Font f;
	fontdemo()
	{
		setTitle("FontDemo");
		pane=getContentPane();
		pane.setLayout(new GridLayout(2,1));
		p1=new JPanel();
		p2=new JPanel();
		
		f=new Font("Tahoma",Font.BOLD,size);
		p1.setBackground(Color.green);
		p2.setBackground(Color.green);
		pane.add(p1);
		pane.add(p2);
		p1.setForeground(Color.red);
		l=new JLabel("FontDemo");
		b1=new JButton("Increase");
		b2=new JButton("Decrease");
		b1.setBackground(Color.red);
		b1.setForeground(Color.green);
		b2.setBackground(Color.red);
		b2.setForeground(Color.green);
		p1.add(l);
		p2.add(b1);
		p2.add(b2);
		l.setFont(f);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		s=ae.getActionCommand();
		
		if(s.equals("Increase"))
		{
			size=size+1;
		}
		else
		{
			size=size-1;
		}
		f=new Font("Arial",Font.BOLD,size);
		l.setFont(f);
		
	}
	
	
	public static void main(String v[])
	{
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		fontdemo j=new fontdemo();
		j.setSize(400,300);
		j.setVisible(true);
	}
}