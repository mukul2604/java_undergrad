import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.geom.*;
public class shape1 extends JFrame
{
	private Area area;
private Area area1;
private Area area2;
Paint paint;
	shape1()
	{
		area1=new Area(new Ellipse2D.Double(100, 100, 150, 100));
		area2=new Area(new Rectangle2D.Double(150, 150, 150, 100));
	
		final JPanel p1=new JPanel(){
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				Graphics2D g2=(Graphics2D)g;
				g2.draw(area1);
				g2.draw(area2);
				g2.setPaint(Color.ORANGE);
				if(area!=null)
					g2.fill(area);
			}
		};
		add(p1,BorderLayout.CENTER);
		JPanel buttonPanel=new JPanel();
		ButtonGroup group=new ButtonGroup();
		JRadioButton addb=new JRadioButton("Add",false);
		buttonPanel.add(addb);
		group.add(addb);
		addb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt)
			{
				area=new Area();
				area.add(area1);
				area.add(area2);
				p1.repaint();
			}
		});
		
		
		JRadioButton addb1=new JRadioButton("Subtract",false);
		buttonPanel.add(addb1);
		group.add(addb1);
		addb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt)
			{
				area=new Area();
				area.add(area1);
				area.subtract(area2);
				p1.repaint();
			}
		});
		
		
		JRadioButton addb2=new JRadioButton("Intersect",false);
		buttonPanel.add(addb2);
		group.add(addb2);
		addb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt)
			{
				area=new Area();
				area.add(area1);
				area.intersect(area2);
				p1.repaint();
			}
		});
		
		
		JRadioButton addb3=new JRadioButton("ExclusiveOr",false);
		buttonPanel.add(addb3);
		group.add(addb3);
		addb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt)
			{
				area=new Area();
				area.add(area1);
				area.exclusiveOr(area2);
				p1.repaint();
			}
		});
		
		
		add(buttonPanel,BorderLayout.SOUTH);
		setSize(500,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	public static void main(String v[]) throws Exception
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new shape1();
	}	
		
		
}