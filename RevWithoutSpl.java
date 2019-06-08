import java.util.*;
public class RevWithoutSpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in );
		System.out.println("Enter a string : ");
		StringBuffer sb = new StringBuffer();
		String str = scan.nextLine();
		String res ="";
		String str1 = "";
		int count =0;
		for(int i=0; i<=str.length()-1;i++){
			char temp = str.charAt(i);
			int ascii = temp ;
			if((ascii >= 48 && ascii <= 57) || (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)  ){
				str1 +=temp;
			}
		}
		sb.append(str1);
		sb=sb.reverse();
		for(int i=0; i<=str.length()-1;i++){
			char temp = str.charAt(i);
			int ascii = temp ;
			if((ascii >= 48 && ascii <= 57) || (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)  ){
				res=res+sb.charAt(count);
				count++;
			}else{
				res=res+str.charAt(i);
			}
		}
		System.out.println(res);


	}

}
