import java.util.Scanner;

public class Sum8 {

	public static void main(String[] args) {
Scanner c=new Scanner(System.in);
int a=c.nextInt();
int sum=0;
for(int i=1;i<=a;i++)
{
sum=sum+i;
}
if(sum<9)
	System.out.println(sum);
else
	System.out.println("invalid"+sum);
}
	}


