import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        //System.out.println("enter your name"); //if you want it prompt in same line with input you remove ln so it prints in same line 
        System.out.print(" enter your name! : ");
        String name  = input.nextLine(); //reads the input and take it 
        System.out.println(name + " welcome lets learn java together!");

        
    }
}
