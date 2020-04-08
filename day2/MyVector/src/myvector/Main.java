package myvector;

public class Main {

    public static void main(String[] args) {

        exampleVector2d();
        exampleVector3d();
    }

    private static void exampleVector2d(){

        System.out.println();
        System.out.println("Example 2D");
        System.out.println("==========");
        
        Vector2d vect2d_1 = new Vector2d(1, 2);
        Vector2d vect2d_2 = new Vector2d(3, 4);

        System.out.print("vector1: ");
        vect2d_1.display();
        System.out.print("vector2: ");
        vect2d_2.display();

        Vector2d vect2d_sum = vect2d_1.add(vect2d_2);
        System.out.print("vector1 + vector2: ");
        vect2d_sum.display();

        Vector2d vect2d_sub = vect2d_1.substract(vect2d_2);
        System.out.print("vector1 - vector2: ");
        vect2d_sub.display();

        double scalarProd = vect2d_1.scalarProduct(vect2d_2);
        System.out.println("scalar product: " + scalarProd);

        Vector3d vect2d_vectorProd = vect2d_1.vectorProduct(vect2d_2);
        System.out.print("vector product: ");
        vect2d_vectorProd.display();

    }

    private static void exampleVector3d(){

        System.out.println();
        System.out.println("Example 3D");
        System.out.println("==========");

        Vector3d vect3d_1 = new Vector3d(1, 2, 3);
        Vector3d vect3d_2 = new Vector3d(4, 5, 6);

        System.out.print("vector1: ");
        vect3d_1.display();
        System.out.print("vector2: ");
        vect3d_2.display();

        Vector3d vect3d_sum = vect3d_1.add(vect3d_2);
        System.out.print("vector1 + vector2: ");
        vect3d_sum.display();

        Vector3d vect3d_sub = vect3d_1.substract(vect3d_2);
        System.out.print("vector1 - vector2: ");
        vect3d_sub.display();

        double scalarProd = vect3d_1.scalarProduct(vect3d_2);
        System.out.println("scalar product: " + scalarProd);

        Vector3d vect2d_vectorProd = vect3d_1.vectorProduct(vect3d_2);
        System.out.print("vector product: ");
        vect2d_vectorProd.display();

    }

}
