package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        // São estáticos e tem ref de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Lista
        // São dinâmicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Pilha
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Huyga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha stack atual = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha stack atualizada com pop = " + ninjaStack);
        System.out.println("Minha stack com o proximo elemento do topo = " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos");
        System.out.println("Minha stack atual: " + ninjaStack);
    }
}