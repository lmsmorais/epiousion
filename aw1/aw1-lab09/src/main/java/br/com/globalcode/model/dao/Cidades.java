package br.com.globalcode.model.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cidades")
public class Cidades implements Serializable {

    private String estado;
    private List<String> cidades;

    public Cidades() {
        cidades = new ArrayList<String>();
    }

    @XmlElement(name = "cidade")
    public List<String> getCidades() {
        return cidades;
    }

    public void setCidades(List<String> cidades) {
        this.cidades = cidades;
    }

    @XmlAttribute(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void addCidade(String cidade) {
        if (cidade != null && !cidades.contains(cidade)) {
            cidades.add(cidade);
        }
    }
}
