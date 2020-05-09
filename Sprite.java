public abstract class Sprite{
    private String name;
    protected double x;
    protected double y;

    public Sprite(String name){
        this.name = name;
        x = 0.0;
        y = 0.0;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void moveTo(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public String getName(){
        return name;
    }
}