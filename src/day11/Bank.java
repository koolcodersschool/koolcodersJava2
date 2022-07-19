package day11;

public class Bank {
	
	public static void main(String[] args) {
		CheckingAccount client1 = new CheckingAccount();
		
		client1.accountNumber = 1234567890l;
		client1.fullName = "Yusif Alasgarli";
		client1.amount = 20000.00;
		
		
		client1 = new CheckingAccount();
		client1.accountNumber = 5634634634634l;
		client1.fullName = "Ali Suleymanov";
		client1.amount = 50000.00;
		
		
		
		
		CheckingAccount client2 = new CheckingAccount();
		client2.accountNumber = 12324678676l;
		client2.fullName = "Nuray Mammadzada";
		client2.amount = 100000.00;
		
		client2.checkingAccountInfo();
		client1.checkingAccountInfo();
		
	}

}
