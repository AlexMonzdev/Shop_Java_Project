package labs.pm.app;

import labs.pm.data.Product;
import labs.pm.data.Rate;

import java.math.BigDecimal;

public class Shop {

    public static void main(String[] args) {
        Product p1 = new Product(101,"Tea",BigDecimal.valueOf(1.99));
        Product p2 = new Product(102, "Coffee", BigDecimal.valueOf(1.99), Rate.FOUR_STAR);
        Product p3 = new Product(103, "Cake", BigDecimal.valueOf(3.99), Rate.FIVE_STAR);
        Product p4 = new Product();
        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscoutn()+" "+p1.getRating().getStars());
        System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPrice()+" "+p2.getDiscoutn()+" "+p2.getRating().getStars());
        System.out.println(p3.getId()+" "+p3.getName()+" "+p3.getPrice()+" "+p3.getDiscoutn()+" "+p3.getRating().getStars());
        System.out.println(p4.getId()+" "+p4.getName()+" "+p4.getPrice()+" "+p4.getDiscoutn()+" "+p4.getRating().getStars());
    }
}
