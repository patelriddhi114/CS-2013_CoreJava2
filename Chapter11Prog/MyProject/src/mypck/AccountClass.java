package mypck;

import java.util.ArrayList;
import java.util.Date;

public class AccountClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account1 account = new Account1("George", 1122, 1000);

		// Set annual interest rate to 1.5%
		account.setAnnualInterestRate(1.5);

		// Deposit $30, $40, and $50 to the account
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		// withdraw $5, $4, and $2 from the account
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

		// Print an account summary
		System.out.println("       Account Summary"); 
		System.out.println("------------------------------------");
		System.out.println("Account holder name: " + account.getName());
		System.out.println("Interest rate: " + account.getAnnualInterestRate());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.println("\n     List of transactions");
		System.out.println("------------------------------------");
		for (int i = 0; i < account.getTransactions().size(); i++) {
			System.out.println("Date: " + 
				(account.getTransactions()).get(i));
			System.out.println("Type: " + 
				(account.getTransactions()).get(i).getDateCreated());
			//System.out.println("Amount: " + 
				//(account.getTransactions()).get(i).get());
			System.out.println("Balance: " + 
				(account.getTransactions()).get(i).getBalance());
			//System.out.println("Description: " + 
				//(account.getTransactions()).get(i).getDescription());
			System.out.println();
		}
	}
}
class Transaction
{
	public char mName;
	//public int mId;
	public double mBalance;
	public double mAnnualInterestRate; // AnnualInterestRate is percentage.
	public Date mDateCreated;
	//public ArrayList<Transaction> mTransactions;
	public String accname;
	
	public Transaction()
	{
		
	}
	public Transaction(char name,double balance,double anuualInterest,String accountname)
	{
		this.mName = name;
		this.mBalance = balance;
		this.mAnnualInterestRate = anuualInterest;
		this.accname = accountname;
	}
	public double getBalance() {
        return mBalance;
    }

    public void setBalance(double balance) {
        mBalance = balance;
    }

    public double getAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        mAnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return mDateCreated;
    }

    public double getMonthlyInterestRate() {
        return mBalance * (mAnnualInterestRate / 12) / 100;
    }


}
class Account1 extends Transaction {

    protected String mName;
    protected int mId;
    protected double mBalance;
    protected double mAnnualInterestRate; // AnnualInterestRate is percentage.
    protected Date mDateCreated;
    protected ArrayList<Transaction> mTransactions;


    public Account1() {
        mDateCreated = new Date();
        mTransactions = new ArrayList<>();
    }

    public Account1(int id, double balance) {
        this();
        mId = id;
        mBalance = balance;
    }

    public Account1(String name, int id, double balance) {
        this(id, balance);
        mName = name;

    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
    public double getBalance() {
        return mBalance;
    }

    public void setBalance(double balance) {
        mBalance = balance;
    }

    public double getAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        mAnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return mDateCreated;
    }

    public double getMonthlyInterestRate() {
        return mBalance * (mAnnualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) {
        mTransactions.add(new Transaction('W', amount, mBalance, "withdraw"));
        mBalance -= amount;
    }

    public void deposit(double amount) {
        mTransactions.add(new Transaction('D', amount, mBalance, "deposit"));
        mBalance += amount;
    }

    @Override
    public String toString() {
        return "Account name: " + mName + "\n" + "Interest rate: " + mAnnualInterestRate + "\n" + mTransactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(mTransactions);
    }

}
