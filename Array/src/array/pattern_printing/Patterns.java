package array.pattern_printing;

import java.util.Scanner;

public class Patterns {
    public static void printNumber(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void printCharacter(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(( char)(j+64) +" ");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int row){
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(num +" ");
                 num++;
            }

            System.out.println();
        }
    }
    public static void oddNumberTriangle(int row){ // if we don't get the logic then use the extra variable
        for (int i = 1; i <= row ; i++) {
            int odd = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(odd+" ");
                odd = odd + 2;
            }
            System.out.println();
        }
    }
    public static void hollowRectangle(int row,int col){ // if we don't get the logic then use the extra variable
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col){
                    System.out.print("* ");
                }
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
    public static void zeroAndOneTriangle(int row){
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i; j++) {
                 if ((i+j) % 2 == 0){
                     System.out.print("1"+ " ");
                 }
                 else
                     System.out.print("0"+" ");
            }
            System.out.println();
        }
    }
    public static void starPlus(int row){
        //int temp = row/2 + 1;
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= row; j++) {
                 if(i == row - 1 || j == row - 1){
                     System.out.print("* ");
                 }
                 else
                     System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {

            System.out.println("enter the number for the row : ");
            int row = s.nextInt();
            System.out.println("enter the number for the col : ");
            int col = s.nextInt();

            System.out.println("Number printing :");
            printNumber(row);

            System.out.println("Character printing :");
            printCharacter(row);

            System.out.println("Floyd's Triangle :");
            floydTriangle(row);

            System.out.println("Odd number triangle :");

            oddNumberTriangle(row);

            System.out.println("Hollow Rectangle :");

            hollowRectangle(row, col);

            System.out.println("zero and one triangle :");

            zeroAndOneTriangle(row);

            System.out.println("star plus :");

            starPlus(row);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
