/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telefonica.checkupdatekbs.service;

import com.telefonica.checkupdatekbs.model.domain.Catalog;
import java.util.List;

/**
 *
 * @author 51976
 */
public interface KbsCatalogService {
    
    public List<Catalog> getCatalogsByKb(String Kb);
}
