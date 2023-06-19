package data_structures;

import java.util.ArrayList;

class GraphNode {
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ArrayList<Integer>[] getList() {
        return list;
    }

    public void setList(ArrayList<Integer>[] list) {
        this.list = list;
    }

    private int val;
    private ArrayList<Integer>[] list;

    public GraphNode(int val) {
        this.val = val;
        this.list = new ArrayList[val];

        for (int i = 0; i < val; i++) {
            list[i] = new ArrayList<>();
        }
    }
}

public class Graph {

    GraphNode node;

    public Graph(int num) {
        this.node = new GraphNode(num);
    }


    public void addEdge(int x, int y) {
        this.node.getList()[x].add(y);
        this.node.getList()[y].add(x);
    }

    public void printAdjacent() {
        for (int i = 0; i < this.node.getVal(); i++) {
            System.out.print("Vertex " + i + "->");
            for (int n : this.node.getList()[i]) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
