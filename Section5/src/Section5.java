public class Section5 {
    public static void main(String[] args) {
       BankAccount myAccount = new BankAccount(100);
       myAccount.displayBalance();
       myAccount.deposit(1000);
       myAccount.displayBalance();
       myAccount.withdraw(300);
       myAccount.displayBalance();

    }

}

class BankAccount {
    double balance;
    String accountHolder;
    long accountNumber;
    String password;

    BankAccount(double initialBalance){
        balance = initialBalance;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Invalid Balance");
        } else {
            balance = balance - amount;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    void displayBalance() {
        System.out.println("Your balance = " + balance);
    }
}


class Circle {
    double radius;

    //
    Circle(double initialRadius) {
        radius = initialRadius;

    }

    double calculateCircleArea() {
        double area = 3.14 * radius * radius;
        return area;
    }
}


class Student {
    String name;
    int id;

    int age;
    boolean gender;

    void breakfast() {

    }

    void study() {

    }
}
