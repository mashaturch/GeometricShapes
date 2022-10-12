public class Circle extends Main{
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    public double getPerimetr () {
        return 2 * 3.14 * this.radius;
    }

    public double getSquare () {
        return 3.14 * this.radius * this.radius;
    }

    public void changeSize (double newRadius) {
        this.radius = newRadius;
    }

    public void Information () {
        System.out.println("Радиус круга: " + this.radius);
        System.out.println("Периметр круга: " + getPerimetr());
        System.out.println("Площадь круга: " + getSquare());
    }


}
