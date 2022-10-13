package automationbasic;

import java.util.Scanner;

public class ScannerClassPro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first no ");
       int firstNumber = scanner.nextInt();
        System.out.println("Enter the second no ");
       int scecondNumber = scanner.nextInt();
        System.out.println("Enter the operator");
       String operator = scanner.next();

       if(operator.equals("+")){

       }
       else if(operator.equals("-")) {

       }
       else{

       }

       switch (operator){ // $

           case "+":
               int out=firstNumber + scecondNumber;
               break;
           case "-":
               break;
           default:
       }




    }


}
