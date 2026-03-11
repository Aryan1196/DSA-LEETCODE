class Solution {

    int postIndex;
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        for(int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        return helper(postorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] postorder, int left, int right){

        if(left > right) return null;

        int val = postorder[postIndex--];
        TreeNode root = new TreeNode(val);

        int index = map.get(val);

        root.right = helper(postorder, index + 1, right);
        root.left = helper(postorder, left, index - 1);

        return root;
    }
}