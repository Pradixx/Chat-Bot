import java.util.Scanner;

public class ApplicationChat2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        MensagemDeIntrodução();
        String usuário = PegarUsuário(ler);
        MensagensIniciais(usuário);
        int Resposta = PegarResposta(ler);
        IdentificadorResposta(Resposta, ler);
        ler.close();
    }

    private static void MensagemDeIntrodução() {
        System.out.println("Bem vindo ao Chat-Bot.");
        System.out.println("Aqui você poderá tirar suas principais dúvidas da sua escola!");
        System.out.println("Mas antes de começar as perguntas");
        System.out.println("Digite aqui seu nome.");
    }

    private static String PegarUsuário(Scanner ler) {
        System.out.println("Olá, qual é o seu nome?");
        return ler.nextLine();
    }

    private static void MensagensIniciais(String usuário) {
        System.out.printf("Olá %s, vamos para as perguntas agora!%n", usuário);
        System.out.println("Dúvida sobre a secretaria [1]");
        System.out.println("Dúvida sobre sua turma [2]");
        System.out.println("Dúvida sobre o curso [3]");
    }

    private static int PegarResposta(Scanner ler) {
        System.out.println("Digite o número da sua pergunta:");
        return ler.nextInt();
    }

    private static void IdentificadorResposta(int Resposta, Scanner ler) {
        switch (Resposta) {
            case 1:
                handleSecretariaQuestions(ler);
                break;
            case 2:
                handleTurmaQuestions(ler);
                break;
            case 3:
                handleCursoQuestions(ler);
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
    }

    private static void handleSecretariaQuestions(Scanner ler) {
        // Implement this method
    }

    private static void handleTurmaQuestions(Scanner ler) {
        // Implement this method
    }

    private static void handleCursoQuestions(Scanner ler) {
        // Implement this method
    }
}