import java.io.File;
import java.util.List;
import java.util.Scanner;
// / Classe controladora que coordena a interação entre a interface e os dados
public class Controller {
    String loadedGraphFilename = null;
    Graph loadedGraph = null;

    GraphSearch graphSearch = new GraphSearch();
    // Adiciona um novo grafo ao sistema
    void addNewGraph(int nodes, List<Edge> edge, String fileName) {
        Graph graph = new Graph();

        for (int i = 0; i < nodes; i++) {
            graph.addNode(i);
        }

        for (Edge e : edge) {
            graph.addEdge(e.source, e.destination, e.weight);
        }

        GraphIO.saveGraph(graph, "graphs/" + fileName + ".txt");
        loadedGraphFilename = "graphs/" + fileName + ".txt";
        loadedGraph = graph;
    }
    // Obtém a lista de grafos existentes
    File[] getGraphs() {
        return GraphIO.getGraphsFromDirectory("graphs");
    }
    // Carrega um grafo existente
    void loadGraph(int choice, File[] graphs) {
        loadedGraphFilename = graphs[choice - 1].getName();

        loadedGraph = GraphIO.loadGraph("graphs/" + loadedGraphFilename);
    }
    // Imprime o grafo atualmente carregado
    void printGraph() {
        loadedGraph.printGraph();
    }
    // Executa busca em largura (BFS) em um grafo
    void BFS(int startNode) {
        graphSearch.BFS(startNode, loadedGraph.getAdjList());
    }
    // Executa busca em profundidade (DFS) em um grafo
    void DFS(int startNode) {
        graphSearch.DFS(startNode, loadedGraph.getAdjList());
    }
}
