package com.company.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Route Between Nodes: Given a directed graph, design an algorithm
    to find out whether there is a route between two nodes.

*/

public class RouteGraph {

    public static void main(String str[]) {
        // A -> B -> C -> D
        // A -> B -> E -> D
        Graph graph = new Graph();
        graph.insert("A", "B", 1);
        graph.insert("B", "C", 2);
        graph.insert("B", "E", 1);
        graph.insert("C", "D", 1);
        graph.insert("E", "D", 1);
        graph.print();
        System.out.println(graph.isRoute("A", "E"));
    }

}

class Graph {
    Node first;
    Map<String, Node> map = new HashMap<>();
    List<String> paths;

    Graph() {

    }

    public void insert(String path1, String path2, int distance) {
        Node a = addNode(path1);
        Node b = addNode(path2);

        List<Link> neighbors = a.getNeighbors();

        if (neighbors == null)
            neighbors = new ArrayList<>();

        neighbors.add(new Link(b, distance));
        a.setNeighbors(neighbors);

    }

    private Node addNode(String path) {
        if (map.get(path) == null) {
            Node node = new Node(path, null);
            if (map.isEmpty())
                first = node;
            map.put(path, node);
        }
        return map.get(path);
    }

    public void print() {
        if (first == null)
            return;
        print(first);
    }

    private void print(Node node)
    {
        paths =new ArrayList<>();
        print(node, "");
        for(String path: paths){
            System.out.println(path);
        }
    }

    private void print(Node node,String path) {
        if (node == null)
            return;

        if (node.getNeighbors() == null) {
            paths.add(path + node.getName());
            return;
        }

        for (Link link : node.getNeighbors()) {
             print(link.getTo(), path + node.getName() + " -> " );
        }
    }

    public void print(String path) {
        print(map.get(path));
    }

    public boolean isRoute(String path1,String path2){
        print(path1);
        for (String path:paths){
            if(path.contains(path2)){
                return true;
            }
        }
        return false;
    }
}

class Node {

    private String name;
    private List<Link> neighbors;

    Node(String name, List<Link> neighbors) {
        this.name = name;
        this.neighbors = neighbors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Link> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Link> neighbors) {
        this.neighbors = neighbors;
    }

}

class Link {

    private Node to;
    private int distance;

    public Link(Node to, int distance) {
        this.to = to;
        this.distance = distance;
    }

    public Node getTo() {
        return to;
    }

    public void setTo(Node to) {
        this.to = to;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
