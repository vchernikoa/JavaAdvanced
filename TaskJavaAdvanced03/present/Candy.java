package present;

public class Candy extends Present {

    private String color;

    public Candy(String name, float price, float weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Candy{" + super.toString() +
                ", color='" + color  +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
