
import java.util.Scanner;




public class que  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  number!");
        int  num1  =  scanner.nextInt();
        String val  =  "";
     

        if(num1%2==0){
            val = "even" ;
        }else{
            val  = "odd";
        }

        String  let_cheq = Integer.toString(num1);
        if(let_cheq.length()==2){
            let_cheq = "-ve";

        }else{
            let_cheq="+ve";
        }


        System.err.println("Your number is : " + val + "and " + let_cheq);
    }
    
}
