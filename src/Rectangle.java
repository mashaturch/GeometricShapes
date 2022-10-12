public class Rectangle extends Main{
    double a, b;

    Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimetr () {
        return 2 * (this.a + this.b);
    }

    public double getSquare () {
        return this.a * this.b;
    }

    public void changeSize (double newA, double newB) {

        this.a = newA;
        this.b = newB;
    }

    public void Information () {
        System.out.println("Одна сторона прямоугольника: " + this.a);
        System.out.println("Вторая сторона прямоугольника: " + this.b);
        System.out.println("Периметр прямоугольника: " + getPerimetr());
        System.out.println("Площадь прямоугольника: " + getSquare());
    }
}
