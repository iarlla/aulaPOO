import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o custo de fábrica do carro
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Defina as taxas de distribuidor e impostos
        double taxaDistribuidor = 0.28; // 28%
        double taxaImpostos = 0.45; // 45%

        // Calcule o custo ao consumidor sem desconto
        double custoConsumidorSemDesconto = custoFabrica + (custoFabrica * taxaDistribuidor) + (custoFabrica * taxaImpostos);

        // Verifique se o consumidor é portador de necessidades especiais
        System.out.print("O consumidor é portador de necessidades especiais? (S/N): ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")) {
            // Aplicar desconto de 20% para consumidores com necessidades especiais
            double desconto = 0.20; // 20%
            double custoConsumidorComDesconto = custoConsumidorSemDesconto - (custoConsumidorSemDesconto * desconto);
            System.out.println("O custo ao consumidor com desconto é: " + custoConsumidorComDesconto);
        } else {
            // Caso contrário, exibir o custo ao consumidor sem desconto
            System.out.println("O custo ao consumidor é: " + custoConsumidorSemDesconto);
        }

        // Feche o objeto Scanner
        scanner.close();
    }
}
