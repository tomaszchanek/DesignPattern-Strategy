package strategies;

/*
 * Doesn't know about how a customer wants to pay
 * */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // More stuff should go here to store payment details if needed
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setClosed() {
        isClosed = true;
    }

    public boolean isClosed() {
        return isClosed;
    }
}
