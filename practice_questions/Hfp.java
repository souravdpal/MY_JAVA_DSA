
public class Hfp {

    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int i = 1;
       // int j = 1;

        for (; i <= r;) {
            for (int j = 4; j>=1; j = j - i) {
                System.out.print("*");
            }
            System.out.println("");
            i++;
        }

    }
}
