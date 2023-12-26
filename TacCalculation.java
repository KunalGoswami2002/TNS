package com.tax;
public class TacCalculation {


    public void CalculateTax(Person person){
        if(person.getAge()>65 || person.getGender().equalsIgnoreCase("female")){
            person.setTax(0);
            System.out.println("NO TAX FOR YOU");
        }
        else {
            if(person.getIncome()<160000){
                person.setTax(0);
                System.out.println("No tax for you");
            } else if (person.getIncome()>160000 &&person.getIncome()<500000) {
                person.setTax((person.getIncome()-160000)*10/100);
            }
            else if (person.getIncome()>500000 &&person.getIncome()<800000) {
                person.setTax((person.getIncome()-160000)*20/100);
            }else if (person.getIncome()>800000 &&person.getIncome()<2000000) {
                person.setTax((person.getIncome()-160000)*30/100);
            }
        }
    }
}
