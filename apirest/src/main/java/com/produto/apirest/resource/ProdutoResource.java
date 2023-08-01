package com.produto.apirest.resource;

import com.produto.apirest.models.Produto;
import com.produto.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value="Retorna um determinado produto.")
    public Produto buscaProduto(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    @ApiOperation(value="Cria um produto.")
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto/{id}")
    @ApiOperation(value="Remove um produto.")
    public void deletarProduto(@PathVariable(value = "id") long id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("/produto")
    @ApiOperation(value="Atualiza um produto.")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
