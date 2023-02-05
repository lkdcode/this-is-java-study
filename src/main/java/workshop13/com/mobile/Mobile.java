package workshop13.com.mobile;

public class Mobile {
    private String code;
    private String name;
    private double price;

    public Mobile() {
    }

    public Mobile(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String printInfo() {
        return this.code + "\t" + this.name + "\t" + this.price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price += (this.price * 0.1);
    }
}
