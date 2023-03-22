package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")
public class Filme {

    @Id
    //Precisa para adicionar inteiros automaticamente
    @GeneratedValue
    private Integer id;
    @Column(length = 30, nullable = false )
    private String titulo;
    //Não é obrigatório
    @Column(name = "ds_sinopse", length = 500, nullable = false)
    private String sinopse;

    @Transient
    private String teste;

}
