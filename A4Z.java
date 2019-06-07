package java_prac;
import java.util.*;
public class A4Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an Alphabet : ");
		String str ="abcdefghijklmnopqrstuvwxyz";
		char  c = scan.next().charAt(0);
		if(Character.isUpperCase(c)) {
			str=str.toUpperCase();
		}
		System.out.println(str.charAt(25-str.indexOf(c)));
		scan.close();
	}

}
