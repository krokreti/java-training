package com.produto.apirest.resource;

import com.produto.apirest.models.Produto;
import com.produto.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Api de produtos")
@CrossOrigin(origins = "*")
public class ProdutoResource {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value="Lista todos os produtos.")
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return ResponseEntity.status(200).body(produtos);
    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value="Retorna um determinado produto.")
    public ResponseEntity<Object> buscaProduto(@PathVariable(value = "id") long id) {
        try {
            Produto produto = produtoRepository.findById(id);
            if(produto!=null) {
                return ResponseEntity.status(200).body(produto);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
            }
        } catch (Exception e ) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Não foi possível realizar a busca.");
        }
    }

    @PostMapping("/produto")
    @ApiOperation(value="Cria um produto.")
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        Produto produtoNovo = produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoNovo);
    }

    @DeleteMapping("/produto/{id}")
    @ApiOperation(value="Remove um produto.")
    public ResponseEntity deletarProduto(@PathVariable(value = "id") long id) {
    try {
        produtoRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Produto removido com sucesso!");
    } catch(EmptyResultDataAccessException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
    } catch(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno no servidor.");
    }
    }

    @PutMapping("/produto")
    @ApiOperation(value="Atualiza um produto.")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
