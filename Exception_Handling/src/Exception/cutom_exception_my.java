package Exception;

import java.util.Scanner;

class MyException_ extends Exception{
    MyException_(String msg){
        super(msg);
    }
}
public class cutom_exception_my {
    public static void invalidateAttendance(int attendance) throws MyException_{
        if (attendance <= 75){
            throw new MyException_("This student is defaulter !! the attendance should be greater than 75");
        }
        System.out.println("The attendance is : "+attendance);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the attendance of student : ");
        int attendance = s.nextInt();
        try {
            invalidateAttendance(attendance);
        }
        catch (MyException_ e){
            System.out.println(e.getMessage());
        }
    }
}
