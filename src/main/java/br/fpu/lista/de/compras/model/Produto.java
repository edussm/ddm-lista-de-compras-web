package br.fpu.lista.de.compras.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String codigo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Unidade unidade;

    @Column(nullable = false)
    private Double quantidade;

    @Column(nullable = false)
    private Double preco;

    public String getCodigo() {
        return codigo;
    }

    public Produto setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public Produto setUnidade(Unidade unidade) {
        this.unidade = unidade;
        return this;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Produto setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Double getPreco() {
        return preco;
    }

    public Produto setPreco(Double preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", unidade=" + unidade +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
