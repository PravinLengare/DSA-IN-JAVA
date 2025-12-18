package array;
import java.util.Scanner;

public class sum_digits {
    public static int getSum(int n){
        int sum = 0;
        if (n < 0){
            n = -n;
            while(n > 0){
                int lastDigit =  n % 10;
                sum += lastDigit;
                n = n/10;
            }
            return sum;
        }
        while(n > 0){
            int lastDigit =  n % 10;
            sum += lastDigit;
            n = n/10;
        }
        return sum;
    }
    public static int countDigits(int n){
        if (n == 0)
            return 1;
        else if (n < 0){
            int count = 0;
            n = -n;
            while (n > 0){
                n = n/10;
                count++;
            }
            return count;
        }
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int proSum(int n) {
        int product = 1;
        if (n == 0)
            return 0;

        if (n < 0){
            n = - n;
            while(n > 0){
                int lastDigit = n % 10;
                product *= lastDigit;
                n = n/10;
            }
        }
        while (n > 0){
            int lastDigit = n % 10;
            product *= lastDigit;
            n = n/10;
        }
        return product;
    }
    public static boolean armStrong(int n){
        int k = countDigits(n);
        int sum = 0;
        int number = n;
        while(n > 0){
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit,k);
            n = n/10;
        }
        return sum == n;
    }
    public static int reverseNumber(int n){
        int rev = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        return rev;

    }
    public static boolean palindromeNumber(int n ){
        int revNumber = reverseNumber(n);
        return n == revNumber;
    }
    public static int firstAndLastDigitSum(int n){
        if (n < 0){
            n = -n;
        }
        int lastDigit = n % 10;
        while(n >= 10){
            n = n/10;
        }
        int firstDigit = n;
        return lastDigit + firstDigit;

    }
    public static void evenNumber(int n){
        if (n == 0){
            System.out.println("It is not even or odd");
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
    public static boolean primeNumber(int n){
        if (n <= 0 || n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void factorialNumber(int n){

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial number is "+factorial);
    }
    public static void fibonacciNumber(int n){
        int firstTerm = 0;
        int secondTerm = 1;
        int finalTerm = 0;
        if (n == 1){
            System.out.println(firstTerm);
        }
        System.out.println(firstTerm);
        System.out.println(secondTerm);
        for (int i = 3; i <= n; i++){
            finalTerm = firstTerm + secondTerm;
            System.out.println(finalTerm);
            firstTerm = secondTerm;
            secondTerm = finalTerm;
        }
        System.out.println("The term "+ n + " output : "+finalTerm);
    }
    public static void perfectNumber(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println("This is Perfect Number");
        }
        else
            System.out.println("This is not Perfect Number");
    }
    public static void fibonacciThreeTermsNumber(int n){
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 2;
        if (n == 1){
            System.out.println(firstTerm);
        }
        System.out.println(firstTerm);
        System.out.println(secondTerm);
        System.out.println(thirdTerm);
        int finalTerm = 0;
        for (int i = 4; i <= n ; i++) {
            finalTerm = firstTerm + secondTerm + thirdTerm;
            System.out.println(finalTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = finalTerm;
        }
        System.out.println("The term "+ n + " output : "+finalTerm);
    }
    public static void powerOfNumber(int a,int b){
        float result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println("the result is : "+result);
    }
    public static void main(String[] args) {
        System.out.println("enter a no :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Sum of digits is : ");
        System.out.println(getSum(n));
        System.out.println("Digits count : ");
        System.out.println(countDigits(n));
        System.out.println("Product  : ");
        System.out.println(proSum(n));
        System.out.println("Armstrong number  : ");
        System.out.println(armStrong(n));

        System.out.println("Reverse of a number : ");
        System.out.println(reverseNumber(n));
        System.out.println("Palindrome of a number : ");
        System.out.println(palindromeNumber(n));
        System.out.println("First and Last Digit sum of a number : ");
        System.out.println(firstAndLastDigitSum(n));

        System.out.println("Even numbers : ");
        evenNumber(n);

        System.out.println("Prime number : ");
        System.out.println( primeNumber(n));

        System.out.println("Factorial number is : ");
        factorialNumber(n);

        System.out.println("Fibonacci series is : ");
        fibonacciNumber(n);

        System.out.println("Perfect Number is : ");
        perfectNumber(n);

        System.out.println("Fibonacci series with three terms sum is : ");
        fibonacciThreeTermsNumber(n);

        System.out.println("enter the number and the power to get the ans : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        powerOfNumber(a,b);


    }


}
