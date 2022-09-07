package org.example2;



public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        try {
            customer1.setName("    ");
        } catch (HataliDeger e) {
            System.out.println(e.getMessage());
        }
        try {
            customer1.setSalary(1000);
        } catch (HataliDeger e) {
            System.out.println(e.getMessage());
        }
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