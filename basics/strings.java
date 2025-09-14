public class strings {
    public static void main(String[] args) {
        // string are charcaters which can have spaces and its type and it can store
        // anything it have diffrent and its own functions and operations for itself

        String whoami = "i am sourav";

        // first we can loop and print each char of string using loop like arrays

        for (int i = 0; i < whoami.length(); i++) {
            System.out.println(whoami.charAt(i));

            // now how we use String in if and else

            if (whoami.compareTo("i am sourav") == 0) {
                System.out.println("both strings are same ");

                //comares to comare the unicode of the charcater so   ==0 comapres if they are same 

                /*
                 * but if you do  <0 or >0  that means +ve or -ve means  x.compareTO(y) is bigger or lesser and 
                 * to imp things notice is they dont cheq any length or sequnce but they cheq the unicode so as per java unicode
                 * 
                 * A ->> Z   //the value increase so  Z is always greater than A 
                 * 
                 * but  ->>  z is always more greater than Z  //that's how java prefer stuff 
                 */

            }

            //examples 
           if("Zebra".compareTo("z")<0){ //it will always return true becyse  z is bigger value of unicode starting letter no matter the word
            System.out.println(true);
           }else{
            System.out.println(false);
           }
        }

        //now substrings its a part of string means we can break some xyz part of string from bigger string

        System.out.println("my name is " + whoami.substring(5) );  //syntax =>  whoami.substring(start,end)

      /*
       * and yes one most imp stuff which i know you will confuse soon is that why i didnt take  "sourav"=="Sourav"
       * in if and else conditions right? 
       * becuse in java unlike python many times this method fails it can work now but soon it wont work so best practice is to use comapreTO
       * 
       */
    }

}
