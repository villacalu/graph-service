import java.util.*;
// Classe responsável por realizar buscas em grafos
public class GraphSearch {
    // Executa busca em largura (BFS) em um grafo
    void BFS(int start, Map<Integer, List<Edge>> adjList) {
        System.out.println("Breath First Search");

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (Edge edge : adjList.get(node)) {
                if (!visited.contains(edge.destination)) {
                    q.add(edge.destination);
                    visited.add(edge.destination);
                }
            }
        }
    }
    // Executa busca em profundidade (DFS) em um grafo
    void DFS(int start, Map<Integer, List<Edge>> adjList) {
        System.out.println("Primeira pesquisa em profundidade");

        Stack<Integer> s = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        s.push(start);
        visited.add(start);

        while (!s.isEmpty()) {
            int node = s.pop();
            System.out.print(node + " ");

            for (Edge edge : adjList.get(node)) {
                if (!visited.contains(edge.destination)) {
                    s.push(edge.destination);
                    visited.add(edge.destination);
                }
            }
        }
    }
}
