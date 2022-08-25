/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendinha;

public class ProdutoDeHigiene {
    private String nomeProdHigiene;
    private String volume;
    private String marca;
    private String fabricante;
    private String tipo;

    public ProdutoDeHigiene(String nomeProdHigiene, String volume, String marca, String fabricante, String tipo) {
        this.nomeProdHigiene = nomeProdHigiene;
        this.volume = volume;
        this.marca = marca;
        this.fabricante = fabricante;
        this.tipo = tipo;
    }

    public String getNomeProdHigiene() {
        return nomeProdHigiene;
    }

    public void setNomeProdHigiene(String nomeProdHigiene) {
        this.nomeProdHigiene = nomeProdHigiene;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProdutoDeHigiene{" + "nomeProdHigiene=" + nomeProdHigiene + ", volume=" + volume + ", marca=" + marca + ", fabricante=" + fabricante + ", tipo=" + tipo + '}';
    }
}
