/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Developer
 */
public class V1ProductModel {
    private int product_index;
    private String product_code;
    private String product_name;

    public V1ProductModel() {
    }
    
    public V1ProductModel(Object[] obj){
      this.product_index = Integer.parseInt(String.valueOf(obj[0]));
      this.product_code = String.valueOf(obj[1]);
      this.product_name = String.valueOf(obj[2]);
    }

    public int getProduct_index() {
        return product_index;
    }

    public void setProduct_index(int product_index) {
        this.product_index = product_index;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    @Override
    public String toString() {
        return "V1ProductModel{" + "product_index=" + product_index + ", product_code=" + product_code + ", product_name=" + product_name + '}';
    }

    
    
}
