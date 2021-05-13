import java.util.Scanner;
class emp
{
	String name;int sal;String desig;int age;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter name:");
		name=s.next();
		System.out.println("Enter age:");
		age=s.nextInt();
		System.out.println("Enter desig:");
		desig=s.next();
		System.out.println("Enter sal:");
		sal=s.nextInt();
		
	}
	void dis()
	{
		System.out.println("NAME:"+name);
		System.out.println("Sal:"+sal);	
		System.out.println("Designation:"+desig);
		System.out.println("Age:"+age);
	}
	void raise()
	{
		sal+=1000;
	}
		
}
public class employee
{ 
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);	
		emp e1=new emp();
		boolean b=false;
		int choice=0;
		do
   		{
			System.out.println("Enter 1 to create data");
			System.out.println("Enter 2 to dispaly data");
			System.out.println("Enter 3 to raise salary");
			System.out.println("Enter 4 to exit");
			choice=s.nextInt();
                        switch(choice)
			{
				case 1:e1.read();
					b=true;
					break;
				case 2:if(b) 
						e1.dis();
					else
						System.out.println("no records");
					break;
				case 3:if(b)
						e1.raise();
					else
						System.out.println("no records");
					break;
				
			}
		}while(choice<4);
	}
}