package chapter13;

class Account2 {
    private int balance = 1000; // private로 해야 동기화가 의미가 있다.

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {// synchronized로 메서드를 동기화
        if(balance >= money) {
            try {Thread.sleep(1000);} catch (InterruptedException e) {}

            balance -= money;
        }
    }
}

class RunnableEx13 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}

public class _33synchronized2 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx13();

        new Thread(r).start();
        new Thread(r).start();
    }
}
