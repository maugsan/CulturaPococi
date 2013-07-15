/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author Pedro
 */
public class Banner {
    
    private int idBanner;
    private String  nombreBanner;
    private String urlBanner;
    private String descripcionBanner;

    public Banner(int idBanner, String nombreBanner, String urlBanner, String descripcionBanner) {
        this.idBanner = idBanner;
        this.nombreBanner = nombreBanner;
        this.urlBanner = urlBanner;
        this.descripcionBanner = descripcionBanner;
    }

    public int getIdBanner() {
        return idBanner;
    }

    public String getNombreBanner() {
        return nombreBanner;
    }

    public String getUrlBanner() {
        return urlBanner;
    }

    public String getDescripcionBanner() {
        return descripcionBanner;
    }

    public void setIdBanner(int idBanner) {
        this.idBanner = idBanner;
    }

    public void setNombreBanner(String nombreBanner) {
        this.nombreBanner = nombreBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }

    public void setDescripcionBanner(String descripcionBanner) {
        this.descripcionBanner = descripcionBanner;
    }
    
    
    
    
    
}
