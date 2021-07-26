package com.blurryface.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int key;
    List<Node> children;

    public Node(int val){
        key = val;
        children = new ArrayList<>(){{
            add(null);
            add(null);
        }};
    }

    public Node(int val, int noOfChildren){
        key = val;
        children = new ArrayList<>(){{
            for (int i = 0; i < noOfChildren; i++) {
                add(null);
            };
        }};
    }
}
