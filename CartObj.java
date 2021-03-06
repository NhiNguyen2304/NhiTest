/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.cart;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class CartObj implements Serializable{
    private String customerId;
    Map<String, Integer> items;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }
    
    public void addItemToCart(String title){
        if(this.items == null){
            this.items = new HashMap<String, Integer>();
        }
        int quantity = 1;
        if(this.items.containsKey(items)){
            quantity = this.items.get(title) +1;
        }
        this.items.put(title, quantity);
    }
    public void removeItemCart(String title){
        if(this.items == null){
            return;
        }
        if(this.items.containsKey(title)){
            this.items.remove(title);
            if(this.items.isEmpty()){
                this.items = null;
            }
        }
        }
     System.out.println("Nhi Nguyen");
     System.out.println("Hello Nhi");
    }
    

