package anonymClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Lambda
//        FuncInterface funcInterface = (num1,num2 )-> num1+num2;
//
//        System.out.println(funcInterface.abstractMethod(5, 4));


//        TestService testService = new TestService() {
//            @Override
//            public void getEvenAndOddNumber(int number) {
//                if (number % 2 == 0){
//                    System.out.println(" jup san");
//                }else {
//                    System.out.println("tak san");
//                }
//            }
//        };
//        System.out.println("Write number: ");
//        testService.getEvenAndOddNumber(new Scanner(System.in).nextInt());
//

        TestService testService = number -> {
            if (number % 2 == 0){
                    System.out.println(" jup san");
                }else {
                    System.out.println("tak san");
                }
            };

        System.out.println("Write number: ");
        testService.getEvenAndOddNumber(new Scanner(System.in).nextInt());
        }
    }

