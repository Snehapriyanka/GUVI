import java.util.Scanner;
import java.math.*;
public class Large5 {

	public static void main(String[] args) {
		int a,b,c,large=0;
		Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 b=s.nextInt();
		 c=s.nextInt();
		 if((a>b)&&(a>c))
			 large=a;
			  if((b>c)&&(b>a)) 
				 large=b;
		 if ((c>a)&&(c>b))
				 large=c;
			 System.out.println("large"+ large);
				 
	}
	}



