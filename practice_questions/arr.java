public class arr {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            int k = n - i-1;
            for (int j = 1; j <= k+1; j++) {
                System.out.print("*");
            }
            if (k != 1) {
                System.out.println("");
            }
            if (k == 1) {
                for (int l = 0; l <= n; l++) {
                    int f = n - (n - l);
                    for (int o = 1; o <= f; o++) {
                        System.out.print("*");

                    }
                    System.out.println("");
                }
                break;
            }

        }
    }

}
