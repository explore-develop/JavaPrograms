package scaler.beginner;

public class BankClient {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.bankName = "SBI";
        bankAccount1.accountNo = 13231;
        bankAccount1.governedBy = "RBI";
        bankAccount1.setBankBalance(3221);

        System.out.println(bankAccount1.bankName );
        System.out.println(bankAccount1.getBankBalance() );
    }
}
