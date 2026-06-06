public import java.util.Scanner;

class calc {
    int a, b;

    calc(int x, int y) {
        a = x;
        b = y;
    }
}

class Addition extends calc {
    Addition(int x, int y) {
        super(x, y);
    }

    void calculate() {
        System.out.println("Addition = " + (a + b));
    }
}

class Subtraction extends calc {
    Subtraction(int x, int y) {
        super(x, y);
    }

    void calculate() {
        System.out.println("Subtraction = " + (a - b));
    }
}

class Multiplication extends calc {
    Multiplication(int x, int y) {
        super(x, y);
    }

    void calculate() {
        System.out.println("Multiplication = " + (a * b));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Addition add = new Addition(x, y);
        Subtraction sub = new Subtraction(x, y);
        Multiplication mul = new Multiplication(x, y);

        add.calculate();
        sub.calculate();
        mul.calculate();

        sc.close();
    }
} {
    
}
