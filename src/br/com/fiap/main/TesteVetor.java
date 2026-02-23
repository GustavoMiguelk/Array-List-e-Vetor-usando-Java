package br.com.fiap.main;

import br.com.fiap.entities.Aluno;

import javax.swing.*;

public class TesteVetor {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // Int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // Double
    static int real (String j){
        return (int) Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args){

        // Preparar Vetor definindo a quantidade máxima
        Aluno[] vetorAluno = new Aluno[3];

        // Preparar Indice
        int indice = 0;

        // Laço de Repetição

        do{
            // Entradas
            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setNome(texto("Nome: "));
            vetorAluno[indice].setRm(texto("RM: "));
            vetorAluno[indice].setTurma(texto("Turma: "));
            vetorAluno[indice].setIdade(inteiro("Idade: "));
            vetorAluno[indice].setNota(real("Nota: "));

            indice++;


        }while(JOptionPane.showConfirmDialog(
                null,
                "Cadastrar novo aluno?",
                "Cadastro de Alunos",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        )  == 0);

    }
}
