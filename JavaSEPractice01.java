package javasepractice01;

import java.util.Scanner;

public class JavaSEPractice01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
                System.out.println(hundredsDigit(input.nextInt()));
                System.out.println(factorial(input.nextInt()));

       
//        ****************************************************************

        //        Exercise One
                System.out.println(exerciseOne(input.nextInt()));
        //        String message = exerciseOne(input.nextInt());
        //        System.out.println(message);
        
//        ****************************************************************

        //        Exercise Two
        //                exerciseTwo(input.nextInt());
        
//        ****************************************************************

        //        Exercise Three        
        //         Method 1
        //        System.out.println(input.next().length());
        //        Method 2
        //        System.out.println(exerciseThree(input.nextInt()));
        
//        ****************************************************************

        //        Exercise Four
        //        System.out.println(exerciseFour(input.nextInt()));
        
//        ****************************************************************

        //        Exercise Five
        //        System.out.println(exerciseFive(123456));
        
//        ****************************************************************

        //        Exercise Six
        /*
         System.out.print("Enter an integer:\t");
         int num = input.nextInt();
         if (exerciseSix(num)) 
         System.out.printf("%d is Perfect!\n", num);
         else 
         System.out.printf("%d is Not Perfect!\n", num);
         */
        
//        ****************************************************************

        //        Exercise Seven
        /*
         int num = input.nextInt();
         if (exerciseSeven(num)) {
         System.out.printf("%d is Prime!",num);
         } else {
         System.out.printf("%d is Not Prime!",num);
         }
         */
        
//        ****************************************************************

        //        Exercise Eight
        /*
         int sum = 0, start = 1;
         while (start < 1000) {
         if (start % 3 == 1) {
         sum += start;
         System.out.println(start);
         }
         start++;
         }
         System.out.printf("Sum:\t%d", sum);
         */
        
//        ****************************************************************

        //        Exercise Nine
        //        System.out.println(exerciseNine(input.nextInt()));
        
//        ****************************************************************

        //        Exercise Ten
        //        exerciseTen(10);
        
//        ****************************************************************

        //        Exercise Eleven
        //        exerciseEleven(4);
        
//        ****************************************************************

        //        Exercise Twelve
        //                exerciseTwelve(4);
        
//        ****************************************************************

        //        Exercise Thirteen
        //        System.out.println(exerciseThirteen(input.nextDouble()));
        
//        ****************************************************************

        //        Exercise Fourteen
        //        System.out.println(exerciseFourteen(input.nextDouble(), input.nextDouble()));
    }

//        ****************************************************************

    public static String exerciseOne(int value) {

        if (value >= 1000) {
            return "High!";
        } else {
            return "Low!";
        }

    }

//        ****************************************************************
    
    public static void exerciseTwo(int value) {

//        Method One
        for (int i = value; i <= 2 * value; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        //        Method Two
        if (value % 2 == 0) {
            for (int i = value; i <= 2 * value; i += 2) {
                System.out.println(i);
            }
        } else {
            for (int i = value + 1; i <= 2 * value; i += 2) {
                System.out.println(i);
            }
        }

    }

//        ****************************************************************
    
    public static int exerciseThree(int value) {

//        Method One
        int counter = 0;
        while (value > 0) {
            value /= 10;
            counter++;
        }
        return counter;

//        Method Two
        /*
         int i = 0;
         for (; value > 0; i++) {
         value /= 10;
         }
         return i;
         */
    }

//        ****************************************************************
    
    public static int exerciseFour(int value) {

        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

//        ****************************************************************
    
    public static int exerciseFive(int value) {

        int reverse = 0;
        for (int i = 0; value != 0; i++, value /= 10) {
            reverse = reverse * 10 + value % 10;
        }
//        Printing at once.
        /*
         while (value != 0) {
         System.out.print(value % 10);
         value /= 10;
         }
         */
        return reverse;
    }

//        ****************************************************************
    
    public static boolean exerciseSix(int value) {

        int divisor = 0;
        for (int i = value / 2; i > 0; i--) {
            if (value % i == 0) {
                divisor += i;
            }
        }
        return divisor == value;
    }

//        ****************************************************************
    
    public static boolean exerciseSeven(int value) {

        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

//        ****************************************************************
    
    public static int exerciseNine(int value) {

        if (value < 0) {
            return value * -1;
        } else {
            return value;
        }
    }

//        ****************************************************************
    
    public static void exerciseTen(int value) {

        for (int i = 1; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("1");
            }
            System.out.println("");
        }
    }

//        ****************************************************************
    
    public static void exerciseEleven(int value) {

        int initial = 1;
        System.out.println(initial);
        for (int i = 0; i < value; i++) {
            System.out.println(initial *= 10);
        }

        /*
         int initial = 1;
         for (int i = 0; i <= value; i++, initial = 1) {
         for (int j = 0; j < i; j++) {
         initial *= 10;
         }
         System.out.println(initial);
         }
         */
        /*
         for (int i = 0; i <= value; i++) {
         System.out.println((int) Math.pow(10, i));
         }
         */
    }

//        ****************************************************************
    
    public static void exerciseTwelve(int value) {

        System.out.println("111111");
        for (int i = 0; i < value - 2; i++) {
            System.out.println("1****1");
        }
        System.out.println("111111");
    }

//        ****************************************************************
    
    public static double exerciseThirteen(double x) {

        double y = Math.pow(x, 4) - 12 * Math.pow(x, 3) + 13 * Math.pow(x, 2) + 11;
        return y;
//        return Math.pow(x, 4) - 12 * Math.pow(x, 3) + 13 * Math.pow(x, 2) + 11;
    }

//        ****************************************************************
    
    public static double exerciseFourteen(double x, double y) {

        double perimeter = (x + y) * 2;
        return perimeter;
        //        return x * y;
    }
    
//        ****************************************************************

    public static int maxDigit(int a) {

        int max = 0;
        a = Math.abs(a);

        while (a != 0) {

            if (max < a % 10) {
                max = a % 10;
            }
            a /= 10;
        }
        return max;
    }
    
     /**
 * This method returns the hundreds digit of the input number.
 * @param number The number to find the hundreds digit of.
 * @return The hundreds digit.
 */
    public static int hundredsDigit(int number) {

        if (number < 100) {
            return 0;
        } else {
            for (int i = 0; i < 2; i++) {
                number /= 10;
            }
            return number % 10;
        }
        /*
        String s = String.valueOf(number);
        return s.charAt(s.length() - 3) - '0';
         */
    }
    
     /**
     * This method calculates the factorial of n.
     * @param n The number to calculate the factorial of.
     * @return The factorial of n.
     */
    public static long factorial(int n) {

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
