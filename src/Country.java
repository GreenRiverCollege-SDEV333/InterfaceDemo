public class Country implements Measurable {
    private String name;
    private double area;

    public Country(String theName, double theArea) {
        this.name = theName;
        this.area = theArea;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public double getValue() {
        return area;
    }
}
