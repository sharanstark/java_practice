package java_prac;
import java.util.*;
public class BracketsChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Input : " );
		String s = scan.nextLine();
		scan.close();
		System.out.println("\n...working...\n");
		String o="([{";
		String c=")]}";
		String x="";
		int check=0;
		for (int i = 0; i < s.length(); i++) {
			if(o.contains(String.valueOf(s.charAt(i))) && check==0){
				x+=s.charAt(i);
				 System.out.println("In : "+x);
			}else if(c.contains(String.valueOf(s.charAt(i))) && check==0) {
				try {
				x=x.substring(0,x.length()-1);
				System.out.println("Out : "+x);
				}
				catch(StringIndexOutOfBoundsException e) {
					System.out.println("\n\nCompilation Error : opening bracket(s) missing " );
					check=1;
				}
			}
	}	
		if(check==0) {
		if(x.length()==0 ) {
			System.out.println("\n\nCompilation Success ");
		}else {
			System.out.println("\n\nCompilation Error : closing bracket(s) missing " );
		}
	  }
	}
}
