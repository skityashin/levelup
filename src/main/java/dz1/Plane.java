package main.java.dz1;


public class Plane extends Vehicle  implements Movable3D{
    @Override
    public String power() {
        return "power 1000";
    }

    @Override
    public String carrying() {
        return "carrying 10 000";
    }

    @Override
    public String up() {
        return "up 10";
    }

    @Override
    public String down() {
        return "down 10";
    }

    @Override
    public String back() {
        return "back 10";
    }

    @Override
    public String stop() {
        return "stop";
    }

    @Override
    public String forward() {
        return "forward 10";
    }

    @Override
    public String left() {
        return "left 10";
    }

    @Override
    public String right() {
        return "right 10";
    }

    public Plane(String name) {
        this.name = name;
    }
}
