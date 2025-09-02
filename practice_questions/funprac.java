import  java.util.Scanner;

public class funprac {
    public static int  sum(int num1 , int num2 ){
        return num1+num2;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your first number :  ");
        int a  = sc.nextInt();
         System.out.print("Enter your Second number :  ");
        int b  = sc.nextInt();
        int   res = sum(a,b);
        System.err.println(res);


        
    }
}
