package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, base1: "
                + base1 + " units, base2: " + base2 + " units, height: " + height
                + " units, color: " + color);
    }

}
