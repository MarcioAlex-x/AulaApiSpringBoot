package br.com.fujideia.iesp.tecback.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Serie {

    @Id
    @GeneratedValue
    private Integer Id;
    @Column(length = 30, nullable = false)
    private String titulo;

    @Column(length = 10, nullable = false)
    private String data;

    @Column (length = 6, nullable = false)
    private String duracao;


}
