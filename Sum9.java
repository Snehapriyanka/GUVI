import java.util.Scanner;

public class Sum9 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int pos=sc.nextInt();
int arr[]=new int[size];
int sum=0;
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<pos;i++)
{
	sum=sum+arr[i];
}
System.out.println(sum);

	}

}
