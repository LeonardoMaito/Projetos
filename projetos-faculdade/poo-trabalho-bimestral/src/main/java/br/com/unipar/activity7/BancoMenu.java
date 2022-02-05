/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.activity7;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Maito
 */
public class BancoMenu {

    Banco banco = new Banco();
    Relatorio relatorio = new Relatorio();
    private int returnValue;

    public void inicializar() {
        do {

            String[] buttons = {"Criar Conta Corrente", "Criar Conta Poupança", "Selecionar Conta", "Remover Conta", "Gerar Relatório", "Cancel"};
            returnValue = JOptionPane.showOptionDialog(null, "Escolha um serviço pra prosseguir: ", "Escolha de herói", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);

            switch (returnValue) {
                case 0:
                    banco.inserirConta(5, new ContaCorrente());
                    break;

                case 1:
                    banco.inserirConta(10, new ContaPoupança());
                    break;

                case 2:
                    submenu();
                    break;

                case 3:
                    banco.removerConta(5);
                    break;

                case 4:
                    relatorio.gerarRelatorio(banco);
            }
        } while (returnValue != 5);

    }

    public void submenu() {

        ContaBancaria contaBancaria;

        contaBancaria = pegarConta();

        do {

            String[] buttons = {"Depositar", "Sacar", "Transferir", "Gerar Relatório", "Voltar", "Cancel"};
            returnValue = JOptionPane.showOptionDialog(null, "Escolha um serviço pra prosseguir: ", "Escolha de herói", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);

            switch (returnValue) {
                case 0:
                    contaBancaria.depositar(pegarValor());
                    break;

                case 1:
                    contaBancaria.sacar(pegarValor());
                    break;

                case 2:
                    contaBancaria.transferir(pegarValor(), pegarConta());
                    break;

                case 3:
                    System.out.println(contaBancaria.getSaldoConta());
                    break;

                case 4:
                    inicializar();
            }
        } while (returnValue != 5);

    }

    public double pegarValor() {
        String valor;
        double valorInput;
        valor = JOptionPane.showInputDialog("Insira o valor da transferência");
        return valorInput = Integer.parseInt(valor);

    }

    public ContaBancaria pegarConta() {
        String inputId;
        int id;
        inputId = JOptionPane.showInputDialog("Insira o ID da conta");
        id = Integer.parseInt(inputId);
        return banco.procurarConta(id);
    }
}
