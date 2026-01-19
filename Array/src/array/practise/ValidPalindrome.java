package array.practise;

public class ValidPalindrome {
    private static boolean  check(String s) {
        s = s.trim();
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            char st = s.charAt(i);
            char en = s.charAt(j);
            if(Character.isLetterOrDigit(st)){
                i++;
                continue;
            }
            if (Character.isLetterOrDigit(en)){
                j--;
                continue;
            }
            if (Character.toLowerCase(st)!=Character.toLowerCase(en)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void print(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            char st = s.charAt(i);
            char en = s.charAt(j);
            if (Character.isDigit(st)){
                i++;
                continue;
            }

            else if (Character.isDigit(en)){
                j--;
                continue;
            }
            else {
                System.out.println(st +" "+ en);
            }

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String s = "A man12, a plan, a canal: Panama";
        System.out.println(check(s));
        print(s);
    }


}
