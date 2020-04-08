package myvector;

public class Vector2d {
    private double x, y;

    public Vector2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void display(){
        System.out.println("(" + this.getX() + ", " + this.getY() + ")");
    }

    public Vector2d add(Vector2d vect){
        return new Vector2d(this.getX() + vect.getX(), this.getY() + vect.getY());
    }

    public Vector2d substract(Vector2d vect){
        return new Vector2d(this.getX() - vect.getX(), this.getY() - vect.getY());
    }

    public double scalarProduct(Vector2d vect){
        return this.getX() * vect.getX() + this.getY() * vect.getY();
    }

    public Vector3d vectorProduct(Vector2d vect){

        double newX, newY, newZ;

        newX = this.getY() * 0 - 0 * vect.getY();
        newY = 0 * vect.getX() - this.getX() * 0;
        newZ = this.getX() * vect.getY() - this.getY() * vect.getX();

        return new Vector3d(newX, newY, newZ);
    }
}
