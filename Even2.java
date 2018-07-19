import java.util.Scanner;

public class Even2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n<0) 
			System.out.println("invalid");
		else if(n%2==0)
			System.out.println("even");
		else if(n%2!=0)
			System.out.println("odd");
	}

}
