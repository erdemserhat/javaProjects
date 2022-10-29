package cashDispenser;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		char loadingEffect [] = {'L', 'O', 'A' , 'D', 'I', 'N', 'G'};
		for (int i =0; 6>=i; i++) {
		System.out.print(loadingEffect[i] + " ");
		Thread.sleep(100);}
		for (int j =1; 3>=j; j++) {
			Thread.sleep(300);
		System.out.print( "* ");}
		System.out.println("");
		Client FirstClient = new Client();
		FirstClient.welcomeMenu();

	}
		

}
