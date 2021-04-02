import java.util.Locale;
import java.util.Scanner;

public class For_Loop {//
//*************************   Program -1   *******************************

    //Print any 10 number between enter first number and second number
    public void print_Any_10_Number() {//instance method

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("*****************************Program -1*****************************");
        System.out.println("Enter Number First");
        int numberFirst = scanner.nextInt();
        System.out.println("Enter Number Last");
        int numberLast = scanner.nextInt();
        System.out.println("Below Printed 10 number as per requirement");
        for (int i = numberFirst; i < numberLast; i++)
        //This for loop for print any 10 numbers between  given by user
        {
            System.out.println(i);
        }
    }
//**************************  Program -2   *************************

    //print sequence fibonacci number

    public static void fibonacciSequence() {
        int a = 0;
        int b = 0;
        int c = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("*****************************Program -2*****************************");
        System.out.println("Enter Number to find out fibonacci series");
        int Number = scanner.nextInt();
        System.out.println("Fibonacci Series" + " ");
        for (int i = 1; i <= Number; i++)//This loop for print fibonacci series enter any number by user
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
    }
//**************************  Program -3   *************************

    //programme to check input number is prime ya not
    public void prime_number_ya_not() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("**************************  Program -3   *************************");
        System.out.println("Enter Number for find out number is prime ya not");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++)//This for loop to check whether input number is prime ya not
        {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " " + "Number is prime number");
            //Prime number that is divisible only by itself and 1
        } else {
            System.out.println(number + " " + "Number is not prime number");
        }
    }

//**************************  Program -4   *************************

    //This program to print reverse number
    public void reverse_Number() //instance method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("**************************  Program -4   *************************");
        System.out.println("Enter number for find out that number reverse ");
        int number = scanner.nextInt();
        int reverse = 0;
        for (; number != 0; number = number / 10)//This for loop check the reverse number
        //we have not to mention initialization part of the for loop
        {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
        }

        System.out.println("The reverse of the number is:" + " " + reverse);
    }
//**************************  Program No 5   *************************

    //This program for finding factorial number
    public static void factorial_Number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("**************************  Program No -5   *************************");
        System.out.println("Enter any number to find out that number factorial");
        int number = scanner.nextInt();
        long factor = 1;
        for (int i = 1; i <= number; i++) //This for loop for find out factorial number
        {
            factor = factor * i;
        }
        System.out.println("Factorial is :" + " " + factor);
    }
//**************************  Program No 6   *************************

    //Display sum of n natural Number
    public void sum_Of_N_Natural_Number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 6   *************************");
        System.out.println("Enter any positive number to find out that number sum");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++)//This for loop find sum
        {
            sum = sum + i;//sum calculation
        }
        System.out.println("sum of the first" + " " + num + " " + "number is :" + " " + sum);
    }

    //**************************  Program No 7   **********************

    //Making calculator using switch case
    public static void making_calculator_using_Switch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 7   *************************");
        System.out.println("Enter two number:" + " ");
        //double data type use  because user can use integer as well as float
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("Enter operator (+, -, /, *):");
        char operator = scanner.next().charAt(0);

        double result = 0.0;
        switch (operator)//use switch to make calculator
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;

            default:
                System.out.println("Error! incorrect operator");//operator does not match
        }
        System.out.println(first + " " + operator + " " + second + " " + "=" + " " + result);
    }


    //**************************  Program No 8   **********************

    // This program that print the sum of a x ranging from 1 to 20
    public void print_Sum() //instance method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 8   *************************");
        System.out.println("Enter any number from 1 to 20 find out that number sum" + " ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) //Print sum of between 1 to 20
        {

            sum = sum + i;
            System.out.println("Sum after adding " + " " + i + " " + "is" + " " + sum);
        }
        {
            System.out.println("Sum of all number till" + " " + number + " " + "is :" + " " + sum);
        }
    }

    //**************************  Program No 9   **********************

    //Number 1 to 100 between divided by 3 and 5 separately
    public static void number_divided_By_3_And_5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 9   *************************");
        System.out.println("Enter number to find out between numbers is divided by 3");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) //This foe loop find out divided by 3 number
        {
            if (i % 3 == 0)//Number divided by 3

                System.out.print(i + ",");

        }
        System.out.println("");
        System.out.println("Enter number to find out between that numbers is divided by 5 ");
        int number1 = scanner.nextInt();
        for (int i = 1; i <= number1; i++) //This foe loop find out divided by 5 number
        {
            if (i % 5 == 0)//Number divided by 5

                System.out.print(i + " ,");
        }
 }

    //**************************  Program No 10   **********************

    //Print multiplication table for any number
    public void multiplication_Table_For_Any_Number()//instance method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 10   *************************");
        System.out.println("Enter any number for multiplication table" + "");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++)//Write any number for multiplication table
        {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }

    //**************************  Program No 11   **********************

    //any string input and count total number of 'a' in that string
    public static void enter_String_And_Count_Total_Number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 11   *************************");
        System.out.println("Enter a string value");
        String str = scanner.nextLine();
        System.out.println("Enter a character value to find");
        char toCheck = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) //Check all string character
        {
            if (str.charAt(i) == toCheck) //Check with user enter string all character with enter character
            {
                count++;//Store user enter character number
            }
        }
        System.out.println("Total character is " + count);
    }

    //**************************  Program No 12   **********************

    //Find out sum of numbers between a & b which are divisible by 9 . User should be able to input
// starting number a and end number b
    public static void divisible_By_9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 12   *************************");
        System.out.println("To find out between enter numbers divided by 9 :");
        System.out.println("Enter A number");
        int a = scanner.nextInt();
        System.out.println("Enter B number");
        int b = scanner.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++)//a and b between number divided 9
            if (i % 9 == 0) {
                sum += i;

                System.out.println(i + " ");
            }
        System.out.println("This is sum of number divided by 9 =  " + sum);
    }

    //**************************  Program No 13   **********************

    //Find out min & maximum numbers from 3 user enters
    public void find_Min_Maximum_Number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 13   *************************");
        System.out.println("Enter 3 number to find out maximum number and minimum number");
        System.out.println("Enter number 1");
        int number = scanner.nextInt();
        System.out.println("Enter number 2");
        int minimum = scanner.nextInt();
        System.out.println("Enter number 3");
        int maximum = scanner.nextInt();
        for (int i = 0; i <= number; i++)//This for loop for find out minimum and maximum number
        {
            if (number < minimum) {
                minimum = number;
            }
            if (number > maximum) {
                maximum = number;
            }


        }
        System.out.println("Maximum Number is : " + " " + maximum);
        System.out.println("Minimum Number is : " + " " + minimum);

    }

    //**************************  Program No 14   **********************
    public static void find_Average_And_Sum_Of_Between_Two_Number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 14   *************************");
        System.out.println("Enter two number to find average and sum of between numbers");
        System.out.println("Enter starting number");
        int startingNumber = scanner.nextInt();
        System.out.println("Enter ending number");
        int endingNumber = scanner.nextInt();
        double sum = 0;
        double average = 0;
        double loopCount = 0;
        for (int i = startingNumber; i <= endingNumber; i++)//This for loop find out sum and average number
        {
            sum = sum + i;
            loopCount = endingNumber - startingNumber;//total number for division sum
            average = sum / loopCount;//Check the average
        }
        System.out.println("Sum is :" + " " + sum);
        System.out.println("Average is :" + " " + average);
    }
//**************************  Program No 15   **********************//

    //Print the triangular pattern

    public static void print_Triangular_Pattern() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//**************************  Program No 15   *************************");
        System.out.println("Enter row number for print triangular");
        int rowNo = scanner.nextInt();

        for (int i = 1; i <= rowNo; i++)//Outer loop for rows
        {
            for (int j = 1; j <= i; j++)//Inner loop for columns
            {

                System.out.print("*");//print *

            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }

    }

    public static void main(String[] args) {
        For_Loop for_loop = new For_Loop();//object create for instance method call to static method


        // Program N0 1
        for_loop.print_Any_10_Number();//instance method to call

        //Program NO 2
        fibonacciSequence();

        //Program NO 3
        for_loop.prime_number_ya_not();//instance method to call

        //Program  NO 4
        for_loop.reverse_Number();//instance method to call

        //Program N0 5
        factorial_Number();

        //Program N0 6
        for_loop.sum_Of_N_Natural_Number();//instance method to call

        //Program N0 7
        making_calculator_using_Switch();

        //Program N0 8
        for_loop.print_Sum();//instance method to call

        //Program N0 9
        number_divided_By_3_And_5();

        //Program N0 10
        for_loop.multiplication_Table_For_Any_Number();//instance method to call

        //Program N0 11
        enter_String_And_Count_Total_Number();

        //Program N0 12
        divisible_By_9();

        //Program No 13
        for_loop.find_Min_Maximum_Number();//instance method to call

        //Program No 14
        find_Average_And_Sum_Of_Between_Two_Number();

        //Program No 15
        print_Triangular_Pattern();
    }
}
