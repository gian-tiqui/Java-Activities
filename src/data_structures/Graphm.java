package data_structures;

import java.util.*;

public class Graphm {

    Map<Integer, ArrayList<Integer>> graph;

    public Graphm() {
        this.graph = new HashMap<>();
    }

    public void setDefault() {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(2);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();

        b.add(4);

        ArrayList<Integer> c = new ArrayList<>();

        c.add(5);

        ArrayList<Integer> d = new ArrayList<>();

        d.add(6);

        ArrayList<Integer> e = new ArrayList<>();

        ArrayList<Integer> f = new ArrayList<>();

        graph.put(1, a);
        graph.put(2, b);
        graph.put(3, c);
        graph.put(4, d);
        graph.put(5, e);
        graph.put(6, f);
    }

    public void insert(int n, int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) list.add(i);

        this.graph.put(n, list);
    }

    public void printGraph() {
        for (var i : graph.keySet()) {
            System.out.print(i + ": ");
            for (var j : graph.get(i))
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public void dfsIteration(Map<Integer, ArrayList<Integer>> graph, int source) {

        Stack<Integer> stack = new Stack<>();

        stack.push(source);

        while (!stack.isEmpty()) {
            int curr = stack.peek();

            stack.pop();

            System.out.println(curr);

            for (var neighbor : graph.get(curr)) stack.push(neighbor);
        }
    }

    public void dfs(Map<Integer, ArrayList<Integer>> graph, int source) {
        System.out.println(source);
        for (var neighbor : graph.get(source)) dfs(graph, neighbor);
    }

    public void bfs(Map<Integer, ArrayList<Integer>> graph, int source) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(source);

        while (!queue.isEmpty()) {
            int curr = queue.peek();
            queue.poll();

            System.out.println(curr);

            for (var neighbor : graph.get(curr)) queue.add(neighbor);
        }
    }

    public Map<Integer, ArrayList<Integer>> getGraph() {
        return graph;
    }
}
