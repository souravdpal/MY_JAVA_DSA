public class arrays2D {
    public static void main(String[] args) {
        /*
         * 2D arrays is same as normal just its now become a matrix
         * To know matrix better ai-ml repo numpy has better undertanding but in maths
         * matrix consider of rowXcolumn and using them like in sql or anywhere we can
         * find position of the elment in matiz
         * like r=9 and c=8 => give us a perticular elemnt
         * further matrix can be a tensor which is three D array but if same as 2D
         * 
         * 
         * format :
         * type[][]arrayname = new type[row][column];
         * 
         */

        int[][] array2d = new int[2][2]; // 2X2 matrix => we can store 4 elemnts
        array2d[0][0] = 9;
        array2d[0][1] = 0;
        array2d[1][1] = 4;
        array2d[1][0] = 8;

        System.out.println(array2d[0][0]);
        System.out.println(array2d[1][0]);
        System.out.println(array2d[0][1]);
        System.out.println(array2d[1][1]);

    }

}
