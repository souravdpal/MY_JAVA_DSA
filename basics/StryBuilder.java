public class StryBuilder {
    public static void main(String[] args) {
        // string builder is method make string but in better way with more flexiblity
        // and features
        /*
         * format : => StringBuilder MYstring = new StringBuilder("");
         */

        StringBuilder myStr = new StringBuilder("i am sourav , hello ;)");
    
        //whithout waste of time lets just see all features 

        System.out.println(myStr.charAt(14));

        //changing a charcater with index 

        myStr.setCharAt(0, 'n');
        myStr.setCharAt(1, 'o');
        System.out.println(myStr);

        //inserting any string inside main string

        myStr.insert(2, ", i ");
        System.out.println(myStr);

        //delte any char or many char

        myStr.delete(0, 3);
        System.out.println(myStr);

        //appending => its diffrent from insert becuse append add at last

        myStr.append(",i love java tho!");
        System.out.println(myStr);

     /*
      * besides there are so many string opps we learn as we grew and work more in java 
      */


   }

}
