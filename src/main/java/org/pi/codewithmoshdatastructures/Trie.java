package org.pi.codewithmoshdatastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trie {
    private class Node {
        private char value;
        private HashMap<Character, Node> children = new HashMap();
        private boolean isEndOfWord;

        Node(char value) {
            this.value = value;
        }

        public boolean hasCharacter(char ch) {
            return children.containsKey(ch);
        }

        public void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch) {
            return children.get(ch);
        }

        public Node[] getChildren() {
            return children.values().toArray(new Node[0]);
        }

        public boolean hasChildren() {
            return !children.isEmpty();
        }

        @Override
        public String toString() {
            return "Node value = " + value;
        }

        public void removeChild(char ch) {
            children.remove(ch);
        }
    }
    private Node root = new Node(' ');

    public void insert(String word) {
        Node current = root;
        for (char ch: word.toCharArray()) {
            if(current.hasCharacter(ch))
                current.addChild(ch);
            current  = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word) {
        if(word == null) return false;
        Node current = root;
        for (char ch: word.toCharArray()) {
            if(current.hasCharacter(ch))
                return false;
            current  = current.getChild(ch);
        }
        return current.isEndOfWord;
    }

    public void traverse() {
        traverse(this.root);
    }

    private void traverse(Node root) {
//         pre-order
        System.out.println(root.value);
        for (Node child: root.getChildren()) {
            traverse(child);
        }
//         post-order
//        for (Node child: root.getChildren()) {
//            traverse(child);
//        }
//        System.out.println(root.value);
    }

    public void remove(String word) {
        if(word == null) return;
        remove(root, word, 0);
    }

    private void remove(Node root, String word, int index) {
        if(index == word.length()) {
            root.isEndOfWord = false;
            return;
        }
        char ch = word.charAt(index);
        Node child  = root.getChild(ch);
        if(child == null) return;

        remove(child, word, index + 1);

        if(!child.hasChildren() && !child.isEndOfWord) {
            root.removeChild(ch);
        }
    }

    public List<String> findWords(String prefix) {
        if(prefix == null) return null;
        List<String> words = new ArrayList<>();
        Node lastNode = findLastNodeOf(prefix);
        if(lastNode == null) return words;
        findWords(lastNode, prefix, words);
        return  words;
    }

    private void findWords(Node root, String prefix, List<String> words) {
        if(root == null) return;

        if(root.isEndOfWord) {
            words.add(prefix);
        }

        for (Node child: root.getChildren()) {
            findWords(child, prefix + child.value, words);
        }
    }

    private Node findLastNodeOf(String prefix) {
        Node current = root;
        for (char ch: prefix.toCharArray()) {
            Node child = current.getChild(ch);
            if(child == null) {
                return null;
            }
            current = child;
        }
        return current;
    }
}
