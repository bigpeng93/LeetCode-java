package Tree.Traversal.BinaryTreeLevelOrderTraversal;

import Tree.TreeNode;

import java.util.*;

public class Main {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if (root == null) {
            return resultList;
        }

        List<Integer> levelStorage = new LinkedList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        queue.offer(null);
        while (queue.size() > 1) {
            TreeNode top = queue.poll();
            if (top == null) {
                resultList.add(levelStorage);
                queue.offer(null);
                levelStorage = new LinkedList<Integer>();
            } else {
                levelStorage.add(top.val);
                if (top.left != null) {
                    queue.offer(top.left);
                }
                if (top.right != null) {
                    queue.offer(top.right);
                }
            }
        }
        resultList.add(levelStorage);

        return resultList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> lists = levelOrder(root);
        for (List<Integer> list : lists){
            for (Integer i : list){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
