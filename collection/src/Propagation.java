import java.io.IOException;

public class Propagation {
	
	
	void print3() throws IOException
	{
		//int data=50/0; // exception hit
	    throw new IOException("error");
	}
  void print2() throws IOException
  {
      print3();	
  }
	
void print1()
{
try {                   // try ...catch
	
	print2();
}	
catch (Exception e)

{
	System.out.println(e);
System.out.println("exception handled");

}

}
public static void main(String[] args)
	
	{
		Propagation ob=new Propagation();
		ob.print1();
		System.out.println("rest of the code");

	}

}
