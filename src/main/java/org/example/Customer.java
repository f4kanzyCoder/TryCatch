package org.example;

public class Customer {
    private String name;
    private double salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.trim().length()==0){
            throw new HataliDeger("isim",name);
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            throw new HataliDeger("maas",salary);
        }
            this.salary = salary;

    }
    @Override
    public String toString(){
        return "İsim : "+ name +", Maaş :" +salary;
    }
}
