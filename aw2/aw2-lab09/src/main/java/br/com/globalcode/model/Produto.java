package br.com.globalcode.model;

public class Produto {

    private String nome;
    private String marca;
    private double preco;
    private int id;

    public Produto(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public Produto(int id, String nome, String marca, double preco) {
        this(nome, marca, preco);
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String desc) {
        this.marca = desc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    @Override
    public String toString() {
        String pNome = " Nome     :" + nome + "\n";
        String pId = " ID    :" + id + "\n";
        String pMarca = " Marca:" + marca + "\n";
        String pPreco = " Preco    :" + preco + "\n";
        String dados = pNome + pId + pMarca + pPreco + "\n";
        return dados;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Produto) {
            Produto oProduto = (Produto) o;
            return this.id == oProduto.id;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }
}