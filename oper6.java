import java.util.*;
class oper6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the a value:");
        int num = obj.nextInt();
        if(num>0)
        {
           System.out.print("positive number"); 
        }
        else if(num<0)
        {
            System.out.print("negative number");
        }
        else
        {
            System.out.print("zero");
        }
}
}