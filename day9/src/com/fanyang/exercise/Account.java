package com.fanyang.exercise;

/**
 * @program: day9
 * @description: 银行管理系统
 * @author: FanYang
 * @create: 2021-05-24 10:14
 */
//写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
// 账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问
//器方法（getter 和setter 方法），返回月利率的方法 getMonthlyInterest()，
// 取款方法 withdraw()，存款方法     deposit()。
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    /**
     * @Description: 取钱
     * @Prame: [amount]
     * @return: void
     * @author: FanYang
     * @time:
     */
    public void withdraw(double amount) {
        if (balance > amount) {
            System.out.println("取钱中......");
            System.out.println("取钱成功.....");
            System.out.println("现在的余额为" + balance);
            balance -= amount;
        } else {
            System.out.println("余额不足....");
            System.out.println("现在的余额为" + balance);
        }
    }

    /**
     * @Description: 存钱
     * @Prame: [amount]
     * @return: void
     * @author: FanYang
     * @time:
     */
    public void deposit(double amount) {
        System.out.println("存钱中.....");
        System.out.println("存钱成功.....");
        System.out.println("现在的余额为" + (balance+amount));
    }
}
