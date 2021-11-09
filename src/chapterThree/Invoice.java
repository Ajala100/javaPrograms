package chapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantityPurchased, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if(quantityPurchased < 0)
            throw new IllegalArgumentException("Quantity purchased cannot be less than zero");
        else{ this.quantityPurchased = quantityPurchased;}
        if(pricePerItem < 0.0)
        throw new IllegalArgumentException("price per item cannot be less than zero");
        else{ this.pricePerItem = pricePerItem; }
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setQuantityPurchased(int quantityPurchased){
        this.quantityPurchased = quantityPurchased;
    }

    public int getQuantityPurchased(){
        return quantityPurchased;
    }

    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public double getPricePerItem(){ return pricePerItem; }

    public double getInvoiceAmount(int quantityPurchased, double pricePerItem){
        if(quantityPurchased < 0) quantityPurchased = 0;
        if(pricePerItem < 0) pricePerItem = 0;
        return quantityPurchased * pricePerItem;
    }
}
