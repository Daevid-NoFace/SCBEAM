/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author DaVid
 */
public class Node {
    
    private int number;
    private double temperature;

    public Node() {
    }

    public Node(int number) {
        this.number = number;
    }
    
    public Node(int number, double temperature) {
        this.number = number;
        this.temperature = temperature;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
