import data_structures.Graphm;

public class Main {

    public static void main(String[] args) {

        Graphm graphm = new Graphm();

        graphm.setDefault();

        graphm.printGraph();

        graphm.dfsIteration(graphm.getGraph(), 1);
    }
}