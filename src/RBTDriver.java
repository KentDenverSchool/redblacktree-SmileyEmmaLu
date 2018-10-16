public class RBTDriver {
    public static void main(String[] args) {
        Node root = new Node(1, 3, 0, false);

        RedBlackBST correct = new RedBlackBST(root);

        correct.isRBT(root); // true

        Node rightNode = new Node(2, 2, 1, true);
        root.setRight(rightNode).;

        Node leftNode = new Node (3, 4, 1, true);
        root.setLeft(leftNode);

        Node grandChildRight = new Node(4, 1, 1, false);

        correct.gParent(root);




    }
}
