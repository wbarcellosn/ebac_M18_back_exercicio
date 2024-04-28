/**
 * @author winic
 */
package com.wbarcellosn.tarefa;

import javax.swing.*;

@Tabela("Tabela do módulo 18")
public class ClasseComAnnotation {

    public static void main(String[] args) {

        Tabela tabelaAnnotation = ClasseComAnnotation.class.getAnnotation(Tabela.class);

        if (tabelaAnnotation != null) {

            String mensagem = tabelaAnnotation.value();

            JOptionPane.showMessageDialog(null,"Nome da Tabela: " + mensagem);
        }
    }
}
