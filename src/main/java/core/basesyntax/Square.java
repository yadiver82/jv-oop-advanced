package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        super.drawInfo();
        System.out.print(getName() + ", area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, side: " + side + " units, color: " + getColor());
    }
}