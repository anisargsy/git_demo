package itproger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* System.out.println("Variables and Data type");
        int age = 24;
        System.out.println("Age: " + age + ".");
        age = 35;
        System.out.println(age);*/

       /* byte age = 127; // 1b
        short num1 = 128; // 2b
        int num2 = 850; // 4b
        long num3 = 4567; // 8b

        float num4 = 4.69f;
        double num5 = 5.55555;


        char ch = '4';
        String user_name = "Ani";
        System.out.println(user_name);

        boolean isHappy = true;*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String user_name = scan.next();
        System.out.println("Hello " + user_name);*/


       /* System.out.println("Enter your favorite number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your favorite number: " + num1);
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();*/

        /*Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1= scan.nextFloat();

        System.out.print("Enter second number: ");
        float num2= scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        float res5 = num1 % num2;


        System.out.println("Result: ");
        System.out.println(res1 +"\n" + res1 +"\n" + res2 +"\n" + res3 +"\n" + res4 +"\n" + res5);
        */


        //Condition constructor if-else
  /*      int a = 15, b = 10;
        char sym1 = 'A', sym2 = 'A';
        boolean isHasCar = true;
        if (isHasCar && a == b) {
            System.out.println("Yes, right!");
        } else if (a >= b) {
            System.out.println("Second Test");

        } else {
            System.out.println("No is wrong!");

        }*/


        /*Scanner scanner = new Scanner(System.in);
        System. out.print("Enter role: ");
        String role = scanner.nextLine();

        System.out.print("Enter your pass: ");
        String pass = scanner.nextLine();

        if (role.equals("Admin") && pass.equals("12345")){
            System.out.println("All users");
        } else {
            System.out.print("Hello, what is your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);
        }*/

        /*// Condition constructor Switch-case
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1: ");
                break;

            case 2:
                System.out.println("Number is 2: ");
                break;

            case 5:
                System.out.println("Number is 5: ");
                break;
            default:
                System.out.println("Be Happy: ");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        int num = scanner.nextInt();

        System.out.print("Enter 2 number: ");
        int num1 = scanner.nextInt();


        int res;

        System.out.print("Action: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num + num1;
                System.out.println("Result: " + res);
                break;

            case "-":
                res = num - num1;
                System.out.println("Result: " + res);
                break;

            case "*":
                res = num * num1;
                System.out.println("Result: " + res);
                break;

            case "/":
                if (num1 == 0) {
                    System.out.println("Error");
                } else {
                    res = num / num1;
                    System.out.println("Result: " + res);

                }
                break;
            default:
                System.out.println("You enter invalid date");
        }*/

        // Loop
//        for (float i = 100; i > 10; i /= 2 ) {
//            System.out.println("Element " + i);
//        }

//        int i = 100;
//        while (i > 10) {
//          System.out.println("Elements " + i);
//            i -= 20;
//
//    }

//        int i = 0;
//        do {
//            System.out.println("Elements " + i);
//            i ++;
//        }
//        while (i < 10);

/*        for (int i = 5; i < 25; i += 2) {

            if (i % 3 == 0)
                continue;

            if (i >= 17)
            break;


            System.out.println("Elements " + i);
        }*/


        //Array
/*        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 15;
        nums[2] = 20;
        nums[3] = 25;
        nums[4] = 30;
        int res = nums[1] + nums[0];
        System.out.println(res);

        float[] nums1 = new float[]{10.2f, 10, 2.6f, 5.6f};


        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Element : "nums1[i]);
        }*/

/*        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }


        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println("Minimal: " + min);*/

        //collection in JAVA
/*        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(0, 30);

//        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
//        numbers.clear();

        for (Integer el : numbers) {
            System.out.println(el);
        }*/

      /*  LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(5.6f);
        numbers.add(5.6f);

        for (Float el: numbers){
            System.out.println(el);
        }
*/
        //Methods in Java
/*        info("Test");
        info("Test2");
        info("Test3");*/
/*
        short num = 7;
        int result1 = summa((short) 1, num);


        short num1 = 30;
        int result2 = summa((short) 11, num1);
        info(String.valueOf(result2));
    }

    public static int summa(short a, short b) {
        int res = a + b;
        String result = "Result: " + res;
        info(result);
        return res;

    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");*/

        int[] number = new int[]{10, 20, 30};
        int averageResult = averageArray(number);
        System.out.println(averageResult);


    }

    public static int averageArray(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum / arr.length;
    }
}
