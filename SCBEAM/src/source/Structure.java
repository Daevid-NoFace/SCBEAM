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
public class Structure {
    
    private String id;
    private double width;
    private double height;
    private double widthDifference;
    private double effectiveHeight;
    private short numberOfLitters;
    private double covering;
    private double compressiveStrengthOfConcrete;
    private double fenceSpacing;

    public Structure() {
    }

    public Structure(String id, double width, double height) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.effectiveHeight = 0;
        this.widthDifference = 0;
        this.numberOfLitters = 0;
        this.fenceSpacing = 0;
        this.covering = 0;
        this.compressiveStrengthOfConcrete = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidthDifference() {
        return widthDifference;
    }

    public void setWidthDifference(double widthDifference) {
        this.widthDifference = widthDifference;
    }

    public double getEffectiveHeight() {
        return effectiveHeight;
    }

    public void setEffectiveHeight(double effectiveHeight) {
        this.effectiveHeight = effectiveHeight;
    }

    public short getNumberOfLitters() {
        return numberOfLitters;
    }

    public void setNumberOfLitters(short numberOfLitters) {
        this.numberOfLitters = numberOfLitters;
    }

    public double getCovering() {
        return covering;
    }

    public void setCovering(double covering) {
        this.covering = covering;
    }

    public double getCompressiveStrengthOfConcrete() {
        return compressiveStrengthOfConcrete;
    }

    public void setCompressiveStrengthOfConcrete(double compressiveStrengthOfConcrete) {
        this.compressiveStrengthOfConcrete = compressiveStrengthOfConcrete;
    }

    public double getFenceSpacing() {
        return fenceSpacing;
    }

    public void setFenceSpacing(double fenceSpacing) {
        this.fenceSpacing = fenceSpacing;
    }
}
