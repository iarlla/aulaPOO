import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VotacaoJornadaTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> votos40Horas = new HashMap<>();
        Map<String, Integer> votos44Horas = new HashMap<>();
        int totalVotos = 0;

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

            if (escolha == 1) {
                votos40Horas.put(matricula, votos40Horas.getOrDefault(matricula, 0) + 1);
            } else if (escolha == 2) {
                votos44Horas.put(matricula, votos44Horas.getOrDefault(matricula, 0) + 1);
            } else {
                System.out.println("Escolha inválida. Por favor, escolha 1 (40 horas) ou 2 (44 horas).");
            }

            totalVotos++;
        }

        System.out.println("Resultado da votação:");
        System.out.println("Total de votos para 40 horas: " + votos40Horas.size());
        System.out.println("Total de votos para 44 horas: " + votos44Horas.size());

        if (votos40Horas.size() > votos44Horas.size()) {
            System.out.println("A jornada de 40 horas obteve mais votos.");
        } else if (votos44Horas.size() > votos40Horas.size()) {
            System.out.println("A jornada de 44 horas obteve mais votos.");
        } else {
            System.out.println("Houve um empate entre as jornadas de trabalho.");
        }

        System.out.println("Total de funcionários que votaram: " + totalVotos);

        scanner.close();
    }
}
