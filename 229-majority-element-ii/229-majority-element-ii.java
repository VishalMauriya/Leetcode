class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        int len = nums.length;
        
        for(int element : nums){
            
            if(element == num1)
                count1++;
            else if(element == num2)
                count2++;
            else if(count1 == 0){
                num1 = element; count1 = 1;
            } else if(count2 == 0){
                num2 = element; count2 = 1;
            } else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        count1 = 0;
        count2 = 0;
        
        for(int element : nums){
            if(element == num1)
                count1++;
           else if(element == num2)
                count2++;
        }
        
        if(count1 > len / 3) {
            ans.add(num1);
        }
        if(count2 > len / 3) {
            ans.add(num2);
        }
        
        return ans;
    }
}