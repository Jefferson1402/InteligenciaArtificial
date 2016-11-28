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
public class Persona {
    private Antecedentes anteced;
    private EnfermedadViral enfviral;
    private String problema;
    private boolean esniño;

    public EnfermedadViral getEnfviral() {
        return enfviral;
    }

    public void setEnfviral(EnfermedadViral enfviral) {
        this.enfviral = enfviral;
    }

    public Antecedentes getAnteced() {
        return anteced;
    }

    public void setAnteced(Antecedentes anteced) {
        this.anteced = anteced;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public boolean isEsniño() {
        return esniño;
    }

    public void setEsniño(boolean esniño) {
        this.esniño = esniño;
    }
}
