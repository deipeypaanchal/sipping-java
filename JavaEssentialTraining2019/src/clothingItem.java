public class clothingItem {

    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";
    public static final String HAT = "Hat";

    private String type;
    private clothingSize size;
    private double price;
    private int quantity;

    public clothingItem(String type, clothingSize size, double price, int quantity) {
        this.type = type;
        this.size =  size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public clothingSize getSize() { return size; }

    public void setSize(clothingSize size) { this.size = size; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
