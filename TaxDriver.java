package com.tax;

import java.util.Scanner;

public class TaxDriver {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the name");
        String Name1 = sn.next();
        System.out.println("Enter the AGE");
        int Age = sn.nextInt();
        System.out.println("Enter the Gender");
        String Gender = sn.next();
        System.out.println("Enter the income");
        int Income= sn.nextInt();

        Person person1=new Person();
        person1.setName(Name1);
        person1.setAge(Age);
        person1.setGender(Gender);
        person1.setIncome(Income);

        com.tax.TacCalculation tc = new com.tax.TacCalculation();
        tc.CalculateTax(person1);
        System.out.println(person1);
    }

}
