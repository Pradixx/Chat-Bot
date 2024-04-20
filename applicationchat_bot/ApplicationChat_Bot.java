package applicationchat_bot;
import java.util.Scanner;

public class ApplicationChat_Bot {
    //para colocar um time sleep é só usar Thread.sleep(2000)
    /**
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        long start = System.currentTimeMillis();
        //mini apresentação
        System.out.println("Bem vindo ao Chat-Bot.");
        Thread.sleep(2000);
        System.out.println("Aqui você poderá tirar suas principais dúvidas da sua escola!");
        Thread.sleep(1000);
        //nome do 'cliente'
        System.out.println("Mas antes de começar as perguntas");
        Thread.sleep(1000);
        System.out.println("Digite aqui seu nome.");
        Thread.sleep(1000);
        //onde o cliente coloca seu nome
        String nome = ler.nextLine();
        Thread.sleep(1000);
        //introdução para as perguntas
        System.out.printf("Olá %s, vamos para as perguntas agora!", nome);
        Thread.sleep(1000);
        

        System.out.println("------------------------------------------");
        //perguntas iniciais
        System.out.println("Dúvida sobre a secretaria [1]");
        Thread.sleep(1000);
        System.out.println("Dúvida sobre sua turma [2]");
        Thread.sleep(1000);
        System.out.println("Dúvida sobre o curso [3]");
        Thread.sleep(1000);
        //1ª resposta, perguntas iniciais
        int reposta = ler.nextInt();
        Thread.sleep(1000);
       

        System.out.println("------------------------------------------");
        //perguntas 1
        switch (reposta){
            case 1:
            //resposta secretaria
                System.out.println("Dúvida sobre o bilhete. [1]");
                Thread.sleep(1000);
                System.out.println("Dúvida sobre os seus dados. [2]");
                Thread.sleep(1000);
                System.out.println("Dúvida sobre a rematrícula. [3]");
                Thread.sleep(1000);
                break;
            case 2:
            //resposta turma
                System.out.println("Mudar de turma. [4]");
                Thread.sleep(1000);
                System.out.println("Onde é a minha sala? [5]");
                Thread.sleep(1000);
                break;
            case 3:
            //resposta curso
                System.out.println("Mudar de curso. [6]");
                Thread.sleep(1000);
                System.out.println("Melhorias/opinião para o curso. [7]");
                Thread.sleep(1000);
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
        //resposta perguntas 1
        int resposta1 = ler.nextInt();


        System.out.println("------------------------------------------");
        //perguntas 2
        switch (resposta1){
            case 1:
            //reposta bilhete
                System.out.println("Fazer solicitação do bilhete. [1]");
                Thread.sleep(1000);
                System.out.println("Como fazer meu bilhete? [2]");
                Thread.sleep(1000);
                System.out.println("Renovar meu bilhete. [3]");
                Thread.sleep(1000);
                break;
            case 2:
            //repostas dados
                System.out.println("Mudar meus dados. [4]");
                Thread.sleep(1000);
                System.out.println("Como imprimir meus dados? [5]");
                Thread.sleep(1000);
                break;
            case 3:
            //repostas rematrícula
                System.out.println("Por onde faço minha rematricula? [6]");
                Thread.sleep(1000);
                System.out.println("Por onde peço o boleto para a rematricula? [7]");
                Thread.sleep(1000);
                break;
            case 4:
            //repostas mudar de turma
                System.out.println("Como descobrir a minha turma? [6]");
                Thread.sleep(1000);
                System.out.println("Como faço para me mudar de turma? [7]");
                Thread.sleep(1000);
                break;
            case 5:
            //repostas onde é a sala
                System.out.println("Como faço para mudar de sala? [7]");
                Thread.sleep(1000);
                System.out.println("Como achar minha sala? [8]");
                Thread.sleep(1000);
                break;
            case 6:
            //repostas mudar curso
                System.out.println("Quero me mudar de curso. [9]");
                Thread.sleep(1000);
                break;
            case 7:
            //repostas Melhorias/opinião do curso
                System.out.println("Deixe aqui Melhorias/opinião para seu curso. [10]");
                Thread.sleep(1000);
                String melhorias = ler.nextLine();
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
        if (melhorias = 10) {
            System.out.println("Obrigado pela sua avaliação ou critica");
        }
        //resposta perguntas 2
        int resposta2 = ler.nextInt();

        
        ler.close(); 
    }
}