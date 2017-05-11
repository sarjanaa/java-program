package sorting;
import java.util.*;
public class Sorting {
   public static void main(String[] args) {
	  int ch,i,j,temp;
	  int a[]={5,9,1,6,2};
	  Scanner s=new Scanner(System.in);
	  do
	  {
		  System.out.println("Enter your choice:");
		  ch=s.nextInt();
		  switch(ch)
		  {
		  case 1:System.out.println("Ascending order:");
		  for(i=0;i<a.length;i++)
		  {
			  for(j=0;j<a.length;j++)
			  {
				  if(a[i]<a[j])
				  {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
			  }
		  }
		  for(i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  break;
		  case 2:System.out.println("Descending order:");
		  for(i=0;i<a.length;i++)
		  {
			  for(j=0;j<a.length;j++)
			  {
				  if(a[i]>a[j])
				  {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
			  }
		  }
		  for(i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  break;
		  default:System.out.println("Invalid choice");
		  break;
		  }
	  }while(ch!=0);
}
}
