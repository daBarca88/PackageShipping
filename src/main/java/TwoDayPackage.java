public class TwoDayPackage extends Package{
        private double fee;

        public TwoDayPackage(Person sender, Person recipient, double weightInOunce, double costPerOunce, double fee) {
            super(sender, recipient, weightInOunce, costPerOunce);
            this.fee = fee;
    }

    @Override
    double calculateCost(){
            return super.calculateCost() + fee;
    }
}
