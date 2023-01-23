import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private final List<IAccount> accounts;


    public Bank() {
        accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() > 0) {
                    accounts.remove(account);
                    System.out.println("Account closed");
                } else {
                    System.out.println("Account is in debt");
                }
                return;
            }
        }
        System.out.println("Account not found");
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return accounts;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}







