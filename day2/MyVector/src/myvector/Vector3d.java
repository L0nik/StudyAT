package myvector;

public class Vector3d {
    private double x, y, z;

    public Vector3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void display(){
        System.out.println("( " + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")");
    }

    public Vector3d add(Vector3d vect){
        return new Vector3d(this.getX() + vect.getX(), this.getY() + vect.getY(), this.getZ() + vect.getZ());
    }

    public Vector3d substract(Vector3d vect){
        return new Vector3d(this.getX() - vect.getX(), this.getY() - vect.getY(), this.getZ() - vect.getZ());
    }

    public double scalarProduct(Vector3d vect){
        return this.getX() * vect.getX() + this.getY() * vect.getY() + this.getZ() * vect.getZ();
    }

    public Vector3d vectorProduct(Vector3d vect){

        double newX, newY, newZ;

        newX = this.getY() * vect.getZ() - this.getZ() * vect.getY();
        newY = this.getZ() * vect.getX() - this.getX() * vect.getZ();
        newZ = this.getX() * vect.getY() - this.getY() * vect.getX();

        return new Vector3d(newX, newY, newZ);
    }
}
