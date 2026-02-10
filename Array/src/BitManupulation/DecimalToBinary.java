package BitManupulation;

import static java.util.Collections.reverse;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 8;
        String x = "111";
        System.out.println(decimalToBinary(n));
        System.out.println(binaryToDecimal(x));
    }

    private static int binaryToDecimal(String x) {
        int length = x.length();
        int p2 = 1;
        int num = 0;

        for (int i = length -1 ; i >=  0; i--) {
            if (x.charAt(i)== '1'){
                num += p2;
            }
            p2 = p2 * 2;
        }
        return num;
    }

    private static String decimalToBinary(int n) {
        String res = "";
        while (n != 1){
            if (n % 2 == 1)
                res += "1";
            else
                res += "0";
            n = n/2;
        }
        return res+= "1";
    }
}
