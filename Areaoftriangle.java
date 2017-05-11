package areaoftriangle;
class Triangle
{
	int base,height;
	int i,j;
	float area;
	Triangle()
	{
		base=5;
		height=10;
	
	}
	Triangle(int i,int j)
	{
		base=i;
		height=j;
		
	}
	Triangle(Triangle obj)
	{
		base=obj.i;
		height=obj.j;
		
	}
	void findarea()
	{
		double area=0.5*base*height;
		System.out.println("The area of triangle is:"+area);
	}
}
public class Areaoftriangle {
	public static void main(String[] args) {
		Triangle a1=new Triangle();
		Triangle a2=new Triangle(5,10);
		Triangle a3=new Triangle(a1);
		a1.findarea();
	}

}
