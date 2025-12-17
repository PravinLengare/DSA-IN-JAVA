package Arrays;

public class basic {
    public static void main(String[] args) {

        System.out.println("I am Pravin Lengare and starting my data structures journey");
        int [] arr = new int[4];
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 4;

        System.out.println("The output of array is :");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // if we have to access 3 element from array when we don't know the index of it.
        int index = -1;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 3){
                index = i;
                break;
            }
        }
        System.out.println("The index is = "+index);


    }

}
