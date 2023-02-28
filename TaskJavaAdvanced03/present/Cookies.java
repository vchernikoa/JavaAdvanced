package present;

public class Cookies extends Present {

    private boolean isSoft;

    public Cookies(String name, float price, float weight, boolean isSoft) {
        super(name, price, weight);
        this.isSoft = isSoft;
    }

    @Override
    public String toString() {
        return "Cookies{" + super.toString() +
                ", Soft=" + isSoft +
                '}';
    }

    public boolean isSoft() {
        return isSoft;
    }

    public void setSoft(boolean soft) {
        isSoft = soft;
    }
}
