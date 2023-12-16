public class Point {
    private int x = 0 ;
    private int y = 0 ;

    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        double x = 0;
        double y = 0;
        return Math.sqrt(((getX()-x)*(getX()-x))+((getY()-y)*(getY()-y)));
    }
    public double distance(int x, int y){
        return Math.sqrt(((getX()-x)*(getX()-x))+((getY()-y)*(getY()-y)));
    }
    public double distance(Point another){
        return Math.sqrt(((another.getX() - this.x)*(another.getX() - this.x))+((another.getY() - this.y)*(another.getY() - this.y)));
    }
}