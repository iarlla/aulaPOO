/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ctrl;

import br.com.model.AnalisePessoasModel;

/**
 *
 * @author iarla
 */
public class AnalisePessoasController {
    private AnalisePessoasModel model;

    public AnalisePessoasController(AnalisePessoasModel model) {
        this.model = model;
    }

    public void analisarPessoa(int idade, double altura, double peso) {
        model.analisarPessoa(idade, altura, peso);
    }
}

