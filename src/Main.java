import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        figure();
        }

    public static void figure () {
        System.out.println ("Вы хотите рассмотреть круг, квадрат, прямоугольник или выйти?");
        Scanner myscan = new Scanner (System.in);
        String infoIn = myscan.nextLine ();
        String info = infoIn.toLowerCase();
        if (info.equals("круг")) {
            System.out.print ("Введите радиус круга: ");
            Scanner scan = new Scanner (System.in);
            double radius = scan.nextDouble();
            Circle circle = new Circle(radius);
            circle.Information();
            System.out.println ("Вы хотите вернуться обратно в выбор фигуры (1) или поменять радиус (2)? " +
                    "Введите 1 или 2!");
            Scanner questionIn = new Scanner (System.in);
            int question = questionIn.nextInt();
            switch (question) {
                case (1):
                    System.out.println("");
                    figure();
                    break;
                case (2):
                    System.out.print ("Введите новый радиус круга: ");
                    Scanner newRadiusIn = new Scanner (System.in);
                    double newRadius = newRadiusIn.nextDouble();
                    circle.changeSize(newRadius);
                    circle.Information();
                    System.out.println("");
                    figure();
            }
        } else if (info.equals("квадрат")){
            System.out.print ("Введите размер стороны квадрата: ");
            Scanner sideSquareIn = new Scanner (System.in);
            double sideSquare = sideSquareIn.nextDouble();
            Square square = new Square(sideSquare);
            square.Information();
            System.out.println ("Вы хотите вернуться обратно в выбор фигуры (1) или поменять размер стороны квадрата" +
                    "(2)? Введите 1 или 2!");
            Scanner questionIn = new Scanner (System.in);
            int question = questionIn.nextInt();
            switch (question) {
                case (1):
                    System.out.println("");
                    figure();
                    break;
                case (2):
                    System.out.print("Введите новый размер стороны квадрата: ");
                    Scanner newSideSquareIn = new Scanner(System.in);
                    double newSideSquare = newSideSquareIn.nextDouble();
                    square.changeSize(newSideSquare);
                    square.Information();
                    System.out.println("");
                    figure();
            }
        } else if (info.equals("прямоугольник")) {
            System.out.print("Введите размер первой стороны прямоугольника: ");
            Scanner sideRectangleFirstIn = new Scanner(System.in);
            double sideRectangleFirst = sideRectangleFirstIn.nextDouble();
            System.out.print("Введите размер второй стороны прямоугольника: ");
            Scanner sideRectangleSecondIn = new Scanner(System.in);
            double sideRectangleSecond = sideRectangleSecondIn.nextDouble();
            Rectangle rectangle = new Rectangle(sideRectangleFirst, sideRectangleSecond);
            rectangle.Information();
            System.out.println("Вы хотите вернуться обратно в выбор фигуры (1) или поменять размер сторон прямоугольника" +
                    "(2)? Введите 1 или 2!");
            Scanner questionIn = new Scanner(System.in);
            int question = questionIn.nextInt();
            switch (question) {
                case (1):
                    System.out.println("");
                    figure();
                    break;
                case (2):
                    System.out.print("Введите новый размер первой стороны прямоугольника: ");
                    Scanner newSideRectangleFirstIn = new Scanner(System.in);
                    double newSideRectangleFirst = newSideRectangleFirstIn.nextDouble();
                    System.out.print("Введите новый размер второй стороны прямоугольника: ");
                    Scanner newSideRectangleSecondIn = new Scanner(System.in);
                    double newSideRectangleSecond = newSideRectangleSecondIn.nextDouble();
                    rectangle.changeSize(newSideRectangleFirst, newSideRectangleSecond);
                    rectangle.Information();
                    System.out.println("");
                    figure();
            }
        } else if (info.equals("выйти")) {
            return;
        }
        else {
            System.out.println("Вы ввели неправильно данные! Повторите ещё раз! ");
            figure();
        }
    }
}
