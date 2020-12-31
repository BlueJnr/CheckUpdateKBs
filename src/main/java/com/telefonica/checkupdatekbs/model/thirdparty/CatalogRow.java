/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telefonica.checkupdatekbs.model.thirdparty;

import java.util.ArrayList;

/**
 *
 * @author 51976
 */
public class CatalogRow {
    
    private ArrayList<String> dataList;

    public CatalogRow() {
        dataList = new ArrayList<>();
    }

    public ArrayList<String> getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList<String> dataList) {
        this.dataList = dataList;
    }
}
