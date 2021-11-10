import java.util.ArrayList;
import java.util.List;

public class SumOfThree {

        public List<List<Integer>> threeSum(int[] nums) {

            List<Integer> sum = new ArrayList<>();
            List<List<Integer>> sumList = new ArrayList<>();
            for(int i=0;i<nums.length-1;i++)
            {
                for(int j=1;j<nums.length-2;j++)
                {
                    for(int k=2;k<nums.length-3;k++)
                    {
                        System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                        if(nums[i]+nums[j]+nums[k]==0)
                            sum.add(Integer.valueOf(nums[i]));
                        sum.add(Integer.valueOf(nums[j]));
                        sum.add(Integer.valueOf(nums[k]));

                    }
                }
            }

            sumList.add(sum);
            System.out.println(sumList);
            return sumList;


    }
}
