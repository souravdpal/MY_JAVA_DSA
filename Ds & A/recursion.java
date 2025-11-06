public class recursion {



    public static void  numprint(int a ){
        if(a<=0){
            return;
        }
        System.out.println(a);
        numprint(a-1);

    }
    public static void main(String[] args) {
        /*
         * recursion is like using loops with the help of function calling function again again with a 
         * specfic confition is called recursion 
         * 
         * 
         * the diffrence in recursion and loops is recursion is stack means its more resource heavy it store data 
         * in form of stack 
         * 
         * 
         * loops are fast light a infinite loop never stops not even you laptop  crash but a stack based reacursive loop will give you memory out of bound error 
         * becuse it is in stack form
         * 
         * so for protecting we use a base condition when that happen we terminate the recursive loop
         * 
         * 
         * making most basic recursive loop printing  1-n number in reverse order  
         * 
         * example :  n n-1  n-1
         * 
         * till it reaches 0
          */



       numprint(9);
    }
}
