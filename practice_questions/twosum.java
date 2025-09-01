
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twosum {

    public static void main(String[] args) {
        /* */
        int target = 9;
        List<Integer> nums = List.of(2, 7, 11, 15);
        Set<List<Integer>> res = new HashSet<>();
        int index = 0;
        int nest_index = 0;
        for (; index < nums.size(); index++) {
            System.out.println(nums.get(index) + "of index " + index);
            for (; nest_index < nums.size(); nest_index++) {
                System.out.println(nums.get(nest_index));
                if (nest_index == index) {
                    if (index == nums.size() - 1) {
                        System.out.println(res);
                        return;
                    }
                    nest_index++;
                }
                int upperIndx = nums.get(index);
                int lowerIndx = nums.get(nest_index);
                System.out.println(upperIndx + lowerIndx);
                int target_m = upperIndx + lowerIndx;
                if (target == target_m) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(index);
                    temp.add(nest_index);
                    Collections.sort(temp);
                    if(!res.contains(temp)){
                        res.add(temp);
                    }
                    
                    


                    

                }

            }
            nest_index = 0;

        }

    }
}
