
public class rombhus {

    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        String track = "no";
        int i = 1;
        for (; i <= n; i++) {

            for (int sp = 1; sp <= space; sp++) {
                System.out.print(" ");

            }
            for(int st =1;st<=n;st++){
                System.out.print("*");

            }
            System.out.println("");
            space=space-1;



        }
    }
}
