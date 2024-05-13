/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

import java.time.LocalDate;

/**
 *
 * @author Vitor
 */
public class Tarefa {
    String nome;
    String desc;
    LocalDate val;
    
    public Tarefa(String nome, String desc, LocalDate val){
        this.nome = nome;
        this.desc = desc;
        this.val = val;
    }

    public LocalDate getVal() {
        return val;
    }

    public void setVal(LocalDate val) {
        this.val = val;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
