package java_prac;
import java.util.*;
public class FancyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Phone Number : ");
		String n = scan.next();
		int temp=0 , count =0;
		int check=0;
		for(int i=0; i<n.length();i++) {
			if(!Character.isDigit(n.charAt(i))) {
				System.out.println("Phone no must contains only 10 digits\n\n");
				main(new String[] {});
			}
		}
		if(n.length()==10 ){
			for (int i = 0; i < n.length()-3; i++) {
				if((n.charAt(i)==(n.charAt(i+1))) && (n.charAt(i+1)==(n.charAt(i+2)))) {
					check=1;
				}
			}
			for (int i = 0; i < n.length()-3; i++) {
				if((n.charAt(i+1)==(n.charAt(i)+1)) && (n.charAt(i+2)==(n.charAt(i)+2)) || (n.charAt(i+1)==(n.charAt(i)-1)) && (n.charAt(i+2)==(n.charAt(i)-2))) {
					check=1;
				}
			}
			for (int i = 0; i < n.length(); i++) {
				temp =n.charAt(i);
				for (int j = 0; j < n.length(); j++) {
					if(temp==n.charAt(j)) {
						count++;
					}
				}
				if(count>=4) {
					check=1;
					break;
				} else {
					count=0;
				}
			}
			if (check==1) {
				System.out.println("This is a fancy number . . .");
			}else {
				System.out.println("This is not a fancy number . . .");
			}
		}else {
			System.out.println("Phone no must contains only 10 digits\n\n");
			main(new String[] {});
		}
	}

}
