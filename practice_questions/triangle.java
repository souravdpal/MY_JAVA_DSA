public class triangle {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<=n;i++){
            int k = n-(n-i);
            for(int j=0;j<=k;j++){
                System.out.print("*");
            }
            System.out.println("  ");

        }
    }
}
