import java.util.*;
public class RemDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = scan.next();
		String str1 = "";
		for( int i=0 ; i<str.length()-1 ; i++){
			if( str.charAt(i)!=str.charAt(i+1)){
				str1 +=str.charAt(i);
			}
		}
		System.out.println(str1+str.charAt(str.length()-1));
	}

}
