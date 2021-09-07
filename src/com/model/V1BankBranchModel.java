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
public class V1BankBranchModel {
    int bank_branch_index;
    String bank_branch_name;

    public V1BankBranchModel() {
    }
    
    
    
    public V1BankBranchModel(Object[] obj){
      this.bank_branch_index = Integer.parseInt(String.valueOf(obj[0]));
      this.bank_branch_name = String.valueOf(obj[1]);
    }

    public int getBank_branch_index() {
        return bank_branch_index;
    }

    public void setBank_branch_index(int bank_branch_index) {
        this.bank_branch_index = bank_branch_index;
    }

    public String getBank_branch_name() {
        return bank_branch_name;
    }

    public void setBank_branch_name(String bank_branch_name) {
        this.bank_branch_name = bank_branch_name;
    }

    @Override
    public String toString() {
        return "V1BankBranchModel{" + "bank_branch_index=" + bank_branch_index + ", bank_branch_name=" + bank_branch_name + '}';
    }
    
    
}
