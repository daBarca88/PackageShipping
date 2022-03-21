public abstract class Package {
    Person sender;
    Person recipient;
    double weightInOunce;
    double costPerOunce;

    public Package(Person sender, Person recipient, double weightInOunce, double costPerOunce) {
        this.sender = sender;
        this.recipient = recipient;
        if (weightInOunce < 0) {
            this.weightInOunce = 0.1;
        } else {
            this.weightInOunce = weightInOunce;
        }

        if (costPerOunce < 0) {
            this.costPerOunce = 1;
        } else {
            this.costPerOunce = costPerOunce;
        }

    }

    double calculateCost() {
        return weightInOunce * costPerOunce;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    public double getWeightInOunce() {
        return weightInOunce;
    }

    public void setWeightInOunce(double weightInOunce) {
        this.weightInOunce = weightInOunce;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        this.costPerOunce = costPerOunce;
    }
}
