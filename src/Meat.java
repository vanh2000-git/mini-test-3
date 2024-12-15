import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    double getAmount(){
        return weight * getCost();
    }
    LocalDate getExpiryDate(){
        return getManufacturingDate().plusDays(7);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getRealMoney() {
        return getAmount()*90/100;
    }
}
