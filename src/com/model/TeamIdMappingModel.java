/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.TeamIdMapping;

/**
 *
 * @author Developer
 */
public class TeamIdMappingModel {

    int id;
    String v1teamId;
    int v2teamId;

    public TeamIdMappingModel() {
    }

    public TeamIdMappingModel(int id, String v1teamId, int v2teamId) {
        this.id = id;
        this.v1teamId = v1teamId;
        this.v2teamId = v2teamId;
    }

    public TeamIdMappingModel(TeamIdMapping mapp) {
        this.id = mapp.getId();
        this.v1teamId = mapp.getV1teamId();
        this.v2teamId = mapp.getV2teamId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getV1teamId() {
        return v1teamId;
    }

    public void setV1teamId(String v1teamId) {
        this.v1teamId = v1teamId;
    }

    public int getV2teamId() {
        return v2teamId;
    }

    public void setV2teamId(int v2teamId) {
        this.v2teamId = v2teamId;
    }

    @Override
    public String toString() {
        return "TeamIdMappingModel{" + "id=" + id + ", v1teamId=" + v1teamId + ", v2teamId=" + v2teamId + '}';
    }

}
