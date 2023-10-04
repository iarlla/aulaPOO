/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

/**
 *
 * @author iarla
 */
import java.util.Scanner;

public class AnalisePessoasModel {
    private int pessoasMaisDe50;
    private int pessoasEntre10e20;
    private int pessoasMenosDe40Quilos;
    private double somaAltura;
    private int totalPessoas;

    public AnalisePessoasModel() {
        pessoasMaisDe50 = 0;
        pessoasEntre10e20 = 0;
        pessoasMenosDe40Quilos = 0;
        somaAltura = 0;
        totalPessoas = 0;
    }

    public void analisarPessoa(int idade, double altura, double peso) {
        totalPessoas++;

        if (idade > 50) {
            pessoasMaisDe50++;
        }

        if (idade >= 10 && idade <= 20) {
            pessoasEntre10e20++;
            somaAltura += altura;
        }

        if (peso < 40) {
            pessoasMenosDe40Quilos++;
        }
    }

    public int getPessoasMaisDe50() {
        return pessoasMaisDe50;
    }

    public int getPessoasEntre10e20() {
        return pessoasEntre10e20;
    }

    public double getMediaAlturaPessoasEntre10e20() {
        return pessoasEntre10e20 > 0 ? somaAltura / pessoasEntre10e20 : 0;
    }

    public double getPorcentagemPessoasMenosDe40Quilos() {
        return (double) pessoasMenosDe40Quilos / totalPessoas * 100;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }
}