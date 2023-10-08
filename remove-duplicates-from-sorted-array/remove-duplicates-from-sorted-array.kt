class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        // 0,0,1,1,1,2,2,3,3,4
        // 0,1,2,3,4,2,2,3,3,4
        var k = 0
        for(i in 1 until nums.size){
            if(nums[i] != nums[i-1]){
                k++
                nums[k] = nums[i]  
            } 
        }
        
        return k+1
        
    }
}