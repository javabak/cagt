package referat1;

import lombok.Getter;

import java.util.Comparator;

@Getter
public class Edge {
    public int start;
    public int end;

    public Edge(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class EdgeComparator implements Comparator<Edge> {
    @Override
    public int compare(Edge e1, Edge e2) {
        if (e1.start != e2.start) {
            return Integer.compare(e1.start, e2.start);
        } else {
            return Integer.compare(e1.end, e2.end);
        }
    }
}
