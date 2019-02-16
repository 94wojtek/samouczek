package excercises.udemy;

public class Test {
    public static void main(String[] args) {

        Test2 x = new Test2();
        System.out.println(x.a);

        Test2 y = x;

        y.a = 40;

        System.out.println(x.a);
    }
}

class Test2 {
    int a = 20;
}
