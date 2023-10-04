/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

/**
 *
 * @author iarla
 */

public class VotacaoModel {
    private int qdtVoto40;
    private int voto40;
    private int qdtVoto44;
    private int voto44;
    private int totalVotos;
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
        totalVotos++;
    }

    public int getVoto40() {
        return voto40;
    }

    public void setVoto40(int voto40) {
        this.voto40 = voto40;
        qdtVoto40++;
    }

    public int getVoto44() {
        return voto44;
    }

    public void setVoto44(int voto44) {
        this.voto44 = voto44;
        qdtVoto44++;
    }

    public int getTotalVotos() {
        return totalVotos;
    }
}