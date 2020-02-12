package com.edo.designpattern;

/**
 * Class representing the context of use.
 */
public class Sale {
    
    private float total;
    private String name;
    private Discount discount;
    
    public Sale(String name, float total){
        this.name = name;
        this.total = total;
        this.discount = null;
    }
    
    /**
     * The method returns the total of a sale.
     * If there's no discount defined, returns the total.
     * Else apply to dscount strategy to compute the total.
     * @return float
     */
    public float getTotal(){
        if(this.discount == null){
            return this.total;
        }else{
            return this.discount.applyDiscount(total);
        }
    }
    
    public void setDiscount(Discount discount){
        this.discount = discount;
    }
    
    @Override
    public String toString(){
        String str = "Nome prodotto: " + this.name + '\n';
        str += "Totale con sconto: " + this.getTotal() + '\n';
        str += "Totale: " + this.total;
        return str;
    }
    
}
