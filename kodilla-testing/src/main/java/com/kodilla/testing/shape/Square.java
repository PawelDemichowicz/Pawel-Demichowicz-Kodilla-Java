package com.kodilla.testing.shape;

public class Square implements Shape
{

    private String name = "Square";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return side*side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.side, side) != 0) return false;
        return name != null ? name.equals(square.name) : square.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
