package vehicledetails;

public class Customer {
public static void main(String[] args) {
	Twowheeler t=new Twowheeler();
	System.out.println("Cost of Two wheeler:"+t.getCost());
	System.out.println("Speed of Two wheeler:"+t.getSpeed());
	Threewheeler t1=new Threewheeler();
	System.out.println("Cost of Three wheeler:"+t1.getCost());
	System.out.println("Speed of Three wheeler:"+t1.getSpeed());
	Fourwheeler f=new Fourwheeler();
	System.out.println("Cost of Four wheeler:"+f.getCost());
	System.out.println("Speed of Four wheeler:"+f.getSpeed());
	
	
}
}
