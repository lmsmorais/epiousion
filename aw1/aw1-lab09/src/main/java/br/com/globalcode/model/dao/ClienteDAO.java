package br.com.globalcode.model.dao;

import br.com.globalcode.model.Cliente;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ClienteDAO {

    private static ClienteDAO instance;
    private static final Map<String, String[]> cidadesMap;
    private static Map<Integer, Cliente> clientesMap;

    static {
        cidadesMap = new HashMap<String, String[]>();
        cidadesMap.put("MG", new String[]{"Belo Horizonte", "Uberaba", "Uberlandia"});
        cidadesMap.put("RJ", new String[]{"Buzios", "Cabo Frio", "Rio de Janeiro"});
        cidadesMap.put("SP", new String[]{"Campinas", "Santos", "São Paulo"});
        clientesMap = new HashMap<Integer, Cliente>();
        try {
            JAXBContext ctx = JAXBContext.newInstance(Clientes.class);
            Unmarshaller unmarshaller = ctx.createUnmarshaller();
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("br/com/globalcode/model/dao/clientes.xml");
            Clientes clientes = (Clientes) unmarshaller.unmarshal(in);
            List<Cliente> lista = clientes.getClientes();
            if (lista != null && !lista.isEmpty()) {
                for (Cliente cliente : lista) {
                    clientesMap.put(cliente.getId(), cliente);
                }
            }
        } catch (JAXBException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private ClienteDAO() {
        super();
    }

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }

    public List<String> getCidades(String estado) {
        String[] cidades = cidadesMap.get(estado);
        return Arrays.asList(cidades);
    }

    public Cliente getClienteById(Integer id) {
        return clientesMap.get(id);
    }
}
