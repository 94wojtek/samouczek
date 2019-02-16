package generic;

public class Main1 {
    public static void main(String[] args) {
        BoxForFigures<Circle> circleBoxForFigures = new BoxForFigures<>(new Circle());
        circleBoxForFigures.getElement();
        circleBoxForFigures.getElementName();

        Rectangle rectangle = new Square();
        BoxForFigures<Rectangle> rectangleBoxForFigures = new BoxForFigures<>(new Square());

        FancyBox<String> fancyBox = new FancyBox<>("life");
        fancyBox.saySomethingFancy();

        fancyBox.method1(new FancyBox<>(new Fireman()));
        fancyBox.plainWildCard();

        FancyBox<?> test = new FancyBox<>("hej");
        test.object = null;

        System.out.println(test.object);
    }
}
