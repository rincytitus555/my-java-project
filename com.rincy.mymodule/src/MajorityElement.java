public class MajorityElement {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> majorElement = new HashMap<Integer,Integer>();

        if (nums.length==1)
            return nums[0];

        int threshold = (nums.length)/2;
        int maxValue = 0;


        for(int i : nums) {

            if(majorElement.get(i)==null) {
                majorElement.put(i,1);
            }

            else {
                int temp = majorElement.get(i);
                temp++;
                majorElement.put(i, temp);
                if(majorElement.get(i) > threshold) {
                    maxValue = i;
                }
            }
        }
        return maxValue;

    }
}
