public class bubblesorting {

  /*
   *bubble sorting is a sorting method which use a special sorting case
   sorting ! which means aragin the data in a order in very eassy case we take 
   a list of number contaning some random list and try sort 


   but sorting can be of many type but bubble sort does is to sort the arry by cheking the num 
   from its preceding index from itse scusceding index and if  the index of number now is small then index-1  then we will just swap those number 

   time complexity = O(n^2)
   * 
   */
    public static void main(String[]args){
      int[] nums= {1,8,5,7,4,9,2,4};
      for(int i=0;i<nums.length-1;i++){
        for (int j=0; j<nums.length-i-1;j++){
          if(nums[j]>nums[j+1]){
           int preceding  = nums[j];
           int scusceding = nums[j+1];
           nums[j]=scusceding;
           nums[j+1]=preceding;

          }
        }
      }
      for(int num : nums ){
        System.out.println(num);
      }
    }
}
