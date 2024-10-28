package referat;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(3, 1);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(3, 3);

        System.out.println("До сортировки:");
        graph.displayEdges();

        graph.sortEdges();

        System.out.println("\nПосле сортировки:");
        graph.displayEdges();
    }
}