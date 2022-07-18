import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        clothingItem[] items = {
                new Shirt(
                        clothingSize.L,
                        19.99,
                        3),
                new Hat(
                        clothingSize.M,
                        29.99,
                        1)
        };

        for (clothingItem item: items) {
            displayItemDetails(item);
        }
    }

    private static void displayItemDetails(clothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));

        System.out.println(output);
    }
}