import java.util.Scanner; //taking input

public class conditions {
    // we will learn conditional statements like if , else , else if => elif of
    // python
    // we will take two number a,b,c we will use condition tell if one a is greter b
    // is greter of they are same
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter you first number : ");
        Integer a = input.nextInt();
        System.out.print("enter your second number! : ");
        Integer b  = input.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }else if (a<b){
            System.out.println("b is greater");
        }else{
            System.out.println("a and b have same value");
        }

    }

}
