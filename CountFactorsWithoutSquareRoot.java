package java_prac;
import java.util.*;
public class CountFactorsWithoutSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ps [] = new int[num/2];
		for(int i=0;i<ps.length;i++) {
			ps[i]=i*i;
		}

		int arr [] = new int[num+1];
		int count = 0;
		for(int i=1;i<num-1;i++) {
			if(num%i ==0) {
				arr[count]=i;
				count++;
			}
		}
		int narr[]=new int[count];
		for (int i = 0; i < count; i++) {
			narr[i]=arr[i];
			for(int j=0;j<ps.length;j++) {
				if(narr[i]==ps[j]) {
					narr[i]=0;
				}
			}
		}
		count=0;
		for (int i = 0; i < narr.length; i++) {
			if(narr[i]!=0) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
