package java_prac;
import java.util.*;
public class OTP {
	
	static String otp ="";
	
	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		 System.out.println("... OTP Generator ...\n");
		 System.out.print("Account Holder Name : ");
		 String acName = scan.nextLine();
		 long acNo = 0;
		 String acType = "";
		 if(acName.length()<=2) {
			 System.out.println("! Error : Invalid name ... Redirecting ... \n\n");
			 main(new String[] {});
		 }else{ 
			 System.out.print("Account Number : ");
			 acNo = scan.nextLong();
			 if (String.valueOf(acNo).length()!=11) {
				 System.out.println("! Error : Account number must have only 11 numbers ... Redirecting ... \n\n");
				 main(new String[] {});	
			}else {
				System.out.print("Account Type ( Savings / Current / Loan ) : ");
				acType =  scan.next();
				if(!(acType.equalsIgnoreCase("Savings") || acType.equalsIgnoreCase("Current") || acType.equalsIgnoreCase("Loan")) ) {
					System.out.println("! Error : Account type must in ( Savings / Current / Loan ) ... Redirecting ... \n\n");
					 main(new String[] {});	
				}
			}
		 }
		 
		 userMethod(acName, acNo, acType);
		 System.out.print("\nYour OTP is "+otp);
		 scan.close();
	}
	public static void userMethod(String name, long no, String type) {
		otp += (type.substring(0,2))+(((no/1000000000)/10));
		String  num = String.valueOf(no);
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			temp +=(Integer.parseInt( String.valueOf((num.substring(0,5)).charAt(i))));
		}
		otp += ((temp/10)+(temp%10))+String.valueOf(name.charAt(0));
		temp=0;
		for (int i = 0; i < 5; i++) {
			temp +=(Integer.parseInt( String.valueOf((num.substring(5,10)).charAt(i))));
		}
		otp += ((temp/10)+(temp%10))+String.valueOf(name.charAt(name.length()-1))+no%10;

		
	}

}
