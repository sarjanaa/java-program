package function;

public class Area {
      void circle()
      {
    	  double pi=3.14;
    	  int r=5;
    	  double a=pi*r*r;
    	  System.out.println("Area of the circle:"+a);
    	  
      }
      void square(int s)
      {
    	  int a=s*s;
    	  System.out.println("Area of square:"+a);
      }
      int rectangle()
      {
    	  int l=10;
    	  int b=20;
    	  int a=l*b;
    	  return a;
      }
      double triangle(double b,double h)
      {
    	  double t=0.5*b*h;
    	  return t;
      }
      public static void main(String[] args) {
		Area a1=new Area();
		a1.circle();
		a1.square(10);
		int a=a1.rectangle();
		System.out.println("Area of rectangle:"+a);
		double t=a1.triangle(5,2);
		System.out.println("Area of triangle:"+t);
		
	}
}

