public interface BankInterface {

    int getBalance();
    void depositMoney(int amount);
    String withdraw(int amount,String password);
    double calculateInterest(int time);
}
