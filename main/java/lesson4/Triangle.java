package lesson4;

public class Triangle {
    double a = 3;
    double b = 4;
    double c = 5;
    double x = (a + b + c) / 2;
    double S = Math.sqrt(x * (x - a) * (x - b) * (x - c));

    {
        System.out.println("S = " + S);
    }


    public Triangle(int a, int b, int c) {
    }

    public boolean isValid() {
        return false;
    }


}



