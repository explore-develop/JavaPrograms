package scaler.beginner;

public class BankAccount {

    public static String governedBy;
    public int accountNo;
    public String bankName;

    private int balance;


    public int getBankBalance(){
        return this.balance;
    }

    public void setBankBalance(int balance){
        this.balance = balance;
    }
}
