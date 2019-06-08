import java.util.*;
public class NPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter starting number : ");
		int a = scan.nextInt();
		int ok =0;
		System.out.print("Enter ending number : ");
		int z = scan.nextInt();
		for(int j=a ; j<=z ; j++ ){
		for(int i=2 ; i<j-1 ; i++){
			if(j%i == 0){
				ok =1;
			}
		}
		if(ok==0){
			if(j!=0){
				
			System.out.println(j);
			ok=0;
			}
		}else{
			ok=0;
		}
	 }
	}

}
