package Loops;

import java.util.Scanner;

public class divisible_by_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print divisible numbers: ");
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }

        }

    }
}
