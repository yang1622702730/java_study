package com.fanyang.exercises;

/*
定义银行账户类Account，有属性：卡号cid，余额balance，所属用户Customer
银行账户类Account有方法：
（1）getInfo()，返回String类型，返回卡的详细信息
（2）取钱方法withdraw()，参数自行设计，如果取钱成功返回true，失败返回false
（3）存钱方法save()，参数自行设计，如果存钱成功返回true，失败返回false

其中Customer类有姓名、身份证号、联系电话、家庭地址等属性
    Customer类有方法say()，返回String类型，返回他的个人信息。

在测试类Bank中创建银行账户类对象和用户类对象，并设置信息，与显示信息

 */
public class Account {
    int cid = 10203;
    int balance = 1000;

    /**
     * Description 获取信息
     * @param customer
     * @return
     */
    public String getInfo(Customer customer) {
        return (""+cid+balance);
    }

    /**
     * Description 取钱
     * @param customer
     * @param money
     * @return
     */
    public boolean withDraw(Customer customer,int money){
        if (balance > money){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Description 存钱
     * @param customer
     * @param money
     * @return
     */
    public boolean save(Customer customer,int money){
        if (money<=0){
            return false;
        }
        else{
            return true;
        }
    }
}
