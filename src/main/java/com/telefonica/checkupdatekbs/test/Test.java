/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telefonica.checkupdatekbs.test;

import com.telefonica.checkupdatekbs.model.domain.Catalog;
import com.telefonica.checkupdatekbs.service.KbsCatalogService;
import com.telefonica.checkupdatekbs.service.impl.KbsCatalogServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author 51976
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kb = "KB4578973";
        
        KbsCatalogService service = new KbsCatalogServiceImpl();
        
        List<Catalog> catalogs = service.getCatalogsByKb(kb);
        catalogs.stream().forEach(catalog -> System.out.println(catalog));
        
        
        System.out.println(LocalDate.now());
        
        //Months.monthsBetween
        
    }
    
}
