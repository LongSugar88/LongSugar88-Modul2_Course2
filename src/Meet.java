public class Meet extends Material implements SallOff {
    private double weight;

    public Meet(){

    }
    public Meet(int id, String name,double weight, int date, double price){
        super(id, name, date, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public double amountPrice(){
        double a = weight;
        double b = getPrice();
        double amount = weight*getPrice();
        return amount;
    }
    @Override
    public int expDate(){
        return getDate() + 15;
    }
    public double saleExpDate(){
        double discount = 0;
        int today = 140;
        int expDate = expDate() - today;
        if(expDate < 0){
            discount = 1;
        }
        else if( expDate < 3){
            discount = 0.5;
        }
        else if( expDate < 5) {
            discount = 0.3;
        }
        return discount;
    }
    @Override
    public double discount(double discount){
        return discount;
    }


}
