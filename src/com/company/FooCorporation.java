package com.company;

public class FooCorporation {
     public static void main(String[] args) {
         totalPay(10,73);
          totalPay(7.5,35);
          totalPay(8.20, 47);

     }
     public static void totalPay (  double basePay,double hoursWorked){
          double overtime = ( hoursWorked % 40)*basePay;
          double calculatePay = hoursWorked* basePay;

          if (( hoursWorked<=40 )&& basePay>=8.00) {
               System.out.println(calculatePay);
          }
          else if ( (hoursWorked > 40) && (hoursWorked<=60)&& (basePay>=8.00)){
               System.out.println(calculatePay+overtime);
          }
          else
               System.out.println("Error");


     }

}

