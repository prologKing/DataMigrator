/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.UsersRight;

/**
 *
 * @author Developer
 */
public class UserRightModel {
    int urId;
    String urDesc;
    
    public UserRightModel(UsersRight uright) {
        this.urId = uright.getUrId();
        this.urDesc = uright.getUrDesc();
    }

    public int getUrId() {
        return urId;
    }

    public void setUrId(int urId) {
        this.urId = urId;
    }

    public String getUrDesc() {
        return urDesc;
    }

    public void setUrDesc(String urDesc) {
        this.urDesc = urDesc;
    }
    
    
}
