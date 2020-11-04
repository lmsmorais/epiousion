/**
 * @author Globalcode 
 *
 */
package br.com.globalcode.model;

public class Item {

    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int i) {
        quantidade = i;
    }

    public double getPrecoTotal() {
        return this.produto.getPreco() * quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Item) {
            Item item = (Item) o;
            return this.getProduto().equals(item.getProduto());
        } else
            return false;
    }
}
