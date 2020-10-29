package br.com.globalcode.aw.dao;

import java.util.List;
import br.com.globalcode.model.Produto;
import br.com.globalcode.exception.GlobalcodeException;

public interface ProdutoDAO {

    public void save(Produto p) throws GlobalcodeException;

    public List<Produto> getCatalogoProdutos() throws GlobalcodeException;

    public Produto getProdutoById(int id) throws GlobalcodeException;

    public void createTable() throws GlobalcodeException;
}