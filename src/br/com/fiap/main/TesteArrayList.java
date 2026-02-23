package br.com.fiap.main;

import br.com.fiap.entities.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayList {

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

    public static void main(String[] args) {

        // Preparar a lista
        ArrayList<Aluno>  listaAlunos = new ArrayList<Aluno>();

        // Preparar o objeto
        Aluno objAluno = null;

        // Laço de Repetição
       do{
           // Entradas

           // Instancia de Objeto
           objAluno = new Aluno();
           objAluno.setNome(texto("Nome: "));
           objAluno.setRm(texto("RM: "));
           objAluno.setTurma(texto("Turma: "));
           objAluno.setIdade(inteiro("Idade: "));
           objAluno.setNota(real("Nota: "));

           // Adicionando a Lista
           listaAlunos.add(objAluno);



       }while( JOptionPane.showConfirmDialog(
               null,
               "Cadastrar novo aluno?",
               "Cadastro de Alunos",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE
               ) == 0);

       // Saidas utilizando foreach
        for(Aluno a : listaAlunos){
            System.out.println(
                    "\n\nNome: " + a.getNome() +
                    "\n\nRM: " + a.getRm() +
                    "\n\nTurma: " + a.getTurma() +
                    "\n\nIdade: " + a.getIdade() +
                    "\n\nNota: " + a.getNota()
            );
        }
    }
}
