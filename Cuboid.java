public class Cuboid extends Shape implements AreaCalculable, VolumeCalculable{
    private double width;
    private double height;
    private double depth;

    public Cuboid(String name, double radius, double height, double depth){
        super(name);
        this.radius = radius;
        this.height = height;
        this.depth = depth;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getDepth(){
        return depth;
    }

    public void setDepth(double depth){
        this.depth = depth;
    }

    public double getArea(){
        return (2 * width * depth) + (2 * depth * height) + (2 * width * height);
    }

    public double getVolume(){
        return width * height * depth;
    }

    public void zoom(double factor){
        radius = radius * factor;
        height = height * factor;
        depth = depth * factor;
    }
}