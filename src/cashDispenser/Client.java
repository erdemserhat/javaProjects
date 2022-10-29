package cashDispenser;

import java.util.Scanner;

public class Client {
	
	String name="MR. JAVABANK MANAGER SERHAT";
	String surname="ERDEM";
	int age=21;
	int totalMoney=1000;
	String tcNo= "1";
	String password ="1";
	
	 void withdrawMoney (int quantity) throws InterruptedException {
		
		this.totalMoney =this.totalMoney-quantity;
		char loadingEffect [] = {'L', 'O', 'A' , 'D', 'I', 'N', 'G'};
		for (int i =0; 6>=i; i++) {
		System.out.print(loadingEffect[i] + " ");
		Thread.sleep(100);}
		for (int j =1; 3>=j; j++) {
			Thread.sleep(300);
		System.out.print( "* ");}
		
		System.out.println("");
		char withdrawMoneyEffect [] = {'W', 'I', 'T', 'H', 'D', 'R', 'A', 'W', 'I', 'N','G'};
		for (int g = 0; withdrawMoneyEffect.length!=g; g++) {
			Thread.sleep(100);
			System.out.print(withdrawMoneyEffect[g] + " ");
		}
		
		
		System.out.println("your process is done. Current money is : " +this.totalMoney);
		System.out.println("Anything else ?");
		
		userMenu ();
		
		}
	
	void depositMoney (int quantity) throws InterruptedException {
		
		this.totalMoney =this.totalMoney+quantity;
		char deposit [] = {'D','E','P','O','S','I','T','T','I','N','G'};
		System.out.println(" L O A D I N G . . .");
		for (int i =0; 10>=i; i++) {
		System.out.print(deposit[i] +" ");
		Thread.sleep(100);}
		System.out.println("");
		System.out.println("your process is done. Current money is : " +this.totalMoney);
		System.out.println("Anything else ?");
		userMenu ();
	}
	
   public   void Login () throws InterruptedException {
	  
    	System.out.println("Please enter the your tc number : ");
    	Scanner reader = new Scanner (System.in);
		String controlTc = reader.next();
		System.out.println("please enter the your password :");
		String controlPassword = reader.next();
		System.out.println(". . . L O A D I N G . . . .");
		for (int i =1; 25>i; i++) {
			Thread.sleep(30);
			System.out.print("*");
			}
	
    	if(controlTc.equals(this.tcNo) && controlPassword.equals(this.password)) {
			System.out.println("You have successfully logged in !");
			System.out.println("Dear, " +this.name.toUpperCase() +" " +this.surname.toUpperCase());
			System.out.println("---------------------------------------------------------------------");
			System.out.println("your account information :");
			System.out.println("First Name :" + this.name.toUpperCase());
			System.out.println("Last Name :" + this.surname.toUpperCase());
			System.out.println("Your TC Number is : " + this.tcNo);
			System.out.println("total money is :" + this.totalMoney);
			
			System.out.println("Hey "+ this.name.toUpperCase() + " " + this.surname.toUpperCase()+" Thank you for using JAVABANK !");
			System.out.println("Please choose a proccess that you want..");
			System.out.println("Deposit Money = 1");
			System.out.println("Withdaw Money = 2");
			Scanner selectionReader = new Scanner(System.in);
			int selectionProcess = selectionReader.nextInt();
			switch (selectionProcess) {
			case 1:
				System.out.println("Okay, how much money do you want to deposit ?");
				Scanner readerDepositMoney = new Scanner (System.in);
				int depositmoney = readerDepositMoney.nextInt();
				depositMoney(depositmoney);
				System.out.println(this.totalMoney);
				break;

			case 2:
				System.out.println("Okay, how much money do you want to Withdraw ?");
				Scanner readerWithdrawMoney = new Scanner (System.in);
				int withdawMoney = readerWithdrawMoney.nextInt();
				withdrawMoney(withdawMoney);
				System.out.println(this.totalMoney);
				break;
						}
				}
    	
    			else { 
    				System.out.println("");
    				System.out.println(" false password or tc number try again");
    				Login();
		
				}

   		}
    
   
     public void Register () throws InterruptedException {
    	
    	System.out.println("Welcome to JavaBank");
		System.out.println("Please enter the essential information to use JavaBank");
		System.out.println("");
		System.out.println("Please enter the your name :");
		Scanner reader= new Scanner(System.in);
		Client FirstClient = new Client ();
		FirstClient.name = reader.next();
		System.out.println("Please enter the your surname :");
		FirstClient.surname= reader.next();
		System.out.println("Please enter the your age :");
		FirstClient.age= reader.nextInt();
		System.out.println("Please enter the your TC Number :");
		FirstClient.tcNo = reader.next();
		System.out.println("Just more one step");
		System.out.println("please define the your password :");
		FirstClient.password=reader.next();
		System.out.println("your accaount is being registered");
		
		for (int i =1; 25>i; i++) {
			Thread.sleep(30);
			System.out.print("*");
			}
		System.out.println("");
    	System.out.println("you have successfully registered !");
    	System.out.println("Now, Let's go to the Login Menu");
    	this.name = FirstClient.name;
    	this.surname =FirstClient.surname;
    	this.age= FirstClient.age;
    	this.tcNo = FirstClient.tcNo;
    	this.password = FirstClient.password;
    	FirstClient.Login();
     	
     }
    
    
     void welcomeMenu() throws InterruptedException {
    	Client FirstClient = new Client();
		System.out.println("Welcome to Java Bank");
		System.out.println("Do you have a JAVABANK accaount ? ");
		System.out.println("Register = 1");
		System.out.println("Login = 2");
		Scanner reader = new Scanner (System.in);
		int selection = reader.nextInt();
		switch(selection) {
		case 1:
		FirstClient.Register();
		break;
		case 2:
		FirstClient.Login();
		break;
				}
    		
     	}
     
     void userMenu () throws InterruptedException {
    	 	System.out.println("First Name :" + this.name.toUpperCase());
			System.out.println("Last Name :" + this.surname.toUpperCase());
			System.out.println("Your TC Number is : " + this.tcNo);
			System.out.println("total money is :" + this.totalMoney);
			System.out.println("Please choose a proccess that you want..");
			System.out.println("Deposit Money = 1");
			System.out.println("Withdaw Money = 2");
			System.out.println("Exit = 3");
			Scanner selectionReader = new Scanner(System.in);
			int selectionProcess = selectionReader.nextInt();
			switch (selectionProcess) {
			case 1:
				System.out.println("Okay, how much money do you want to deposit ?");
				Scanner readerDepositMoney = new Scanner (System.in);
				int depositmoney = readerDepositMoney.nextInt();
				depositMoney(depositmoney);
				System.out.println(this.totalMoney);
				break;

			case 2:
				System.out.println("Okay, how much money do you want to Withdraw ?");
				Scanner readerWithdrawMoney = new Scanner (System.in);
				int withdawMoney = readerWithdrawMoney.nextInt();
				withdrawMoney(withdawMoney);
				System.out.println(this.totalMoney);
				break;
				
			case 3:
				exitMethot();
				}
			
     		}
     
     
     void exitMethot () throws InterruptedException {
    	 
    	 welcomeMenu();
    	}     
}

