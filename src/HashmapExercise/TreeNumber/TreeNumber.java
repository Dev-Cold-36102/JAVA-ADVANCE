package HashmapExercise.TreeNumber;

public class TreeNumber {
    public Node root;

    public TreeNumber() {
    }

    public void addNumber(int number) {
        if (root == null) {
            root = new Node(number, null, null);
        } else {
            Node node = root;
            while (node != null) {
                if (number < node.key) {
                    if (node.left == null) {
                        node.left = new Node(number, null, null);
                        break;
                    } else
                        node = node.left;

                } else {
                    if (node.right == null) {
                        node.right = new Node(number, null, null);
                        break;
                    } else
                        node = node.right;
                }
            }
        }
    }

    public void findNumber(int number) {
        Node currentNode = root;
        while (currentNode != null) {
            if (number > currentNode.key) {
                currentNode = currentNode.right;
            } else if (number < currentNode.key) {
                currentNode = currentNode.left;
            } else {
                System.out.println("FOUND " + number);
                return;
            }
        }
        System.out.println("NOT FOUND");
    }
}
