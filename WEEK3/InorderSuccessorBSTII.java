public class InorderSuccessorBSTII {

    public Node inorderSuccessor(Node x) {

        if (x == null) {
            return null;
        }

        // x has right child
        if (x.right != null) {
            x = x.right;
            while (x.left != null) {
                x = x.left;
            }
            return x;
        }

        // x has no right child
        while (x.parent != null) {
            if (x.parent.left == x) {
                return x.parent;
            }
            x = x.parent;
        }

        return null;
    }

}
