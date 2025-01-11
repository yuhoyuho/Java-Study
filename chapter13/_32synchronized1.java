package chapter13;
class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        if(balance >= money) {
            try {Thread.sleep(1000);} catch (Exception e) {}
            balance -= money;
        }
    }
}

class RunnableEx12 implements Runnable {
    Account acc = new Account();

    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100; // 100, 200, 300 중의 한 값을 임의로 선택해서 출금
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}

public class _32synchronized1 {
    public static void main(String[] args) {
        Runnable r  = new RunnableEx12();

        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
    }
}
