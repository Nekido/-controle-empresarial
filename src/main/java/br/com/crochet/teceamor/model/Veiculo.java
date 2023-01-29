package br.com.crochet.teceamor.model;

import java.time.LocalDateTime;

public class Veiculo {

    private long id;
    private Enum tipo;
    private String placa;
    private String marca;
    private String anoFabricacao;
    private String anoModelo;
    private LocalDateTime dataCompra;
    private boolean ipvaVencido;

    public Veiculo(long id, Enum tipo, String placa, String marca, String anoFabricacao,
                   String anoModelo, LocalDateTime dataCompra, boolean ipvaVencido) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.dataCompra = dataCompra;
        this.ipvaVencido = ipvaVencido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }

    public boolean isIpvaVencido() {
        return ipvaVencido;
    }

    public void setIpvaVencido(boolean ipvaVencido) {
        this.ipvaVencido = ipvaVencido;
    }
}
