package CodeSignal.topic6_trees.app;

public class App {
    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(4);
        binaryTree.insert(2);
        binaryTree.insert(7);
        binaryTree.insert(1);
        binaryTree.insert(3);

        BinaryTree<String> binaryTreeString = new BinaryTree<>();
        binaryTreeString.insert("Bob");
        binaryTreeString.insert("Josh");
        binaryTreeString.insert("Adam");
        binaryTreeString.insert("Frank");
        binaryTreeString.insert("Zeh");

        BinaryTree<String> one = new BinaryTree<>();
        one.insert("Fran");

        binaryTree.traversal();
        System.out.println();
        binaryTreeString.traversal();
        System.out.println();
        one.traversal();
        System.out.println();

        System.out.println(binaryTree.toString());

        System.out.println(binaryTree.getMin());
        System.out.println(binaryTree.getMax());
        System.out.println(binaryTreeString.getMin());
        System.out.println(binaryTreeString.getMax());

        System.out.println(binaryTree.search(4));
        System.out.println(binaryTreeString.search("Hello"));

    }
}
