package br.com.globalcode.aw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import br.com.globalcode.model.Produto;
import br.com.globalcode.exception.GlobalcodeException;

public class ProdutoDB implements ProdutoDAO {

    private final String INSERT_QUERY = "insert into produtos (nome,preco,marca) values (?,?,?)";
    private final String SELECT_ALL_QUERY = "select * from produtos";
    private final String SELECT_BY_ID_QUERY = "select * from produtos where id = ? ";
    private final static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS produtos ( nome varchar(50) default NULL,  preco float(50,0) default NULL, marca varchar(50) default NULL,id smallint NOT NULL auto_increment,PRIMARY KEY  (id))";

    @Override
    public void save(Produto p) throws GlobalcodeException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prepStmt = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement(INSERT_QUERY);
            prepStmt.setString(1, p.getNome());
            prepStmt.setDouble(2, p.getPreco());
            prepStmt.setString(3, p.getMarca());
            prepStmt.execute();
        } catch (SQLException e) {
            String msg = "[ProdutosDB][save(Produto p)]: " + e.getMessage();
            GlobalcodeException ge = new GlobalcodeException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
    }

    @Override
    public List<Produto> getCatalogoProdutos() throws GlobalcodeException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Produto> listaProdutos = new ArrayList<Produto>();
        try {
            conn = ConnectionManager.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SELECT_ALL_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String marca = rs.getString("marca");
                double preco = rs.getFloat("preco");
                Produto p = new Produto(id, nome, marca, preco);
                listaProdutos.add(p);
            }
        } catch (SQLException e) {
            String msg = "[ProdutosDB][getCatalogoProdutos()]: " + e.getMessage();
            GlobalcodeException ge = new GlobalcodeException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, stmt, rs);
        }
        return listaProdutos;
    }

    @Override
    public Produto getProdutoById(int id) throws GlobalcodeException {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        Produto oProduto = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement(SELECT_BY_ID_QUERY);
            prepStmt.setInt(1, id);
            rs = prepStmt.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("nome");
                String marca = rs.getString("marca");
                double preco = rs.getFloat("preco");
                oProduto = new Produto(id, nome, marca, preco);
            }
        } catch (SQLException e) {
            String msg = "[ProdutosDB][getProdutoById()]: " + e.getMessage();
            GlobalcodeException ge = new GlobalcodeException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
        return oProduto;
    }

    @Override
    public void createTable() throws GlobalcodeException {
        Connection conn = null;
        Statement stmt = null;
        try {

            conn = ConnectionManager.getConexao();
            stmt = conn.createStatement();
            stmt.executeUpdate(CREATE_TABLE);

            Produto[] produtos = {
                new Produto("Maquina fotografica", "Kodak", 80),
                new Produto("CD - Meu Reino Encantado", "Som Livre", 18),
                new Produto("TV 29",  "Phillipas", 1750),
                new Produto("CD - As Gargantas do Brasil", "BMG", 13),
                new Produto("CD - Ta Nervoso...Vai Pesca", "BMG", 15)
            };

            PreparedStatement prepStmt = conn.prepareStatement(INSERT_QUERY);
            for (Produto p : produtos) {
                prepStmt.setString(1, p.getNome());
                prepStmt.setDouble(2, p.getPreco());
                prepStmt.setString(3, p.getMarca());
                prepStmt.execute();
                prepStmt.clearParameters();
            }
            prepStmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalcodeException("Erro ao criar a tabela de produtos", e);
        } finally {
            ConnectionManager.closeAll(conn, stmt);
        }
    }
}
