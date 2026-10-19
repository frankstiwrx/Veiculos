/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author frank
 */
public class Carro extends Veiculo {
    private int quantidadedeportas;
    private String categoria;
    private String nomedecarro;
    private Tracao tracao;

    public Carro() {
    }

    public Carro(int quantidadedeportas, String categoria, String nomedecarro, Tracao tracao) {
        this.quantidadedeportas = quantidadedeportas;
        this.categoria = categoria;
        this.nomedecarro = nomedecarro;
        this.tracao = tracao;
    }

    public int getQuantidadedeportas() {
        return quantidadedeportas;
    }

    public void setQuantidadedeportas(int quantidadedeportas) {
        this.quantidadedeportas = quantidadedeportas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomedecarro() {
        return nomedecarro;
    }

    public void setNomedecarro(String nomedecarro) {
        this.nomedecarro = nomedecarro;
    }

    public Tracao getTracao() {
        return tracao;
    }

    public void setTracao(Tracao tracao) {
        this.tracao = tracao;
    }
    
    
    
}
