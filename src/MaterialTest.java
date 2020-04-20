import java.util.ArrayList;

public class MaterialTest {
    public static void main(String[] args) {
        ArrayList<Material> myMaterial = new ArrayList<>();

        Material friedDough1 = new FriedDough(101, "Bột 1", 5, -120, 3000 );
        Material friedDough2 = new FriedDough(102, "Bột 2", 7, 120, 8000 );
        Material friedDough3 = new FriedDough(103, "Bột 3", 8, -210, 10000 );
        Material friedDough4 = new FriedDough(104, "Bột 4", 4, 70, 20000 );
        Material friedDough5 = new FriedDough(105, "Bột 5", 2, -60, 15000 );

        Material meet1 = new Meet(201, "Thịt 1", 5.6, 125, 120000);
        Material meet2 = new Meet(202, "Thịt 2", 6.9, 131, 123000);
        Material meet3 = new Meet(203, "Thịt 3", 1.7, 138, 123000);
        Material meet4 = new Meet(204, "Thịt 4", 4.3, 134, 123000);
        Material meet5 = new Meet(205, "Thịt 5", 0.9, 128, 123000);

        myMaterial.add(friedDough1);
        myMaterial.add(friedDough2);
        myMaterial.add(friedDough3);
        myMaterial.add(friedDough4);
        myMaterial.add(friedDough5);
        myMaterial.add(meet1);
        myMaterial.add(meet2);
        myMaterial.add(meet3);
        myMaterial.add(meet4);
        myMaterial.add(meet5);

        double amountPriceAfterDiscount = 0;
        for( Material element: myMaterial){
            if( element instanceof Meet){
                Meet myMeet = (Meet) element;
                double discount = myMeet.discount(0.1);
                double sale = myMeet.saleExpDate();
                amountPriceAfterDiscount+= myMeet.amountPrice()*(1-discount)*(1-sale);
            }
            else if( element instanceof FriedDough){
                FriedDough myDough = (FriedDough) element;
                double discount = myDough.discount(0.05);
                double sale = myDough.saleExpDate();
                amountPriceAfterDiscount+= myDough.amountPrice()*(1-discount)*(1-sale);
            }
        }
        System.out.println("Sale price: "+ amountPriceAfterDiscount);

        double amountPrice = 0;
        for( Material element: myMaterial){
            amountPrice+= element.amountPrice();
        }
        System.out.println("Price: "+ amountPrice);

        double saleOff = amountPrice - amountPriceAfterDiscount;
        System.out.println("Sale: " + saleOff);

    }
}
