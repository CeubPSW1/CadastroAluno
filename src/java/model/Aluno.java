/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Alexandre.Torres
 */
@Entity( name="TB_ALUNO")
public class Aluno {
    @Id
    @GeneratedValue 
    @Column (name ="CODIGO")
    private int codigo;    
    
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn( name="ra_pk")
    private Ra ra;
    @Column (name ="NOME", nullable = false)
    private String nome;
    
    @OneToMany ( mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Nota> notas = new ArrayList<>();

    public void setNota( String mencao){
        Nota nota = new Nota();
        nota.setMencao(mencao);
        nota.setAluno(this);
        notas.add(nota);
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Ra getRa() {
        return ra;
    }

    public void setRa(Ra ra) {
        this.ra = ra;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
