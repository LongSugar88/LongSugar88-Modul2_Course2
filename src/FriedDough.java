import java.util.Calendar;

public class FriedDough extends Material implements SallOff{
    private int quantity;
    Calendar cal = Calendar.getInstance();
    public FriedDough(){

    }
    public FriedDough(int id, String name,int quantity, int date, double price){
        super(id, name, date, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public double amountPrice(){
        int a = quantity;
        double c = super.getPrice();
        double b = this.getPrice();
        double amount = quantity*getPrice();
        return amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public int expDate(){
        return getDate()+ 360;
    }

    public double saleExpDate(){
        double discount = 0;
        int today = 140;
        int expDate = expDate() - today;
        if(expDate < 0){
            discount = 1;
        }
        else if( expDate <= 60){
            discount = 0.4;
        }
        else if( expDate <= 120) {
            discount = 0.2;
        }
        return discount;
    }
    @Override
    public double discount(double discount){
        return discount;
    }

}
