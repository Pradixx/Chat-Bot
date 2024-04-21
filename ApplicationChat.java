import java.util.Scanner;
public class ApplicationChat {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        MensagemDeIntrodução();
        
        String usuário = PegarUsuário(ler);
        MensagensIniciais(usuário);

        int Resposta1 = PegarResposta(ler);
        IdentificadorResposta(Resposta1, ler);

        int Resposta2 = PegarRespostaSecretaria(ler);
        IdentificadorSecretaria(Resposta2, ler);
        
        int Resposta3 = PegarRespostaBilhete(ler);
        IdentificadorBilhete(Resposta3, ler);
        
        int Resposta4 = PegarRespostaSolicitação(ler);
        IdentificadorSolicitação(Resposta4, ler);

        //QueroSolicitarBilhetePerguntas

        //PrazoBilhetePerguntas

        int Resposta5 = PegarRespostaRenovação(ler);
        IdentificadorRenovação(Resposta5, ler);

        ler.close();
    }
    private static void MensagemDeIntrodução() {
        System.out.println("Bem vindo ao Chat-Bot.");
        System.out.println("Aqui você poderá tirar suas principais dúvidas da sua escola!");
        System.out.println("Mas antes de começar as perguntas");
        System.out.println("Digite aqui seu nome.");
    }
    private static String PegarUsuário(Scanner ler) {
        return ler.nextLine();
    }

    private static void MensagensIniciais(String usuário) {
        System.out.println("\nOlá " + usuário + ", você pode escolher uma opção abaixo:");
        System.out.println("Dúvida sobre a secretaria [1]");
        System.out.println("Dúvida sobre sua turma [2]");
        System.out.println("Dúvida sobre o curso [3]");
    }
    private static int PegarResposta(Scanner ler) {
        System.out.println("\nDigite o número da sua pergunta:");
        return ler.nextInt();
    }
    private static void IdentificadorResposta(int Resposta1, Scanner ler) {
        switch (Resposta1) {
            case 1:
                SecretariaPerguntas(ler);
                break;
            case 2:
                TurmaPerguntas(ler);
                break;
            case 3:
                CursoPerguntas(ler);
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
    }

    private static void SecretariaPerguntas(Scanner ler) {
        System.out.println("\nBilhete [1]");
        System.out.println("Dados [2]");
        System.out.println("Rematrícula [3]");
        }
    private static int PegarRespostaSecretaria(Scanner ler) {
        System.out.println("\nDigite o número da sua pergunta:");
        return ler.nextInt();
    }
    private static void IdentificadorSecretaria(int Resposta2, Scanner ler) {
        switch (Resposta2) {
            case 1:
                BilhetePerguntas(ler);
                break;
            case 2:
                DadosPerguntas(ler);
                break;
            case 3:
                RematrículaPerguntas(ler);
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
}

    private static void BilhetePerguntas(Scanner ler) {
        System.out.println("\nSolicitação [1]");
        System.out.println("Renovação [2]");
        System.out.println("Cancelamento [3]");
    }
    private static int PegarRespostaBilhete(Scanner ler) {
        System.out.println("\nDigite o número da sua pergunta:");
        return ler.nextInt();
    }
    private static void IdentificadorBilhete(int Resposta3, Scanner ler) {
        switch (Resposta3) {
            case 1:
                SolicitaçãoPerguntas(ler);
                break;
            case 2:
                RenovaçãoPerguntas(ler);
                break;
            case 3:
                CancelamentoPerguntas(ler);
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
}

    private static void SolicitaçãoPerguntas(Scanner ler) {
        System.out.println("\nQuero solicitar um bilhete [1]");
        System.out.println("Prazo de reposta da solicitação [2]");
    }
    private static int PegarRespostaSolicitação(Scanner ler) {
        System.out.println("\nDigite o número da sua pergunta:");
        return ler.nextInt();
    }
    private static void IdentificadorSolicitação(int Resposta4, Scanner ler) {
        switch (Resposta4) {
            case 1:
                QueroSolicitarBilheteFinal(ler);
                break;
            case 2:
                PrazoBilhetePerguntas(ler);
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
}
    private static void QueroSolicitarBilheteFinal(Scanner ler) {
    // Implement this method
    }

    private static void PrazoBilhetePerguntas(Scanner ler) {
        System.out.println("\nQual o Prazo de resposta da Solicitação [1]");
    }

    private static void RenovaçãoPerguntas(Scanner ler) {
        System.out.println("\nNão consigo fazer a renovação do bilhete. O que faço? [1]");
    }
    private static int PegarRespostaRenovação(Scanner ler) {
        System.out.println("\nDigite o número da sua pergunta:");
        return ler.nextInt();
    }
    private static void IdentificadorRenovação(int Resposta5, Scanner ler) {
        switch (Resposta5) {
            case 1:
                RespostaFinalRenovação(ler);
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
    }
    private static void RespostaFinalRenovação(Scanner ler) {
        // Implement this method
        }

    private static void CancelamentoPerguntas(Scanner ler) {
    // Implement this method
    }
    private static void DadosPerguntas(Scanner ler) {
        // Implement this method
    }
    private static void RematrículaPerguntas(Scanner ler) {
        // Implement this method
    }
    private static void TurmaPerguntas(Scanner ler) {
        // Implement this method
    }
    private static void CursoPerguntas(Scanner ler) {
        // Implement this method
    }
}