package br.com.globalcode.model.dao;

import br.com.globalcode.model.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "clientes")
public class Clientes implements Serializable {

    private List<Cliente> clientes;

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @XmlElement(name = "cliente")
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        if (cliente != null) {
            if (clientes == null) {
                clientes = new ArrayList<Cliente>();
            }
            clientes.add(cliente);
        }
    }
}
