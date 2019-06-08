package java_prac;
import java.util.*;
public class AddPrimeIndexValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range of value  N = ");
		int n = scan .nextInt();
		int arr[] = new int[n];
		System.out.println("enter  values ...  ");
		for (int i = 0; i < n ; i++) {
			arr[i]=scan.nextInt();
		}
		//toFindPrime
		int ok =0;
		int zero=0;
		int sum=0;
		int index=0;
		int prime [] = new int[n-1];
		for(int j=2 ; j<=n-1 ; j++ ){
		for(int i=2 ; i<j-1 ; i++){
			if(j%i == 0){
				ok =1;
			}
		}
		if(ok==0){
			if(j!=0){	
				prime[index]=j;
				index++;
			ok=0;
			}
		}else{
			ok=0;
		}
	 }
		 for (int i = 0; i < prime.length; i++) {
			if(prime[i]!=0) {
				zero++;
			}
		}
		 int np [] = new int[zero];
		 for (int i = 0; i < np.length; i++) {
			np[i]=prime[i];
		}
		 //checkSum
		 for (int i = 0; i < np.length; i++) {
			sum +=arr[np[i]];
			}
		 System.out.println("Answer = "+sum);
		scan.close();
	}

}



