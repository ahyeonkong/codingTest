import java.io.*;
import java.util.*;

class Graph {
    private int vertices;
    private List<Node> nodes;
    private int visitCount;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.nodes = new ArrayList<>(vertices + 1);
        for (int i = 0; i <= vertices; i++) {
            nodes.add(new Node(i));
        }
        this.visitCount = 1;
    }

    public void addEdge(int source, int destination) {
        nodes.get(source).addNeighbor(destination);
        nodes.get(destination).addNeighbor(source);
    }

    public void sortAllNeighbors() {
        for (Node node : nodes) {
            node.sortNeighbors();
        }
    }

    public void dfs(int startVertex) {
        nodes.get(startVertex).setVisitOrder(visitCount++);

        for (int neighbor : nodes.get(startVertex).getNeighbors()) {
            if (nodes.get(neighbor).getVisitOrder() == 0) {
                dfs(neighbor);
            }
        }
    }

    public String getResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= vertices; i++) {
            sb.append(nodes.get(i).getVisitOrder()).append('\n');
        }
        return sb.toString();
    }
}

class Node {
    private int id;
    private List<Integer> neighbors;
    private int visitOrder;

    public Node(int id) {
        this.id = id;
        this.neighbors = new ArrayList<>();
        this.visitOrder = 0;
    }

    public void addNeighbor(int neighbor) {
        neighbors.add(neighbor);
    }

    public void sortNeighbors() {
        Collections.sort(neighbors);
    }

    public List<Integer> getNeighbors() {
        return neighbors;
    }

    public void setVisitOrder(int order) {
        this.visitOrder = order;
    }

    public int getVisitOrder() {
        return visitOrder;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        Graph graph = new Graph(N);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.addEdge(u, v);
        }

        graph.sortAllNeighbors();
        graph.dfs(R);
        System.out.print(graph.getResult());
    }
}
