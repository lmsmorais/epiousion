package br.com.globalcode.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> items = new ArrayList<Item>();

    public CarrinhoCompras(Item item) {
        this.addItem(item);
    }

    public void addItem(Item item) {
        if (items.contains(item)) {
            int indice = items.indexOf(item);
            Item temp = (Item) items.get(indice);
            int quantidade = temp.getQuantidade();
            temp.setQuantidade(quantidade + 1);
        } else {
            this.items.add(item);
        }
    }

    public void removeItem(Item item) {
        if (items.contains(item))
            items.remove(item);
    }

    public double getValorTotal() {
        double precoTotal = 0;
        for(Item itemAtual: items) {
            precoTotal += itemAtual.getPrecoTotal();
        }
        return precoTotal;
    }

    public List<Item> getItems() {
        return items;
    }
}
