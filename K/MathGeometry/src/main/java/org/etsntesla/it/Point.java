package org.etsntesla.it;

public class Point {

    private double x,y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double radius(){
        return Math.sqrt(x*x+y*y);
    }
    public double distance(Point a){
        return Math.sqrt((x-a.x)*(x-a.x)+(y-a.y)*(y-a.y));
    }
    public double distance(double x1, double y1){
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
    public static double distance(Point a, Point b){ return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));}
}

