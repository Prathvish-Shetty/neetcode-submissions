class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
/*
1. Pretend nums is a linked list.
2. Because there is a duplicate, the linked list contains a cycle.
3. Use slow/fast pointers to find some point inside that cycle.
4. Put one pointer back at the beginning.
5. Move both pointers one step at a time.
6. They meet at the beginning of the cycle.
7. The beginning of the cycle is the duplicate.
*/
