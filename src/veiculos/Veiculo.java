/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

import java.util.Objects;

/**
 *
 * @author frank
 */
public class Veiculo {

    private String cor;
    private String placa;
    private double peso;
    private String tipo;
    private String marca;
    private String modelo;
    private double aceleracao;
    private double velocidademaxima;
    private double velocidade;
    public boolean estadodaluz;
    private int estadomarcha;
    private int marcha;

    public Veiculo() {
    }

    public Veiculo(String cor, String placa, double peso, String tipo, String marca, String modelo, double aceleracao, double velocidademaxima, double velocidade, boolean estadodaluz, int marcha, int estadomarcha) {
        this.cor = cor;
        this.placa = placa;
        this.peso = peso;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.aceleracao = aceleracao;
        this.velocidademaxima = velocidademaxima;
        this.velocidade = velocidade;
        this.estadodaluz = estadodaluz;
        this.marcha = marcha;
        this.estadomarcha = estadomarcha;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isEstadodaluz() {
        return estadodaluz;
    }

    public void setEstadodaluz(boolean estadodaluz) {
        this.estadodaluz = estadodaluz;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getEstadomarcha() {
        return estadomarcha;
    }

    public void setEstadomarcha(int estadomarcha) {
        this.estadomarcha = estadomarcha;
    }
    
    
    

    //Equals e Hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.cor);
        hash = 79 * hash + Objects.hashCode(this.placa);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.tipo);
        hash = 79 * hash + Objects.hashCode(this.marca);
        hash = 79 * hash + Objects.hashCode(this.modelo);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.aceleracao) ^ (Double.doubleToLongBits(this.aceleracao) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.velocidademaxima) ^ (Double.doubleToLongBits(this.velocidademaxima) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.velocidade) ^ (Double.doubleToLongBits(this.velocidade) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.aceleracao) != Double.doubleToLongBits(other.aceleracao)) {
            return false;
        }
        if (Double.doubleToLongBits(this.velocidademaxima) != Double.doubleToLongBits(other.velocidademaxima)) {
            return false;
        }
        if (Double.doubleToLongBits(this.velocidade) != Double.doubleToLongBits(other.velocidade)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo:\n" + "Cor: " + cor + "\nPlaca: " + placa + "\nPeso: " + peso + "\nTipo: " + tipo + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAceleracao: " + aceleracao + "\nVelocidademaxima: " + velocidademaxima;
    }

    //Comportamentos
    public void acelerar() {
        velocidade = 1.2*velocidade;
    }

    public void acelerar(double aceleracao) {
        if (velocidademaxima >= velocidade) {
            velocidade = velocidade + aceleracao;
        } else {
            velocidade = velocidade + 0;
        }
    }
    
    public void frear(){
        
    }
    public void frear(double aceleracao){
        if(velocidade>=0){
            velocidade=velocidade-aceleracao;
        }else{
            velocidade = velocidade-0;
        }
    }

    public boolean ligarluzes(boolean estadoluz) {

        if (estadoluz == true) {

            System.out.println("o Estado da luz é aceso!");
            return true;

        } else {

            System.out.println("o Estado da luz é apagado!");
            return false;

        }

    }
    
    public void sobemarcha(){
        if(estadomarcha==marcha||estadomarcha<0||estadomarcha>marcha){
            System.out.println("Não é possivel mudar marchas.");
        }else{
            estadomarcha=estadomarcha+1;
        }
    }
    
    public void descemarcha(){
        if(estadomarcha==marcha||estadomarcha<0||estadomarcha>marcha){
            System.out.println("Não é possivel mudar marchas.");
        }else{
            estadomarcha=estadomarcha-1;
        }
    }
    
    

}
