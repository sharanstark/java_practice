package CatzProject;
import java.util.*;

class Process{
	
	 String empId ="";        //temp db
	 String empName [] = new String [5];
	 String empNum [] = new String [5];
	 int empSalary [] = new int [5];
	 int empLeave [] = new int [5];
	Scanner scan = new Scanner(System.in);

	
	
	void hrMenu(){
		System.out.print("\nHR Menu \n1.Add Employee\n2.View Details \n");
		String mode = scan.next();
		
		if(mode.equalsIgnoreCase("Add Employee")||mode.equals("1")){           //1
			System.out.println("Enter the employee data \n");
			for(int i=0; i<5 ; i++){
				 System.out.print("Enter "+(i+1)+" Employee Number " );
				 empNum[i]=scan.next();
				 System.out.print("Enter "+(i+1)+" Employee Name " );
				 empName[i]=scan.next();
				 System.out.print("Enter "+(i+1)+" Employee Salary " );
				 empSalary[i]=scan.nextInt();
				 System.out.println();
				 if(i==4){
					 System.out.println("Returning to Main menu ...");
					mainMenu();
				 }
			}
		}else{
		if(mode.equalsIgnoreCase("View Details")||mode.equals("2")){               //2
			System.out.print("\nEnter Employee Number : ");
			empId = scan.next();
			for(int i=0;i<5;i++){
				if(empNum[i].equals(empId)){
					System.out.println("Employee Name : "+empName[i]+"\nEmployee Salary : "+empSalary[i]+"\nEmployee No of Leave : "+empLeave[i]);
					 System.out.println("Returning to Main menu ...");
						mainMenu();
				}
			}
		}else{                                                                      // 3>
			System.out.println("Invalid Option .. try again\n\n");
			mainMenu();
		}
	}
	}
	
	void empMenu(){
		System.out.print("\nEnter Employee Number : ");
		empId = scan.next();
		int tempLeave = 0;
		for(int i=0;i<5;i++){
			if(empNum[i].equals(empId)){             
				System.out.println("Employee Name : "+empName[i]+"\nEmployee Salary : "+empSalary[i]+"\nEmployee No of Leave : "+empLeave[i]);
				System.out.println("Do you want to apply leave ? ( Y/N ) ");
				String choice = scan.next();
				if(choice.equalsIgnoreCase("Y")){
					 System.out.println("Enter total no of leave of this month : ");
					 tempLeave = scan.nextInt();
					 if(tempLeave>2){
						 int amt = tempLeave -2 ;
	
						 empSalary[i] -= ((empSalary[i]/30)*(amt));
						 empLeave[i] += tempLeave;
							System.out.println("Employee Name : "+empName[i]+"\nEmployee Salary : "+empSalary[i]+"\nEmployee No of Leave : "+empLeave[i]);
							 System.out.println("Leave Updated .... Returning to Main menu ...");
								mainMenu();
					 }else{
						 empLeave[i] += tempLeave;
						 System.out.println("Leave Updated ... Returning to Main menu ...");
							mainMenu();
						 
					 }
				}else{
					 System.out.println("Thank you ... Returning to Main menu ...");
						mainMenu();
				}
			}
		}			
	}
	void mainMenu(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Online HR Management System\n");
		System.out.println("Login as ? \n1.Hr\n2.Employee ");
		String mode = scan.next();
		if(mode.equalsIgnoreCase("Hr")||mode.equals("1")){
			hrMenu();
		}else{
		if(mode.equalsIgnoreCase("Employee")||mode.equals("2")){
			empMenu();
		}else{
			System.out.println("Invalid Option .. try again\n\n");
			mainMenu();
		}
		
	}
		scan.close();
}
}

public class Online_HR_Management {
	public static void main(String [] args) {
		Process obj = new Process();
		obj.mainMenu();	
		
	}

}

