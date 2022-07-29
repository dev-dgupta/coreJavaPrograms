package com.dga.inheritance;

class Job{
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

class Person extends Job{
    private String p;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }
}
public class CompositionInheritanceExample {

    public static void main(String[] args) {
        Person p = new Person();
        p.setSalary(1000L);
        p.setP();
    }
}
