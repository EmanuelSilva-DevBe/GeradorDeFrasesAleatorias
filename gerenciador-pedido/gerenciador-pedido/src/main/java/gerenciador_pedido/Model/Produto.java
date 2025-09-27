package gerenciador_pedido.Model;

import gerenciador_pedido.Repository.ProdutoRepository;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.checkerframework.common.aliasing.qual.Unique;

@Entity(name = "Produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nome;
    @Column(name = "Valor")
    private Double preco;
    private ProdutoRepository repositorioProduto;

    public Produto(ProdutoRepository repositorioProduto) {
        this.repositorioProduto = repositorioProduto;
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
