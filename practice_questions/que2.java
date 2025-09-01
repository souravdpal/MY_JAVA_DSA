
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        System.err.print("Enter you number");
        Scanner scanner  = new Scanner(System.in);
        int n  = scanner.nextInt();
        int lim  = 10;
        for(int i=1;i<lim+1;i++){
            System.out.println(n*i);
        }
        String val = "";
        List<Integer>build=new ArrayList<>(Arrays.asList(2,3,5,7,11));
        for(int i=0 ; i<build.size();i++){
            if(n%build.get(i)==0 && n%build.get(i)!=0 && n!=build.get(i)){
                val ="not prime";
              System.err.println("your number is :" + val);
              break;
                

            }else{
                val ="prime";
              System.err.println("your number is :" + val);
              break;

            }
            
        }
       
    }
}
