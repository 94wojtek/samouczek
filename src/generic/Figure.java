package generic;

public interface Figure {
    String getName();
}

class Circle implements Figure {
    @Override
    public String getName() {
        return "circle";
    }
}

class Rectangle implements Figure {
    @Override
    public String getName() {
        return "rectangle";
    }
}

class Square extends Rectangle {
    @Override
    public String getName() {
        return "square";
    }
}

class BoxForFigures<T extends Figure> {
    private T element;

    public BoxForFigures(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementName() {
        return element.getName();
    }
}