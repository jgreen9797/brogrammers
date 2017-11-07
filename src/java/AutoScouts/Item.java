/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoScouts;

/**
 *
 * @author Felix Perez
 */
public class Item {
    private String name;
    private double price;
    public Item(){}
    public Item(String n, double p){
        this.name = n;
        this.price = p;
    }
    public void setName(String s){
        this.name = s;
    }
    public void setPrice(double p){
        this.price = p;
    }
    
}
