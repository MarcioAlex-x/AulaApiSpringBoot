package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme filme){
        filme = repository.save(filme);
        return filme;
    }

    public List<Filme> listar(){

        return repository.findAll();
    }

    public boolean excluir(Filme filme){
        try{
            repository.delete(filme);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
      return true;
    }
}
