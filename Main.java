// Class 
class TreeNode {
    int value;
    TreeNode left, right;

    // Constructor 
    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class Main {
    // Fungsi utama dan rekursif pencarian lca
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null)
            return null;

        if (root == p || root == q)
            return root;

        // subtree kiri
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // subtree kanan
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Kalau dua-duanya ketemu, berarti root sekarang adalah LCA
        if (left != null && right != null)
            return root;

        // Kalau cuma salah satu yang ketemu
        return (left != null) ? left : right;
    }

    // Fungsi main untuk test program
    public static void main(String[] args) {
        // Bikin node-node pohon
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        // e
        TreeNode lca = lowestCommonAncestor(root, root.left.left, root.left.right);
        System.out.println("LCA dari node 4 dan 5 adalah: " + lca.value);
    }
}