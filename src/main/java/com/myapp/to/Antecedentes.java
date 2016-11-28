/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.to;

/**
 *
 * @author jeffe_000
 */
public class Antecedentes {
    public boolean presentoinfarto;
    public boolean esfumador;
    public boolean esalergico;

    public boolean isPresentoinfarto() {
        return presentoinfarto;
    }

    public void setPresentoinfarto(boolean presentoinfarto) {
        this.presentoinfarto = presentoinfarto;
    }

    public boolean isEsfumador() {
        return esfumador;
    }

    public void setEsfumador(boolean esfumador) {
        this.esfumador = esfumador;
    }

    public boolean isEsalergico() {
        return esalergico;
    }

    public void setEsalergico(boolean esalergico) {
        this.esalergico = esalergico;
    }
}
