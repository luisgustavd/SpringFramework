package com.java.aula2;
//BIBLIOTECAS
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//Utilização do 'Entity' para declarar uma classe como uma entidade.
//A aplicação vai construir uma relação de entre a classe e uma tabela de mesmo nome na base de dados.
//Uma entidade representa, na Orientação a Objetos, uma tabela do banco de dados
//Cada instância dessa entidade representa uma linha dessa tabela.
public class Emprego{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min = 4)
    private String  titulo;
    @NotNull
    @Size(min = 3)
    private String empresa;
    @NotNull
    @Size(min = 10)
    private String descricao;
    //

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
