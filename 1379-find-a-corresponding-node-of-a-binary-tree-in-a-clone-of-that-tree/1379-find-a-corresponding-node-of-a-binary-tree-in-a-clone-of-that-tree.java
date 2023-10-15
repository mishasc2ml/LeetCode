/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned.right == null && cloned.left == null) {
            return cloned;
        }
        if (cloned.val == target.val) {
            return cloned;
        }
        HashMap<Integer, List<TreeNode>> graph = new HashMap<>();
        graph.put(cloned.val, new ArrayList<>());
        if (cloned.left != null) {
            graph.get(cloned.val).add(cloned.left);
        }
        if (cloned.right != null) {
            graph.get(cloned.val).add(cloned.right);
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.addAll(graph.get(cloned.val));
        while (!queue.isEmpty()) {
            TreeNode popped = queue.poll();
            System.out.println(popped.val);
            if (popped.val != target.val) {
                graph.put(popped.val, new ArrayList<>());
                if (popped.right != null) {
                    graph.get(popped.val).add(popped.right); 
                }
                if (popped.left != null) {
                    graph.get(popped.val).add(popped.left); 
                }
                if (graph.get(popped.val) != null) {
                    queue.addAll(graph.get(popped.val));
                }
            } else {
                return popped;
            }
        }
        return null;
    }
}