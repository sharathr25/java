package org.pi.codewithmoshdatastructures;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private class Node{
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
    private Node root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            root = newNode;
            return;
        }
        Node cur = root;
        while (true) {
            if(value < cur.value) {
                if(cur.left == null) {
                    cur.left = newNode;
                    break;
                }
                cur = cur.left;
            } else {
                if(cur.right == null) {
                    cur.right = newNode;
                    break;
                }
                cur = cur.right;
            }
        }
    }
    public boolean find(int value) {
        Node cur = root;
        while (cur!=null) {
            if(value < cur.value) {
                cur = cur.left;
            } else if(value > cur.value) {
                cur = cur.right;
            } else {
                return true;
            }
        }
        return false;
    }

    private void preOrder(Node n) {
        if(n == null) return;

        System.out.println(n.value);
        preOrder(n.left);
        preOrder(n.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void postOrder(Node n) {
        if(n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.value);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void inOrder(Node n) {
        if(n == null) return;
        inOrder(n.left);
        System.out.println(n.value);
        inOrder(n.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private boolean isLeafNode(Node n) {
        return n.left == null && n.right == null;
    }

    private int height(Node n) {
        if(n == null) return -1;

        if(isLeafNode(n)) return 0;

        return 1 + Math.max(height(n.left), height(n.right));
    }

    public int height() {
        return height(root);
    }

    private int min(Node n) {
        if(isLeafNode(n)) return n.value;

        int left = min(n.left);
        int right = min(n.right);

        return Math.min(Math.min(left, right), n.value);
    }

    public int min(boolean isBST) {
        if(root == null) throw new IllegalStateException();

        if(isBST) {
            Node cur = root;
            Node prev = cur;
            while (cur != null) {
                prev = cur;
                cur = cur.left;
            }
            return prev.value;
        }

        return min(root);
    }

    public int min() {
        return min(false);
    }

    private int max(Node n) {
        if(isLeafNode(n)) return n.value;

        int left = max(n.left);
        int right = max(n.right);

        return Math.max(Math.max(left, right), n.value);
    }

    public int max(boolean isBST) {
        if(root == null) throw new IllegalStateException();

        if(isBST) {
            Node cur = root;
            Node prev = cur;
            while (cur != null) {
                prev = cur;
                cur = cur.right;
            }
            return prev.value;
        }

        return max(root);
    }

    public int max() {
        return max(false);
    }

    public boolean equals(BinarySearchTree other) {
        if(other == null) return false;

        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if(first == null && second == null) return true;

        if(first != null && second != null) {
            return first.value == second.value
                    && equals(first.left, second.left)
                    && equals(first.right, second.right);
        }

        return false;
    }

    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node n, int min, int max) {
        if(n == null) return true;

        if(n.value < min || n.value > max) return false;

        return isBST(n.left, min, n.value - 1)
                && isBST(n.right, n.value + 1, max);
    }

    public void printNodesAtDistance(int d) {
        printNodesAtDistance(root, d);
    }

    private void printNodesAtDistance(Node n, int d) {
        if(n == null) return;

        if(d==0) {
            System.out.println(n.value);
            return;
        }

        printNodesAtDistance(n.left, d - 1);
        printNodesAtDistance(n.right, d - 1);
    }

    public List getNodesAtDistance(int d) {
        List<Node> nodes = new ArrayList<>();
        getNodesAtDistance(root, d, nodes);
        return nodes;
    }

    private void getNodesAtDistance(Node n, int d, List nodes) {
        if(n == null) return;

        if(d==0) {
            nodes.add(n);
            return;
        }

        getNodesAtDistance(n.left, d - 1, nodes);
        getNodesAtDistance(n.right, d - 1, nodes);
    }

    public void traverseLevelOrder() {
        for (int i = 0; i <= height(); i++) {
            for (Object o : getNodesAtDistance(i)) {
                System.out.println(o);
            }
        }
    }

}
