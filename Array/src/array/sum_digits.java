package array;

import java.util.Scanner;

public class sum_digits {
    public static int getSum(int n){
        int sum = 0;
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
        else if (n < 0)
            return n = -n;

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
        if (sum == number){
            return true;
        }
      return false;
    }
    public static void main(String[] args) {
        System.out.println("enter a no :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getSum(n));
        System.out.println("Digits count : ");
        System.out.println(countDigits(n));
        System.out.println("Product  : ");
        System.out.println(proSum(n));
        System.out.println("Armstrong number  : ");
        System.out.println(armStrong(n));



    }


}
