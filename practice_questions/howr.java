
public class howr {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int row = 4;
        int c = 5;
        for (; i <= row;i++) {

            if (j == 1 || i==4) {
                j=1;
                for (; j <= c;) {
                    System.out.print("*");
                    // System.er.println(j);
                    j++;

                }
                System.out.println("");
            } else {
                int p =  1;
                 int  nR = row-1 ;
                while(p<=c){
                    if(p==1 || p==c){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    p++;
                    

                }
                System.out.println("");
            }
             
        }

    }
}
