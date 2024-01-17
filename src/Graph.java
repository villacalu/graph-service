import java.io.*;
import java.util.*;
// Classe que representa a estrutura de um grafo
class Graph {
    private final Map<Integer, List<Edge>> adjList;

    public Map<Integer, List<Edge>> getAdjList() {
        return adjList;
    }
    // Construtor que inicializa a lista de adjacências
    Graph() {
        this.adjList = new HashMap<>();
    }
    // Adiciona um nó ao grafo
    void addNode(int node) {
        adjList.put(node, new LinkedList<Edge>());
    }
    // Adiciona uma aresta ao grafo
    void addEdge(int node1, int node2, int weight) {
        adjList.get(node1).add(new Edge(node1, node2, weight));
        // For an undirected graph, you may want to add the reverse edge as well
        // adjList.get(node2).add(new Edge(node1, weight));
    }
    // Imprime o grafo
    void printGraph() {
        for (Map.Entry<Integer, List<Edge>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Edge edge : entry.getValue()) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
}
