package br.com.crochet.teceamor.model;


import org.springframework.data.annotation.Id;


public class Endereco {

@Id
private String cep;
    private String loradouro;
    private Integer numeroCasa;
    private String bairro;
    private String UF;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLoradouro() {
        return loradouro;
    }

    public void setLoradouro(String loradouro) {
        this.loradouro = loradouro;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
}
