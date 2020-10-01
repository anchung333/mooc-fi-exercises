
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsacc = new Account("Matthews account",1000.00);
        Account myAccount = new Account("My account", 0.0);
        matthewsacc.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(matthewsacc);
        System.out.println(myAccount);
    }
}
