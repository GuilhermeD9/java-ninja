package Desafios.Desafio03;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("\nDADOS DO NINJA");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de dificuldade: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }
}