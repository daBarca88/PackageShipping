public class OvernightPackage extends Package{

    private double additionalFee;

    public OvernightPackage(Person sender, Person recipient, double weightInOunce, double costPerOunce, double additionalFee) {
        super(sender, recipient, weightInOunce, costPerOunce);
        this.additionalFee = additionalFee;
    }

    public double getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }

    @Override
    double calculateCost() {
        double totalCostPerOunce = super.costPerOunce + additionalFee;
        double totalCost = super.weightInOunce * totalCostPerOunce;
        return totalCost;
    }
}
