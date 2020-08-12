/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.ArrayList;

/**
 *
 * @author DaVid
 */
public class Quadrant {
    
    private ArrayList<Node> nodes;
    private double temperature;

    public Quadrant() {
        nodes = new ArrayList<>();
    }

    public Quadrant(double temperature) {
        this.temperature = temperature;
        nodes = new ArrayList<>();
    }

    public Quadrant(ArrayList<Node> nodes, double temperature) {
        this.nodes = nodes;
        this.temperature = temperature;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }
    
    public Node getNodeAt(int index) {
        return nodes.get(index);
    }

    public void setNodesList(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }
    
    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    //***************other methods***************\\

    /**
     *
     */
    public void calculateTemperature() {
        double summation = 0;
        
        for (Node node : nodes)
            summation += node.getTemperature();
        
        this.temperature = summation / nodes.size();
    }
}
