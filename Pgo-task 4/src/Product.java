public class Product {
    private String name, productCode;
    private int price;

    public Product(String name, int numberOfItems, String productCode, int price) {
        if (numberOfItems == 0) {

            this.name = name;

            this.productCode = productCode;
            this.price = price;
            this.numberOfItems = 0;
            System.out.println("product has been created " + "\n product name = " + this.name+ "\nproduct code = " +getProductCode()+ "\n product price = " + this.getPrice() + "\n number of items "+this.getNumberOfItems());
            System.out.println("\n \n");
        } else {
            System.out.println("product number should be zero, product not created ");

        }
    }



    private int numberOfItems ;

    public Product(String name, String productCode, int price, int numberOfItems) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.numberOfItems = numberOfItems;
        System.out.println("product has been created "+"\n product name = "+ this.name+"\nproduct code = "+getProductCode()+"\n product price = "+this.getPrice()+"\n number of items "+getNumberOfItems());
        System.out.println("\n \n");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
       if(numberOfItems < 0){
          System.out.println("invalid input item must not be less than zero "); }else{

           this.numberOfItems = numberOfItems;


       }
    }
            public void printAllInfo(){
                System.out.println( "product detail summary"+"\nname of product = " +getName()+"\n number of items = " +getNumberOfItems()+"\nprice of item = "+ getPrice()+"\nproduct code = "+ getProductCode());


            }



}

