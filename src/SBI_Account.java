import java.util.UUID;

public class SBI_Account implements BankInterface{
    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rate;

    public SBI_Account(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rate = 6.1;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void depositMoney(int amount) {
        this.balance += amount;
        return;
    }

    @Override
    public String withdraw(int amount,String enteredpassword) {
        if(enteredpassword.equals(this.password)){
            if(balance<amount)
                return "kidhar se layega re paisa";
            else{
                balance -= amount;
                return "hogaya bhai";
            }
        }
        else{
            return "Kya re bhikmangya";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (rate*time*balance)/100.0;
    }
}
