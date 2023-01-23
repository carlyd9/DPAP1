public interface IAccount {
    void Deposit(double amount);
    double Withdraw(double amount);
    double GetCurrentBalance();

    double GetCurrentBalance(double currentBalance);

    int GetAccountNumber();
}
