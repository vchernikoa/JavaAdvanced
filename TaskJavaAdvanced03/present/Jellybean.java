package present;

public class Jellybean extends Present {
    private String taste;

    public Jellybean(String name, float price, float weight, String taste) {
        super(name, price, weight);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Jellybean{" + super.toString() +
                ", taste='" + taste +
                '}';
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
