package Account;

public class AccountAccess {

    static int balance = 0;

    public void Deposit(int amount) {
        balance = balance + amount;
        System.out.println("total amount in the account: " + balance);
    }

    public void Withdraw(int amount) {
        if (balance == 1000) {
            balance = balance - amount;
            System.out.println(balance + " :after withdrawal are left");
        }else {
            System.out.println("insufficient balance to retrive");
        }
    }

    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails("mk", "mk@gmail.com", 1000, 123456, 998765431);

        AccountAccess access = new AccountAccess();
        access.Deposit(2000);
        access.Withdraw(10);
        System.out.println(balance);
    }
}
