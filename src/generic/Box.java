package generic;

public class Box<T> {
    public T object;

    public Box(T object) {
        this.object = object;
    }
}

class FancyBox<T> extends Box<T> {

    public FancyBox(T object) {
        super(object);
    }

    public void saySomethingFancy() {
        System.out.println("our " + object + " is miserable and full of shit");
    }

    public void method1(FancyBox<?> box) {
        Object object = box.object;
        System.out.println(object);
    }

    public void plainWildCard() {
        method1(new FancyBox<>(new Object()));
        method1(new FancyBox<>(new Rectangle()));
        method1(new FancyBox<>(new Fireman()));
    }

    public void method2(FancyBox<? extends Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }

    public void method3(FancyBox<Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }

    public void upperBoundWildcard() {
        FancyBox<Figure> figureFancyBox = new FancyBox<>(new Circle());
        FancyBox<Circle> figureCircleBox = new FancyBox<>(new Circle());
        FancyBox<Square> figureSquareBox = new FancyBox<>(new Square());
        //below invocation is wrong
        //Circle doesn't inherit after Square
        //FancyBox<Square> figureSquareWithCircleBox = new FancyBox<>(new Circle());

        method2(figureFancyBox);
        method2(figureCircleBox);
        method2(figureSquareBox);

        //below method is wrong
        //method3 can only takes Figure type as argument
        //method3(figureSquareBox);
        method3(figureFancyBox); //correct
    }
}