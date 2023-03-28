package br.com.fujideia.iesp.tecback.web;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Serie;
import br.com.fujideia.iesp.tecback.service.SerieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @Autowired
    private SerieService service;

    @PostMapping
    public ResponseEntity<Serie> salvar(Serie serie){
        serie = service.salvar(serie);
        return ResponseEntity.ok(serie);
    }
    @GetMapping
    public ResponseEntity<List<Serie>> listar(){

        return ResponseEntity.ok(service.listar());
    }

    @DeleteMapping
    public ResponseEntity<Serie> excluir(Serie serie){
        filme = service.excluir(serie);
        return ResponseEntity.ok(serie);
    }
}
