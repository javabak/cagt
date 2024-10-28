package referat;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Getter
public class Graph {
    private final List<Edge> edges;
    private final HashMap<Integer, List<Edge>> adjacencyList;

    public Graph() {
        edges = new ArrayList<>();
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int start, int end) {
        Edge edge = new Edge(start, end);
        edges.add(edge);

        adjacencyList.computeIfAbsent(start, k -> new ArrayList<>()).add(edge);
    }

    public void sortEdges() {
        Collections.sort(edges, new EdgeComparator());
    }

    public void displayEdges() {
        for (Edge edge : edges) {
            System.out.println("Edge from " + edge.start + " to " + edge.end);
        }
    }
}
