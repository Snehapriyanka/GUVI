import java.util.Scanner;

public class Vowels3 {

	public static void main(String[] args) {
		boolean isVowels=false;
		Scanner s=new Scanner(System.in);
		int ch=s.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':isVowels=true;
			
		}
		if(isVowels==true)
			System.out.println("vowels");
		else if((ch>='a'&&ch<='z') || (ch>='A'&& ch<='Z'))
			System.out.println("consonant");
		else
			System.out.println("invalid");


	}

}
