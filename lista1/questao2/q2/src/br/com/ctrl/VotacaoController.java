/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ctrl;

import br.com.model.VotacaoModel;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author iarla
 */
public class VotacaoController {
    private VotacaoModel model;

    public VotacaoController() {
        model = new VotacaoModel();
    }

    public void registrarVoto(String matricula, int escolha) {
        model.registrarVoto(matricula, escolha);
    }

    public String obterResultado() {
        Map<String, Integer> votos40Horas = model.getVotos40Horas();
        Map<String, Integer> votos44Horas = model.getVotos44Horas();

        int totalVotos40Horas = votos40Horas.size();
        int totalVotos44Horas = votos44Horas.size();

        if (totalVotos40Horas > totalVotos44Horas) {
            return "A jornada de 40 horas obteve mais votos.";
        } else if (totalVotos44Horas > totalVotos40Horas) {
            return "A jornada de 44 horas obteve mais votos.";
        } else {
            return "Houve um empate entre as jornadas de trabalho.";
        }
    }

    public int getTotalVotos() {
        return model.getTotalVotos();
    }
}

