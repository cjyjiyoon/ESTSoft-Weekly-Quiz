import java.math.BigDecimal;

public class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private Double weight;

    @Override
    public int getDiscountAmount() {
        return 0;
    }

    @Override
    public int getDiscountAmount(int weight) {
        return 0;
    }
}
