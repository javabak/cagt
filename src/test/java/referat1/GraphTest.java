package referat1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import referat1.Edge;
import referat1.Graph;

import java.util.List;

class GraphTest {
    private Graph graph;

    @BeforeEach
    void setUp() {
        graph = new Graph();
        graph.addEdge(3, 1);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(3, 3);
    }

    @Test
    void testSortEdges() {
        graph.sortEdges();

        List<Edge> sortedEdges = graph.getEdges();

        assertEquals(1, sortedEdges.get(0).start);
        assertEquals(2, sortedEdges.get(0).end);
        assertEquals(3, sortedEdges.get(4).start);
        assertEquals(3, sortedEdges.get(4).end);
    }
}
