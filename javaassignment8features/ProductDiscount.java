import java.util.*;
import java.util.function.*;

public class ProductDiscount {
    public static void main(String[] args) {
        Map<String, Optional<Double>> productPrices = new HashMap<>();
        productPrices.put("Laptop", Optional.of(1000.0));
        productPrices.put("Phone", Optional.of(600.0));
        productPrices.put("Tab", Optional.empty());
        Function<Double, Double> discountFunction = ProductDiscount::discount;
        productPrices.forEach((product, priceOpt) -> {
            double finalPrice = priceOpt
                .map(discountFunction)
                .orElse(0.0);
            System.out.println(product + " final price: " + finalPrice);
        });
    }
    public static double discount(double price) {
        return price * 0.9;
    }
}

