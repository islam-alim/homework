package kz.kaznu.islam.first_project;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        float b;
        b = 10 / 3;
        System.out.println(b);
        String str = "java";
        System.out.println(str);
        draw();
        draw();
        draw();
        ifValue();

    }
    public static void draw() {
        System.out.println("---------");
        System.out.println("---------");
    }
    public static void ifValue() {
        int a;
        a = 13;
        if (a <= 10) {
            System.out.println("How are you");
        }
        if (a > 10) {
            System.out.println("Raw");
        }
    }
}

