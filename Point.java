package week04.geometry;

public class Point {
    private float x;
    private float y;

    Point(){
        x = 0;
        y = 0;
    };

    Point( float x, float y){
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return this.x;
    }

    public void setX(float X){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double Y){
        this.y = y;
    }

    public void translate(float dX, float dY){

        this.x += dX;
        this.y +=dY;
    }
    public float distance(Point p){

        float dis = (float) Math.sqrt(
        (p.x - this.x) * (p.x - this.x) +
        (p.y - this.y) * (p.y - this.y));
        return dis;
    }

    public boolean equals (Point p) {
        if((p.x == this.x) && (p.y ==this.y)){
            return true;
        }else{
            return false;
        }
    }

    
}