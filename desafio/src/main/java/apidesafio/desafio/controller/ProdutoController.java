package apidesafio.desafio.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import apidesafio.desafio.model.Produto;
import apidesafio.desafio.model.ProdutoID;

@RestController
public class ProdutoController {

	@PostMapping("/produto")
	public ResponseEntity<ProdutoID> criarProduto(@RequestBody final Produto produto) {
		System.out.println(produto);
		ProdutoID resultado = new ProdutoID(UUID.randomUUID().toString());
		return ResponseEntity.status(HttpStatus.CREATED)
				.contentType(MediaType.APPLICATION_JSON)
				.body(resultado);

	}

	@GetMapping("/produto")
	public List<Produto> pegarTodosProdutos() {
		List<Produto> resultado = new ArrayList<>();
		resultado.add(new Produto("1", "carro", new BigDecimal("123.3200")));
		resultado.add(new Produto("2", "moto", new BigDecimal("20.000")));
		resultado.add(new Produto("3", "aviao", new BigDecimal("300.000.000")));

		return resultado;
	}

	@GetMapping("/produto/{id}")
	public Produto produtoPorId(@PathVariable final String id) {
		System.out.println(id);
		return new Produto("4", "carro com defeito", new BigDecimal("111.11"));
	}

	@PatchMapping("/produto")
	public void patchProduto(@RequestBody Produto produto) {
		System.out.println(produto);
	}

	@DeleteMapping("/produto")
	public void delProduto(@RequestBody final String id) {
		System.out.println(id);
	}

}
