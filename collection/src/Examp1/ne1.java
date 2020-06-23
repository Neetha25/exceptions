package Examp1;

import java.util.ArrayList;

public class ne1 

{
public static void main(String args[])
{

ArrayList <String> list=new ArrayList<String>();
list.add("Chinnu");
list.add("Asna");
list.add("nee");
list.add("raj");
list.add("moon");
list.add("sun");

System.out.println("Given array list" +list);

int length = list.size();

System.out.println("length"+ length);
list.remove(1);
System.out.println(" new array list" +list);

ArrayList <String> list2=new ArrayList<String>();
list2.addAll(list);
System.out.println("List 2 array list" +list2);
list.removeAll(list);
System.out.println(" new array list" +list);
list.addAll(list2);
System.out.println(" new added array list" + list);
boolean b=list.contains("moon");
System.out.println("value is "+ b);
boolean i=list.contains("night");
System.out.println("Value is "+ i);


}}

