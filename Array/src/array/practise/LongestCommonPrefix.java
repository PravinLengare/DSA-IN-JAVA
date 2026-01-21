package array.practise;

public class LongestCommonPrefix {
    public static String returnLongestCommPrefix(String[]strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        for(int i = 0 ; i < strs[0].length() ; i++){
            char currChar = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length ; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != currChar){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String []arr ={"flower","flower","flow"} ;

//        String ans = "";
//        for (int i = 0; i < arr.length; i++) {
//
//            char first = arr[0].charAt(i);
//            char second = arr[1].charAt(i);
//            char third = arr[2].charAt(i);
//            System.out.println(first+ " "+second +" "+third);
//            if (first == second && second == third){
//                ans += first;
//            }
//        }
        System.out.println(returnLongestCommPrefix(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
