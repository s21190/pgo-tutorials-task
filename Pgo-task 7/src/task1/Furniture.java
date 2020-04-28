package task1;

public class Furniture {
    private String FurnitureName;
    private int Price;
    private static int VatPercentage;

    public Furniture(String furnitureName, int furniturePrice) {
       this.FurnitureName = furnitureName;
       this.Price = furniturePrice;
    }

    public int getPrice() {
        System.out.print("furniture price = " );
        return Price;
    }

    public int getPrice(int vatPercentage) {
                VatPercentage=vatPercentage;
                System.out.print("furniture price = "+Price+ "\n vat percentage = ");
                    return VatPercentage ;
                }
    }



