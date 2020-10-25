package com.allcoolboys.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Component 抽象构建角色
 * @author cooloby
 */
abstract class Node {
    abstract public void p();
}

/**
 * Leaf 叶子角色
 * @author coolboy
 */
class LeafNode extends Node {
    String content;
    public LeafNode(String content) {this.content = content;}

    @Override
    public void p() {
        System.out.println(content);
    }
}

/**
 * Composite组合对象角色
 * @author coolboy
 */
class BranchNode extends Node {
    List<Node> nodes = new ArrayList<>();

    String name;
    public BranchNode(String name) {this.name = name;}

    @Override
    public void p() {
        System.out.println(name);
    }

    /**
     * 树枝中可以有树枝或者叶子节点，也就是组合对象中可以包含组合对象或者单一对象
     * 那么，也就是说：组合对象要提供子对象的管理方法，比如add  可能还会有remove等
     * 我们将add方法安置于BranchNode 中
     * 这被称为安全方式的合成模式
     *
     * 另外一种是将子对象的管理全部托管在Node中
     * 也就是叶子节点和树枝节点都将拥有这些方法，方法都是一样的，对客户端来说，叶子和树枝在方法接口层面上的区别没有了
     * 客户端可以完全同等的对待它们两者，这就是透明方式的合成模式
     *
     * 两种方式中，透明就不够安全，安全就不透明，所以根据实际情况按照需求进行选择
     * @param n
     */
    public void add(Node n) {
        nodes.add(n);
    }
}

/**
 * 客户端
 * @author coolboy
 */
public class Client {
    public static void main(String[] args) {

        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node r1 = new LeafNode("r1");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        root.add(r1);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        tree(root, 0);

    }

    static void tree(Node b, int depth) {
        for(int i=0; i<depth; i++) {
            System.out.print("--");
        }
        b.p();

        if(b instanceof BranchNode) {
            for (Node n : ((BranchNode)b).nodes) {
                tree(n, depth + 1);
            }
        }
    }
}
