package com.edo.designpattern;

/**
 * Main class to test the pattern
 */
public class Test {
    
    public static void main(String[] args){
        
        Sale sale_1 = new Sale("Televisore", 1000);
        Sale sale_2 = new Sale("Lavatrice", 500);
        
        System.out.println(sale_1.toString());
        System.out.println(sale_2.toString());
        System.out.println("-------------------------");
        
        sale_1.setDiscount(new DiscountAge(30));
        sale_2.setDiscount(new DiscountThreshold(40));
        
        System.out.println(sale_1.toString());
        System.out.println(sale_2.toString());
        System.out.println("-------------------------");
        
    }
    
}
