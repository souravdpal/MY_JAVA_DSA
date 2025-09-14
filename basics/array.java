public class array {
    public static void main(String[] args) {
        // arrays are method to store changing and diffrent data of same kind in one
        // storage like a list

        /*
         * format for array making
         * 
         * type[]arrayname=new type[arraySize]
         */

        int[] firstarray = new int[2]; // we can store 2elements now its robust metod to store so memory will be saved
        // adding data in array is simple
        firstarray[0] = 9;
        firstarray[1] = 8;
        // rember array start from zero especailly in java
        System.out.println("we will print 8 means  index 1 we stored it :  " + firstarray[1]);
        // 1 integer is of 4 byte and for 3 2 integer we used 2x4=8bytes of data

        // now making a predefined array where we already put some data

        int[] dataarr = { 3, 4, 5, 6, 6, 7 };
        // we can take all data one by one like above or use for loop

        for (int i = 1; i < dataarr.length; i++) {
            // .length function return the length of array
            System.out.println("the index :" + i + "has the number assigend :" + dataarr[i]);
            // we can also add condition break loops when xyz condition matched so yea its
            // called linear search
        }

    }

}
