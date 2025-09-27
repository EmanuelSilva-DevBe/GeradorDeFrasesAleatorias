package gerenciador_pedido;

import gerenciador_pedido.Model.Produto;
import gerenciador_pedido.Repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidoApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(GerenciadorPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto = new Produto("Chocolate em Barra", 18.99);

		Produto repositorio = new Produto(repo)

	}
}
