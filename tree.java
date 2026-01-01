class node {
    int data;
    node left, right;

    node(int data) {

    }
}

class binarytree {
    node root;

    void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

}

public class tree {
    public static void main(String[] args) {
        binarytree tree = new binarytree();
        node newnode = new node(54);
        newnode.left = new node(64);
        newnode.right = new node(83);
        newnode.left.left = new node(75);
        newnode.left.right = new node(22);
        System.out.println(newnode.data + " preorder traversal");
        tree.preorder(newnode.left);
        tree.preorder(newnode.right);
    }

}
