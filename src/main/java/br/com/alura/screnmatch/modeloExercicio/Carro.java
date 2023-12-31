package br.com.alura.screnmatch.modeloExercicio;

public class Carro {
    private String marca;
    private Integer preco;
    private Integer ano;

    public Carro(String marca, Integer preco, Integer ano) {
        this.marca = marca;
        this.preco = preco;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPreco() {
        System.out.println(this.preco);
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "[" + "\n" + " marca: " + this.marca + "\n" + " ano: " + this.preco + "\n" + " ano: " + this.ano + "\n" + "]";
    }


}
