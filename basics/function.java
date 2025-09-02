
import java.util.Scanner;

public interface function {

    public static void PrintName(String name) {
        System.out.println(name);
        
    }

    public static void main(String[] args) {

        //above function is main function  public static shows its main function while void mean it can't return anything and main is its name 
        /*
         1. function store all one by one in stack form each function add on memory as stack above the previous one 
         * basic function structure
         * 
         * RetrunType  functionName (tyepe args1,type args2){
         *    //using args here we will make all stuf we want do in function
         * }
         * 
         * function are good when we have do same stuff many times writing code all time for each we make function call it every time we need 
         */
        //basic  function for printing the name 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name! : ");
        String name = sc.next();
        PrintName(name);
    }

}
