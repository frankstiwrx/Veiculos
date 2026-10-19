package veiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */

// Hoje Voce faz o metodo de manipular veiculo 

public class Principal {

    public static void main(String[] args) {

        int menu = 100;
        Carro c = new Carro();

        while (menu != 0) {

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "CRIAÇÃO DE VEÍCULOS\n\n\n\nSelecione uma Opção:\n1. Criar Veículo\n2. Ver Veículo Criado\n3. Manipular Carro\n0. Sair"));

            if (menu == 1) {

                int submenu = 100;

                while (submenu != 0) {

                    submenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção de criação:\n1. Especificações do Carro\n2. Especificações Mecânicas\n0. Sair"));

                    if (submenu == 1) {

                        String marca = JOptionPane.showInputDialog(null, "Digite a marca do carro:");
                        String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro:");
                        String cor = JOptionPane.showInputDialog(null, "Digite a cor do carro:");
                        String tipo = JOptionPane.showInputDialog(null, "Digite o tipo do carro:");
                        String placa = JOptionPane.showInputDialog(null, "Digite a placa do carro:");

                        c.setModelo(modelo);
                        c.setCor(cor);
                        c.setPlaca(placa);
                        c.setTipo(tipo);
                        c.setMarca(marca);

                    } else if (submenu == 2) {
                        double aceleracao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a aceleração do carro:"));
                        double velocidademaxima = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a velocidade maxima do carro:"));
                        int marcha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de marchas do carro:"));
                        int quantidadedeportas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de portas do carro:"));
                        String categoria = JOptionPane.showInputDialog(null, "Digite a categoria do carro:");
                        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do carro:"));;
                        int tracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a tração do seu carro:\n1. Traseira\n2. Dianteira\n3. Integral"));

                        if (tracao == 1) {
                            c.setTracao(Tracao.Traseira);
                        } else if (tracao == 2) {
                            c.setTracao(Tracao.Dianteira);
                        } else if (tracao == 3) {
                            c.setTracao(Tracao.Integral);
                        } else {
                            JOptionPane.showMessageDialog(null, "Opção Ínvalida");
                        }

                        c.setAceleracao(aceleracao);
                        c.setVelocidademaxima(velocidademaxima);
                        c.setMarcha(marcha);
                        c.setQuantidadedeportas(quantidadedeportas);
                        c.setPeso(peso);
                        c.setCategoria(categoria);

                    } else if(submenu!=0) {

                        JOptionPane.showMessageDialog(null, "Opção Inválida!");

                    }

                }

            } else if (menu == 2) {

                JOptionPane.showMessageDialog(null, c.toString());

            } else if(menu!=0){

                JOptionPane.showMessageDialog(null, "Opção Inválida!");

            }

        }

    }

}
