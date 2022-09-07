package org.example;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setName("Melis");
        customer1.setSalary(-100);
        System.out.println(customer1);
        // Try catch ile kullanim
//        try{
//            customer1.setName("Melis");
//            customer1.setSalary(-100);
//        }catch (HataliDeger e){
//            System.out.printf(e.getMessage());
//        }


    }
}