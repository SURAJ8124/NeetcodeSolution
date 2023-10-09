//217. Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
/*Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false */

package ArrayandHashing;
import java.util.*;
import org.jetbrains.annotations.NotNull;

public class ContainsDuplicate_FirstProblem {
    //using brute force approch
    public boolean containsDuplicate(@NotNull int nums[]) {
     for(int i=0; i<nums.length; i++){
         for(int j=i+1; i< nums.length; j++) {
             if (nums[i] == nums[j]) {
                 return true;
             }
         }
     }
     return false;
    }
    public boolean containsDuplicateUsingHash(@NotNull int nums[]){
        Set <Integer> hashSet= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(hashSet.contains(nums[i])){
                return true;
            }
            else{
                hashSet.add(nums[i]);
            }
        }
        return false;
    }

    // using hashtable approch

    public static void main(String[] args){
        ContainsDuplicate_FirstProblem object=new ContainsDuplicate_FirstProblem();
         int nums[]={1,2,3,1};
         System.out.println(object.containsDuplicate(nums));
        System.out.println(object.containsDuplicateUsingHash(nums));


    }

}
