package java_prac;
import java.util.*;

public class Anagram {
	static String sort(String str) {     
		char c []= str.toCharArray();
		Arrays.sort(c);
		str=Arrays.toString(c);
		return  str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter first word : ");
		String s1=scan.next();
		System.out.print("Enter second word : ");
		String s2=scan.next();
		if(sort(s1).equals(sort(s2))) {
			System.out.println("The given strings are Anagram ");
		}else {
			System.out.println("The given strings are not Anagram ");

		}
		scan.close();
	}

}
