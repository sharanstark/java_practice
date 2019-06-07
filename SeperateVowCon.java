package java_prac;
import java.util.Scanner;
class Stark{
	Scanner input = new Scanner(System.in);
	String str ="";
	String vow ="aeiou";
	String con ="bcdfghjklmnpqrstuwxyz";
	String op_vow = "";
	String op_con="";
	String op_iv = "";
	Stark(){
		System.out.print("Enter a sentence : ");
		str=input.nextLine();
	}
	void process() {
		for(int i=0;i<str.length();i++) {
			if(vow.contains(String.valueOf(str.charAt(i)))||(vow.toUpperCase()).contains(String.valueOf(str.charAt(i)))) {
				if(!(op_vow.contains(String.valueOf(str.charAt(i))))) {
				op_vow +=str.charAt(i);
				}
			}else if(con.contains(String.valueOf(str.charAt(i)))||(con.toUpperCase()).contains(String.valueOf(str.charAt(i)))) {
				if(!(op_con.contains(String.valueOf(str.charAt(i))))) {
					op_con +=str.charAt(i);
					}
					}else if(!(op_iv.contains(String.valueOf(str.charAt(i))))) {
						op_iv +=str.charAt(i);
						}
		}
	}
	void display() {
		System.out.print("\nPlease select the choice \n1.Caps\n2.Small .... ? ");
		int temp = input.nextInt();
		switch(temp){
		case 1 : System.out.println("\nVowels  "+op_vow.toUpperCase()+"\nConsonants  "+op_con.toUpperCase()+"\nInvalid characters  "+op_iv);
		break;
		case 2 : System.out.println("\nVowels  "+op_vow.toLowerCase()+"\nConsonants  "+op_con.toLowerCase()+"\nInvalid characters  "+op_iv);
		break;
		default : System.out.println("\nInvalid choice ... try again ...\n");
				  display();	
		
	}
	
}
}
public class SeperateVowCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stark obj = new Stark();
		obj.process();
		obj.display();
	}

}
