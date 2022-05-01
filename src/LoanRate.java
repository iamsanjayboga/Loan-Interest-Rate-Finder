import java.io.IOException;
import java.util.*;

class Bank {
	int amt = 0;
	void messsage(){
		System.out.println("As per rule of Government \nWe are showing this result "+amt);
	}
	void child(){
		System.out.println("You are not a valid consumer for Loan as per your Age.");
	}
	
	void cal(int amt){
		double a = amt*Math.pow(1+(0.13/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.1/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	
	void DisplayError() {
		System.out.println("No Such Bank Found!!");
	}
}
class JPMorgan extends Bank{
	@Override
	void messsage(){
		System.out.println("As per rule of Government \nWe are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 12.5.");
	}
	void rateold(){
		System.out.println("You interest rate will be 7.5.");
	}
	void cal(int amt){
		this.amt = amt;
		double a = amt*Math.pow(1+(0.125/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		this.amt = amt;
		double a = amt*Math.pow(1+(0.075/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class BankofAmerica extends Bank{
	@Override
	void messsage(){
		System.out.println("As per rule of Government \nWe are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 12.8.");
	}
	void rateold(){
		System.out.println("You interest rate will be 9.5.");
	}
	void cal(int amt){
		this.amt = amt;
		double a = amt*Math.pow(1+(0.128/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		this.amt = amt;
		double a = amt*Math.pow(1+(0.095/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class Citibank extends Bank{
	@Override
	void messsage(){
		System.out.println("As per rule of Government \nWe are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 13.5.");
	}
	void rateold(){
		System.out.println("You interest rate will be 10.5.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.135/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.105/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class CapitalOne extends Bank{
	
	void messsage(){
		System.out.println("As per rule of Government \nWe are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 13.");
	}
	void rateold(){
		System.out.println("You interest rate will be 10.");
	}
	
}
class PNC extends Bank{
	
	void messsage(){
		System.out.println("As per rule of Government \nWe are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 13.");
	}
	void rateold(){
		System.out.println("You interest rate will be 10.");
	}	
}


public class LoanRate {
	public static void main(String args[]) throws IOException{
		//System.out.println("\t   Welcome to");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//String[] arr = new String[]{"SBI","BOI","HDFC","ICICI","PNB","KOTAK","BOB","AXIS"};
		System.out.println("***** Loan Interst Rate Finder *****");
		System.out.println("\t\tWelcome");
		Bank obj1 = new Bank();
		JPMorgan obj2 = new JPMorgan();
		BankofAmerica obj3 = new BankofAmerica();
		Citibank obj4 = new Citibank();		
		PNC obj5 = new PNC();
		CapitalOne obj6 = new CapitalOne();
	
		char con = 'N';
		try {		
		
			do{
				
				System.out.println("Please provide personal information through that we will help you in a better way:");
				System.out.print("Enter your Name: ");
				String name = sc.next();
				System.out.print("Enter your Age: ");
				int age = sc.nextInt();
				System.out.print("Enter your Bank Name (i.e JPMorgan,BOFA,etc): ");
				String bank = sc.next();
				System.out.print("Enter Amount: ");
				int amount = sc.nextInt();
				System.out.println("\nHi "+name+ ", As per your bank we are finding best interest rate for you.");
				String bn = bank.toUpperCase();
				
				if(age<18){
					obj1.messsage();
					obj1.child();
					
				}
				else if(age>18 && 60>age){
					if(bn.toUpperCase().contains("JP") || bn.toUpperCase().contains("MORGAN")){
						obj2.messsage();
						obj2.rate();
						obj2.cal(amount);
					}
					else if(bn.toUpperCase().contains("BOFA") || bn.toUpperCase().contains("AMERICA")){
						obj3.messsage();
						obj3.rate();
						obj3.cal(amount);
					}
					else if(bn.toUpperCase().contains("CITI")){
						obj4.messsage();
						obj4.rate();
						obj4.cal(amount);
					}
					else if(bn.contains("PNC")){
						obj5.messsage();
						obj5.rate();
						obj5.cal(amount);
					}
					else if(bn.toUpperCase().contains("CAPITAL")){
						obj6.messsage();
						obj6.rate();
						obj6.cal(amount);
					}
					else {
						obj1.DisplayError();
					}
										
				}
				else if(age>60){
					if(bn.toUpperCase().contains("JP") || bn.toUpperCase().contains("MORGAN")){
						obj2.messsage();
						obj2.rateold();
						obj2.calold(amount);
					}
					else if(bn.toUpperCase().contains("BOFA") || bn.toUpperCase().contains("AMERICA")){
						obj3.messsage();
						obj3.rateold();
						obj3.calold(amount);
					}
					else if(bn.toUpperCase().contains("CITI")){
						obj4.messsage();
						obj4.rateold();
						obj4.calold(amount);
					}
					else if(bn.contains("PNC")){
						obj5.messsage();
						obj5.rateold();
						obj5.calold(amount);
					}
					else if(bn.toUpperCase().contains("CAPITAL")){
						obj6.messsage();
						obj6.rateold();
						obj6.calold(amount);
					}
					else {
						obj2.DisplayError();
					}
				}
				System.out.println("If you want to continue then press Y else N");
				con = sc.next().charAt(0);
				System.out.print('\f');
			}while(Character.toUpperCase(con) == 'Y');
			System.out.println("Thank you for giving a chance to us.");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
