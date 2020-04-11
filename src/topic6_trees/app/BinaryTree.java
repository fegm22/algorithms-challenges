package topic6_trees.app;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(final T data) {
        if (root == null) {
            this.root = new Node<>(data);
        } else {
            insertNode(root, data);
        }
    }

    private void insertNode(Node<T> root, final T data) {
        if (data.compareTo(root.getData()) > 0) {
            if (root.getRight() != null) {
                insertNode(root.getRight(), data);
            } else {
                root.setRight(new Node<>(data));
            }
        } else {
            if (root.getLeft() != null) {
                insertNode(root.getLeft(), data);
            } else {
                root.setLeft(new Node<>(data));
            }
        }
    }

    @Override
    public void traversal() {
        if (root != null) {
            printNode(root);
        }
    }

    private void inOrderTraversal(final Node<T> node) {
        if (node.getLeft() != null) {
            inOrderTraversal(node.getLeft());
        }

        System.out.println(node.getData());

    }

    private void printNode(final Node<T> node) {
        if (node == null) return;

        printNode(node.getLeft());
        printNode(node.getRight());

        System.out.println(node.getData());

    }

    @Override
    public boolean search(final T data) {
        return false;
    }
}