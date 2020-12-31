/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telefonica.checkupdatekbs.dao;

import com.telefonica.checkupdatekbs.model.thirdparty.CatalogRow;
import java.util.List;

/**
 *
 * @author 51976
 */
public interface KbsCatalogDao {
    
    public List<CatalogRow> getCatalogsByKb(String Kb);
    
}
