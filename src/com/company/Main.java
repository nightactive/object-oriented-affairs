package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c;   // object declaration
                    // Circle is like a type
        c = new Circle(15);  // memory allocation and object creature

        System.out.println(c);
        System.out.println("*******************************");
        /*
        Account a1 = new Account(1234, 99.99);
        System.out.println(a1);
        //Account a2 = new Account(8888);
        //System.out.println(a2);

        a1.setBalance(88.88);
        System.out.println(a1);
        System.out.println("Account number: " + a1.getAccountNumber());
        System.out.println("Balance: " + a1.getBalance());

        a1.credit(10);
        System.out.println(a1);

        a1.debit(5);
        System.out.println(a1);

        a1.debit(500);
        System.out.println(a1);
         */

        Time t1 = new Time(1,2,3);
        System.out.println(t1);

        Time t2 = new Time();
        System.out.println(t2);

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);

        System.out.println(t1);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        t1.setTime(63,59,23);
        System.out.println(t1);

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
