package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private int id;
    private String name;
    private BigDecimal price;
    public static BigDecimal DISCOUTN_RATE = BigDecimal.valueOf(0.1);
    private Rate rating;

    public Product(int id, String name, BigDecimal price, Rate rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rate.NOT_RATED);
    }

    public Product() {
        this(0, "no name", BigDecimal.ZERO);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Rate getRating() {
        return rating;
    }

    public void setRating(Rate rating) {
        this.rating = rating;
    }

    public BigDecimal getDiscoutn() {
        return price.multiply(DISCOUTN_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public Product applyRating(Rate newRating) {
        return new Product(id, name, price, newRating);
    }
}
