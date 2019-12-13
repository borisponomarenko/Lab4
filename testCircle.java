package lab4;

import java.util.Scanner;
public class testCircle {
    public static void main(String[] args){
        System.out.print("Введите радиус:");
        Scanner info = new Scanner(System.in);
        double radius = info.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Радиус:" +circle.getRadius());
        System.out.println("Диаметр:" +circle.getDiameter());
        System.out.println("Длина:" +circle.getLength());
        System.out.println("Площадь:" +circle.getSquare());
        info.close();
    }
}
