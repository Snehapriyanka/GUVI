import java.util.Scanner;

public class Alphabet4 {

	public static void main(String[] args) {
Scanner c=new Scanner(System.in);
int ch=c.next().charAt(0);
if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
	System.out.println("Alphabet");
else
	System.out.println("no");
	}

}
