package Homework12.exercise2;

public abstract class Bank {

    public abstract int getBalance();

    public static void main (String... args){
        BankA bankA= new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Bank A balance: $" + bankA.getBalance());
        System.out.println("Bank B balance: $" + bankB.getBalance());
        System.out.println("Bank C balance: $" + bankC.getBalance());
    }
}
