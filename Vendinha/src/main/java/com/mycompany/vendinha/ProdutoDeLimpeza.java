
package com.mycompany.vendinha;

public class ProdutoDeLimpeza {
    private String nomeProd;
    private String volume;
    private String marca;
    private String tipo;

    public ProdutoDeLimpeza(String nomeProd, String volume, String marca, String tipo) {
        this.nomeProd = nomeProd;
        this.volume = volume;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
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
        return "ProdutoDeLimpeza{" + "nomeProd=" + nomeProd + ", volume=" + volume + ", marca=" + marca + ", tipo=" + tipo + '}';
    }
    
}
