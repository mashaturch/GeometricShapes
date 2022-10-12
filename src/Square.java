public class Square extends Main{
    double a;

    Square (double a) {
        this.a = a;
    }

    public double getPerimetr () {
        return 4 * this.a;
    }

    public double getSquare () {
        return this.a * this.a;
    }

    public void changeSize (double newA) {
        this.a = newA;
    }

    public void Information () {
        System.out.println("Сторона квадрата: " + this.a);
        System.out.println("Периметр квадрата: " + getPerimetr());
        System.out.println("Площадь квадрата: " + getSquare());
    }
}
