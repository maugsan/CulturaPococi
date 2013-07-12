/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class URL {

    String u;
    public  URL() {}

    public String codificar(String url) {

        try {
            u = URLEncoder.encode(url, "base64");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(URL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    public String decodificar(String url) {

        try {
            u = URLDecoder.decode(url, "base64");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(URL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;

    }
}
