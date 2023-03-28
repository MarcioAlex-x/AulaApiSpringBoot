package br.com.fujideia.iesp.tecback.web;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
private FilmeService service;

    @PostMapping
    public ResponseEntity<Filme> salvar(Filme filme){
        filme = service.salvar(filme);
        return ResponseEntity.ok(filme);
    }
    @GetMapping
    public ResponseEntity<List<Filme>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @DeleteMapping
    public ResponseEntity<Filme> excluir(Filme filme){
        filme = service.excluir(filme);
        return ResponseEntity.ok(filme);
    }

}
