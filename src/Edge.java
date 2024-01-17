// Classe que representa uma aresta em um grafo
public class Edge {
    int source;
    int destination;
    int weight;

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + destination + ", " + weight + ")";
    }
}
