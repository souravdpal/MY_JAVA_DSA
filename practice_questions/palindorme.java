
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.VariableElement;

public class palindorme {
    public static void main(String[] args) {
        String  pal = "madam";
       
        List <VariableElement>temp=new ArrayList<>();

        int pal_len  =0;
        if(pal.length()%2==0){
            pal_len = pal.length()/2;
            
        }else{
            pal_len = pal.length()+1/2;
        }
        for(int i =0;i<pal_len;i++){
             var newNum  = pal.charAt(i) ;
                 System.out.println(newNum);
                 temp.append(newNum);
             
        }
        
    }
    
}
