/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telefonica.checkupdatekbs.dao.impl;

import com.telefonica.checkupdatekbs.config.Connection;
import com.telefonica.checkupdatekbs.dao.KbsCatalogDao;
import com.telefonica.checkupdatekbs.model.thirdparty.CatalogRow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author 51976
 */
public class KbsCatalogDaoImpl implements KbsCatalogDao {

    org.jsoup.Connection connection;

    public KbsCatalogDaoImpl() {
        connection = Connection.getDataFromWebsite();
    }

    @Override
    public List<CatalogRow> getCatalogsByKb(String kb) {

        ArrayList<CatalogRow> catalogRows = new ArrayList<>();

        Document document;
        try {
            document = connection.data("q", kb)
                    .post();

            document.getElementById("ctl00_catalogBody_updateMatches")
                    .getElementsByTag("tr").stream().map((row) -> {
                        CatalogRow catalogoRow = new CatalogRow();
                        row.getElementsByTag("td").stream().forEach((column) -> {
                            catalogoRow.getDataList().add(column.text());
                        });
                return catalogoRow;
            }).forEach((catalogoRow) -> {
                catalogRows.add(catalogoRow);
            });
        } catch (IOException ex) {
            Logger.getLogger(KbsCatalogDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return catalogRows;
    }

}
