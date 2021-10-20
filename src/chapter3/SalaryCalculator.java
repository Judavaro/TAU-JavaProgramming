package chapter3;

/*
If statement:
All salespeople get a payment of $1000 a weeek
 */

import java.util.Scanner;

public class SalaryCalculator {

  public static void main(String args[]){

    //Initializeknown values
    int salary = 1000;
    int bonus = 250;
    int quota = 10;

    //Get values for the unknown
    System.out.println("how many did the employee make this week");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    scanner.close();

    //Quick detour for the bonus earners
    if(sales > quota){
      salary = salary + bonus;
    }

    //OutPut
    System.out.println("the employee's pay is:"+salary);

  }


}
