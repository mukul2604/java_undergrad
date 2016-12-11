import java.util.*;
public class LinkedListTest{
	public static void main(String v[])
	{
		List a=new LinkedList();
		a.add("Mukul");
		a.add("Satvik");
		a.add("Mayank");
		System.out.println(a);
		List b=new LinkedList();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");	
		System.out.println(b);	
		ListIterator alter =a.listIterator();
		Iterator blter=b.iterator();
		while(blter.hasNext())
		{
			if(alter.hasNext())
				alter.next();
			alter.add(blter.next());
		}
		System.out.println(a);
		blter=b.iterator();
		while(blter.hasNext())
		{
			blter.next();
			if(blter.hasNext())
			{
				blter.next();
				blter.remove();
			}
		}
		System.out.println(b);
		a.removeAll(b);
		System.out.println(a);
	}
}
