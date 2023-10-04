import java.util.Scanner;

public class AnalisePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, pessoasMaisDe50 = 0, pessoasEntre10e20 = 0, pessoasMenosDe40Quilos = 0;
        double altura, peso, somaAltura = 0;
        int totalPessoas = 0;

        System.out.println("Análise de pessoas - Digite os dados das pessoas (ou digite '0' para encerrar):");

        while (true) {
            System.out.print("Idade (ou '0' para encerrar): ");
            idade = scanner.nextInt();
            if (idade == 0) {
                break;
            }

            System.out.print("Altura (em metros): ");
            altura = scanner.nextDouble();

            System.out.print("Peso (em quilos): ");
            peso = scanner.nextDouble();

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

        if (totalPessoas > 0) {
            double mediaAlturaPessoasEntre10e20 = pessoasEntre10e20 > 0 ? somaAltura / pessoasEntre10e20 : 0;
            double porcentagemPessoasMenosDe40Quilos = (double) pessoasMenosDe40Quilos / totalPessoas * 100;

            System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + pessoasMaisDe50);
            System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturaPessoasEntre10e20 + " metros");
            System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " + porcentagemPessoasMenosDe40Quilos + "%");
            System.out.println("Total de vezes que o sistema rodou: " + totalPessoas);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }
}
