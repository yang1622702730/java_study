package com.fanyang.team.domain;

import com.fanyang.team.service.Status;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:18
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status; // status: Status = FREE
    private Equipment equipment;


    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }
    public Programmer(int id,String name,int age,double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "memberId=" + memberId +
                ", status=" + status +
                ", equipment=" + equipment +
                "} " + super.toString();
    }
}
