package registration;
import java.util.*;

public class Register {
	String name; 
	String age;
	String usr;
	String pwd;
	private Scanner sc;
	private Scanner sc2;
	private Scanner sc3;
	private Scanner sc4;
	
	public boolean validatename(String n)
	{
		String regex = "^[a-zA-Z]+$";
		n=n.trim();
		if (n.matches(regex))
		{
			return true;
		}
		else
		{
			System.out.println("Only characters allowed. Please re-enter the name");
			return false;
		}
		
	}
	public boolean validateage(String n)
	{
		String regex = "^[0-9]+$";
		age=age.trim();
		if (age.matches(regex))
		{
			return true;
		}
		else
		{
			System.out.println("Only numbers allowed. Please re-enter the age");
			return false;
		}
	}
	public boolean validateusername(String usr)
	{
		String regex = "^[a-zA-Z0-9]+$";
		usr=usr.trim();
		if (usr.length() > 6) 
		{
		System.out.println("Only 6 cha allowed. Re-enter the username");
		return false;
		}
		else 
			if (usr.matches(regex))
				{
				return true;
				}
				else
				{
				System.out.println("No Special cha allowed. Re-enter the username");
				return false;	
				}
	 }
	public boolean validatepwd(String pwd)
	{
		String regex = "^[a-zA-Z0-9@!_$*#]+$";
		pwd=pwd.trim();
		if (pwd.length() > 8)
		{
			System.out.println("Only 8 cha allowed. Re-enter the pwd");
			return false;
			}
			else 
				if (pwd.matches(regex))
					{
					return true;
					}
					else
					{
					System.out.println("Entered invalid cha. Re-enter the pwd");
					return false;	
					}
	}
	public boolean readName()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.next();
		boolean a=validatename(name);
		return a;
	}
	public boolean getage()
	{
		sc2 = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc2.next();
		boolean b=validateage(age);
		return b;
	}
	public boolean getusr()
	{
		sc3 = new Scanner(System.in);
		System.out.println("Enter your Username");
		usr = sc3.next();
		boolean c=validateusername(usr);
		return c;
	}
	
	public boolean getpwd()
	{
		sc4 = new Scanner(System.in);
		System.out.println("Enter your Password");
		pwd = sc4.next();
		boolean d=validatepwd(pwd);
		return d;
	}
     public static void main(String[] args) {
    	 Register r1 = new Register ();
 		if(!r1.readName())
 		{
 			r1.readName();
 		}
 		System.out.println("Name : "+r1.name);
 		if (!r1.getage())
		{
			System.out.println("false boolean age");
			r1.getage();
		}
		System.out.println("Age : "+r1.age);
		
		if (!r1.getusr())
		{
			System.out.println("false boolean username");
			r1.getusr();
		}
		System.out.println("Username: "+r1.usr);
		
		if (!r1.getpwd())
		{
			r1.getpwd();
		}
		System.out.println("Password: "+r1.pwd);
		System.out.println("Your Registration is sucess!");
		//System.out.println("Login form");
		//System.out.println("----------");		
		//System.out.println("Enter the username");

     }
	
	

}
