/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telefonica.checkupdatekbs.config;

import org.jsoup.Jsoup;

/**
 *
 * @author 51976
 */
public class Connection {

    public static org.jsoup.Connection getDataFromWebsite() {

        return Jsoup.connect("https://www.catalog.update.microsoft.com/Search.aspx");

    }
}
