
package com.mycompany.vendinha;

public class ProdutoBebidas {
    private String nomeBebida = "Testeteste";
    private String sabor;
    private String volume;
    private String marca;
    private String tipo;

    public ProdutoBebidas(String nomeBebida, String sabor, String volume, String marca, String tipo) {
        this.nomeBebida = nomeBebida;
        this.sabor = sabor;
        this.volume = volume;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProdutoBebidas{" + "nomeBebida=" + nomeBebida + ", sabor=" + sabor + ", volume=" + volume + ", marca=" + marca + ", tipo=" + tipo + '}';
    }
    
    

}
