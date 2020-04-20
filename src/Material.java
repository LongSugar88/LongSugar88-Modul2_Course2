import java.util.Calendar;

public abstract class Material {
    private int ID;
    private String name;
    private int date ;
    private double price;

    public Material(){

    }
    public Material(int id, String name, int date, double price){
        this.ID = id;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double amountPrice();

    abstract int expDate();

}
