import java.util.Arrays;

public class pluseone {
     public static int[] PluseOne(int[] digits) {
        int[] newarr = new int[digits.length+1];

        //case one simple last digit less than nine
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }else if(digits.length==1 && digits[0]==9){
            newarr[0]=1;
            newarr[1]=0;
            return newarr;
        }
        for(int j=digits.length-1;j>=0;j--){
            if(digits.length-1==j){
                digits[j]= 0;
            }else if(j==0){
                if( digits[1]!=0){
                    return digits;
                }else if (digits[0]==9 && digits[1]==0){
                    digits[0]=1;
                    newarr[newarr.length-1]=0;
                    for(int s=0 ; s<digits.length;s++){
                        newarr[s]=digits[s];
                    }
                    return newarr;
                }else if(newarr[0]<9){
                    digits[0]=digits[0]+1;
                    
                }
    
            }else if(j!=0 && j!=digits.length-1){
                if(digits[j+1]==0 && digits[j]==9){
                    digits[j]=0;
                }else if (digits[j+1]==0&&digits[j]<9){
                    digits[j]=digits[j]+1;
                
                }else{
                    return digits;
                }

            }
            
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] substrings = {8,9,9};
        int[] a = PluseOne(substrings);
        System.out.println(Arrays.toString(a));
    }
}
