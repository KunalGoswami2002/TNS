package com.tax;
public class Person {
        private String Name;
        private int Income;
        private int Age;
        private int Tax;
        private String Gender;

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Income=" + Income +
                ", Age=" + Age +
                ", Tax=" + Tax +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIncome() {
        return Income;
    }

    public void setIncome(int income) {
        Income = income;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getTax() {
        return Tax;
    }

    public void setTax(int tax) {
        Tax = tax;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
