public class factorial {
    public  static  int fact(int n ){
        int  r  = 1;
        int i  = 0;
        while (i<n){
            int p = n-i;
            r=r*p;
            i++;
        }
        return r ;

    }
    public static void main(String[] args) {
        int n = 5;
        int res = fact(n);
        System.out.println(res);
        
    }
    
}
