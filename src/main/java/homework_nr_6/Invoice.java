package homework_nr_6;

public class Invoice {

    private String productModel;
    private String productDescription;
    private int quantityOfProducts;
    private double price;


    public Invoice(String productModel, String productDescription, int quantityOfProducts, double price) {
        this.productModel = productModel;
        this.productDescription = productDescription;
        setQuantityOfProducts(quantityOfProducts);
        setPrice(price);
    }

    public String getProductModel() {
        return productModel;
    }
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(int quantityOfProducts) {
        if (quantityOfProducts < 0) {
            this.quantityOfProducts = 0;
        } else {
            this.quantityOfProducts = quantityOfProducts;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public double getAmount(){
        return price * quantityOfProducts;
    }
}
