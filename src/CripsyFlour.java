import java.time.LocalDate;

public class CripsyFlour extends Material implements Discount {
    private double quantity;

    public CripsyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }
    public double getAmount() {
        return quantity * getCost();
    }
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return getAmount()*95/100;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
