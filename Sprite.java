public abstract class Sprite{
    private String name;
    protected float x;
    protected float y;

    public Sprite(String name){
        this.name = name;
        x = 0.0;
        y = 0.0;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void moveTo(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String getName(){
        return name;
    }
}