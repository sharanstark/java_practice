import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value ");
		int arr [] = new int[100];
		int count = 0;
		int check = 0;
		int n=scan.nextInt();
		for(int m=4 ; m<n ; m++){
			
			for(int i=2; i<m ; i++){
				if(m%2 == 0){
					check=1;
				}
			}
			if(check==0){
				arr[count]=m;
				count=0;
			}
			
		}
		for(int i=0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		
		
	}

}
