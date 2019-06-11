package java_prac;
import java.util.*;
public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Weight of watermelon : ");
		int w= scan.nextInt();
		scan.close();
		if(w<=100 && (w/2)%2 == 0) {
			System.out.println("Yes\n"+(w/2)+" "+(w/2));
		}else if(w>100){
			System.out.println("Invalid Input");
		}else {
			System.out.println("No");
		}
	}

}
