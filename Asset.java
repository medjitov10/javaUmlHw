package GA.homework.umlHW;

public class Asset {
    private int id;
    private double shares;

    public int getId() {
        return id;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }

    protected double calculateValue(double val) {
        return val;
    }

    private double purchasePrice;

}
