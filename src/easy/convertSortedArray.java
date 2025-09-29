package easy;

public class convertSortedArray {
    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }}

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return sortedArrayToBSTSolver(nums, 0, nums.length -1);
    }
    //{10,-5,-3,0,5,8,9};

    public TreeNode sortedArrayToBSTSolver ( int[]nums, int left, int right){
        if(left>right) return null;
        int midPoint = left + (right - left) /2;
        TreeNode node = new TreeNode(nums[midPoint]);
        node.left= sortedArrayToBSTSolver(nums, left, midPoint-1);
        node.right= sortedArrayToBSTSolver(nums, midPoint +1, right);

        return node;
    }
}
