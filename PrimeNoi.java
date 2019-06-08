package example;
import java.util.*;
public class PrimeNo {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter the starting Number:");
int a=sc.nextInt();
System.out.println("Enter the ending Number:");
int b=sc.nextInt();
System.out.println("Prime Numbers from" +" " +a +" " +"to" +" " +b +" " +"are :");
for(a=1;a<=b;a++){
int count=0;
for(int i=2;i<=a/2;i++){
if(a%2==0){
count++;
break;
}
}
if(count ==0 && a!=1){
System.out.println(a);
sc.close();
}
}
}
}
