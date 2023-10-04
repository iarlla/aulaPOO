/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;

import br.com.model.AnalisePessoasModel;
import br.com.ctrl.AnalisePessoasController;

/**
 *
 * @author iarla
 */
public class AnalisePessoasView {
    private AnalisePessoasController controller;

    public AnalisePessoasView(AnalisePessoasController controller) {
        this.controller = controller;
    }

    public void iniciarAnalise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Análise de pessoas - Digite os dados das pessoas (ou digite '0' para encerrar):");

        while (true) {
            System.out.print("Idade (ou '0' para encerrar): ");
            int idade = scanner.nextInt();
            if (idade == 0) {
                break;
            }

            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Peso (em quilos): ");
            double peso = scanner.nextDouble();

            controller.analisarPessoa(idade, altura, peso);
        }

        AnalisePessoasModel model = controller.getModel();

        if (model.getTotalPessoas() > 0) {
            System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + model.getPessoasMaisDe50());
            System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + model.getMediaAlturaPessoasEntre10e20() + " metros");
            System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " + model.getPorcentagemPessoasMenosDe40Quilos() + "%");
            System.out.println("Total de vezes que o sistema rodou: " + model.getTotalPessoas());
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        AnalisePessoasModel model = new AnalisePessoasModel();
        AnalisePessoasController controller = new AnalisePessoasController(model);
        AnalisePessoasView view = new AnalisePessoasView(controller);
        view.iniciarAnalise();
    }
}
