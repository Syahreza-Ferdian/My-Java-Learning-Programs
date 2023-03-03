import java.util.Date;

public class exerciseNum7_360 {
    public static void main(String[] args) {
        Account akun1 = new Account(1122, 20000);
        akun1.setAnnualInterestRate(4.5);

        akun1.withdraw(2500);
        akun1.deposit(3000);

        System.out.println("Balance = " +akun1.getBalance());
        System.out.println("Monthly Interest = "+akun1.getMonthlyInterest());
        System.out.println("Date Created = "+akun1.getDateCreated());
    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){ //no-arg constructor
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    Account(int idBaru, double saldoAwal){
        id = idBaru;
        balance = saldoAwal;
    }
    //setter
    void setId(int idBaru){
        id = idBaru;
    }
    void setBalance(double saldoBaru){
        balance = saldoBaru;
    }
    void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    //getter
    String getDateCreated(){
        return dateCreated.toString();
    }
    int getId(){
        return id;
    }
    double getBalance(){
        return balance;
    }
    double getAnnualInterestRate(){
        return annualInterestRate;
    }

    //method
    double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }
    double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    double withdraw(double amount){
        return balance -= amount;
    }
    double deposit(double amount){
        return balance += amount;
    }
}
