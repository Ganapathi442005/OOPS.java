import java.util.*;
class account{
	private String accountnum;
	private double balance;
	public account(String accountnum,double balance)
	{
		this.accountnum = accountnum;
		this.balance = balance;
	}
	public account()
	{
		this.accountnum = "";
		this.balance = 0;
	}
	public void display()
	{
		System.out.println("The Account number : "+this.accountnum);
		System.out.println("The Bank balance is : $"+this.balance);
	}
	protected void deposit(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println("The Amount $"+amount+" Succesfully deposited!!");
		}
		else
		{
			System.out.println("Enter the valid amount");
		}

	}
	protected void withdraw(double amount)
	{
		if(amount>0 && amount<balance)
		{
			balance = balance - amount;
			System.out.println("The Amount $"+amount+" Succesfully withdrawed!!");
		}
		else
		{
			System.out.println("Enter the valid amount");
		}

	}
	public void setNum(String num)
	{
		if(!num.isEmpty())
		{
			this.accountnum = num;
		}
		else
		{
			System.out.println("Enter the valid Accountnum");
		}
	}
	public String getNum()
	{
		return this.accountnum;
	}
	public void setAmount(double amount)
	{
		if(amount>0)
		{
			this.balance = amount;
		}
		else
		{
			System.out.println("Enter the valid Amount");
		}
	}
	public double getAmount()
	{
		return this.balance;
	}
}
public class Main{
	public static void main(String[] args){
		System.out.println("======USER 1=========");
		account e1 = new account("123456789",1234.89);
		e1.display();
		e1.deposit(1000);
		e1.display();
		e1.withdraw(1000);
		System.out.println("======USER 2=========");
		account e2 = new account();
		e2.setNum("227168942");
		e2.setAmount(32782.31);
		System.out.println("The Account num : "+e2.getNum());
		System.out.println("The Account Balance : "+e2.getAmount());
	}
}
