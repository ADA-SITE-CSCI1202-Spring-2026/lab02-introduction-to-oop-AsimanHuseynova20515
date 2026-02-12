package week04.invoice;

public class Invoice {

    private String partNum;
    private String partDescription;
    private int numberOfPurchasedItems;
    private double pricePerItem;

    Invoice(String partNum, String partDescription,
            int numberOfPurchasedItems, double pricePerItem) {

        this.partNum = partNum;
        this.partDescription = partDescription;

        if (numberOfPurchasedItems > 0)
            this.numberOfPurchasedItems = numberOfPurchasedItems;
        else
            this.numberOfPurchasedItems = 0;

        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    public String getPartNum() {
        return this.partNum;
    }

    public void setPartNum(String num) {
        this.partNum = num;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public void setPartDescription(String des) {
        this.partDescription = des;
    }

    public int getNumberOfItemsPurchasedItems() {
        return numberOfPurchasedItems;
    }

    public void setNumberOfItemsPurchasedItems(int num) {

        if (num > 0)
            this.numberOfPurchasedItems = num;
        else
            this.numberOfPurchasedItems = 0;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setPricePerItem(double pr) {

        if (pr > 0)
            this.pricePerItem = pr;
        else
            this.pricePerItem = 0.0;
    }
}
