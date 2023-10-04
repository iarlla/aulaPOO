/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;

import br.com.model.VotacaoModel;
import br.com.ctrl.VotacaoController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author iarla
 */
import java.util.Scanner;

public class VotacaoView {
    private VotacaoController controller;

    public VotacaoView(VotacaoController controller) {
        this.controller = controller;
    }

    public void iniciarVotacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à votação da jornada de trabalho!");

        while (true) {
            System.out.print("Digite sua matrícula (ou digite 'sair' para encerrar a votação): ");
            String matricula = scanner.nextLine();

            if (matricula.equalsIgnoreCase("sair")) {
                break; // Encerra a votação se a opção 'sair' for digitada
            }

            System.out.println("Escolha a jornada de trabalho:");
            System.out.println("1. 40 horas");
            System.out.println("2. 44 horas");
            System.out.print("Digite o número da sua escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            controller.registrarVoto(matricula, escolha);
        }

        System.out.println("Resultado da votação:");
        System.out.println("Total de votos para 40 horas: " + controller.getTotalVotos40Horas());
        System.out.println("Total de votos para 44 horas: " + controller.getTotalVotos44Horas());
        System.out.println(controller.obterResultado());
        System.out.println("Total de funcionários que votaram: " + controller.getTotalVotos());

        scanner.close();
    }

    public static void main(String[] args) {
        VotacaoController controller = new VotacaoController();
        VotacaoView view = new VotacaoView(controller);
        view.iniciarVotacao();
    }
}

