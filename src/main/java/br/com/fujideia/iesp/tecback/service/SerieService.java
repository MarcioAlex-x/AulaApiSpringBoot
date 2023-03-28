package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Serie;
import br.com.fujideia.iesp.tecback.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repository;

    public Serie salvar(Serie serie){
        serie = repository.save(serie);
        return serie;
    }

    public List<Serie> listar(){

        return repository.findAll();
    }

    public boolean excluir(Serie serie){
        try{
            repository.delete(serie);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
