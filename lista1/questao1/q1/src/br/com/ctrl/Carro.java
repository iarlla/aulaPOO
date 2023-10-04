/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ctrl;

/**
 *
 * @author iarla
 */

public class Carro {
    private double custoFabrica;

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double taxaDistribuidor = 0.28; // 28%
        double taxaImpostos = 0.45; // 45%
        return custoFabrica + (custoFabrica * taxaDistribuidor) + (custoFabrica * taxaImpostos);
    }

    public double calcularCustoConsumidorComDesconto(boolean necessidadesEspeciais) {
        double custoSemDesconto = calcularCustoConsumidor();
        if (necessidadesEspeciais) {
            double desconto = 0.20; // 20%
            return custoSemDesconto - (custoSemDesconto * desconto);
        } else {
            return custoSemDesconto;
        }
    }
}

