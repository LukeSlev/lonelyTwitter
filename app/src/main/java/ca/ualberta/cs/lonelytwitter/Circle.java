package ca.ualberta.cs.lonelytwitter;

public class Circle extends Shape {
    public Circle() {
        super.setX(0);
        super.setY(0);
    }

    public void draw() {
        System.out.println("X " + getX() + " Y " + getY());
    }

}
