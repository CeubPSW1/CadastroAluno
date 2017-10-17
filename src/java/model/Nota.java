/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alexandre.Torres
 */

@Entity (name = "TB_NOTA")
public class Nota {
    @Id
    @GeneratedValue
    private int id;
    private String mencao;
    
    @ManyToOne
    private Aluno aluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMencao() {
        return mencao;
    }

    public void setMencao(String mencao) {
        this.mencao = mencao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
            
    
}
