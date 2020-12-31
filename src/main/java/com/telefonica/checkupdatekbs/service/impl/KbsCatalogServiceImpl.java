/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telefonica.checkupdatekbs.service.impl;

import com.telefonica.checkupdatekbs.dao.KbsCatalogDao;
import com.telefonica.checkupdatekbs.dao.impl.KbsCatalogDaoImpl;
import com.telefonica.checkupdatekbs.model.domain.Catalog;
import com.telefonica.checkupdatekbs.model.thirdparty.CatalogRow;
import com.telefonica.checkupdatekbs.service.KbsCatalogService;
import java.util.ArrayList;


/**
 *
 * @author 51976
 */
import java.util.List;/**
 *
 * @author 51976
 */
public class KbsCatalogServiceImpl implements KbsCatalogService{

    KbsCatalogDao catalogDao;
    
    public KbsCatalogServiceImpl() {
        catalogDao = new KbsCatalogDaoImpl();
    }
    
    @Override
    public List<Catalog> getCatalogsByKb(String kb) {
        
        List<Catalog> catalogs = new ArrayList<>();
        List<CatalogRow> catalogRows = catalogDao.getCatalogsByKb(kb);
        
        catalogRows.subList(1, catalogRows.size()).stream().map((catalogoRow) -> {
            Catalog catalogo = new Catalog();
            catalogo.setTitle(catalogoRow.getDataList().get(1));
            catalogo.setProduct(catalogoRow.getDataList().get(2));
            catalogo.setClassification(catalogoRow.getDataList().get(3));
            catalogo.setLastUpdate(catalogoRow.getDataList().get(4));
            catalogo.setVersion(catalogoRow.getDataList().get(5));
            catalogo.setSize(catalogoRow.getDataList().get(6));
            return catalogo;            
        }).forEach((catalogo) -> {
            catalogs.add(catalogo);
        });
        
        return catalogs;
    }
}
