package Examp1;

import java.util.ArrayList;
import java.util.Iterator;

public class Examp2 

{

	public static void main(String[] args)
	
	{
		ArrayList <String> list=new ArrayList<String>();
		list.add("Chinnu");
		list.add("Asna");
		list.add("nee");
		list.add("raj");
		list.add("moon");
		list.add("sun");
		
		/* Iterator itr=list.iterator();
		
		while (itr.hasNext()) // pointer checks whether the value is present in the first index
		{
			
			System.out.println(itr.next()); //prints the pointed value and then points to the next index. 
		}
        */
	for(String ob:list) 
	{
		
		System.out.println(ob);// prints the values in ob.
	}
	
	
	}
		}
