package br.web;

import br.entity.HashTool;
import br.repositories.InMemory.InMemoryHashToolRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


import java.util.ArrayList;

@Named("jFHashTool")
@RequestScoped
public class JfHashTool {

    private String messagem;

    public ArrayList<HashTool> getAll() {
        return new InMemoryHashToolRepository().getAll();
    }
    public void add(){
        HashTool hashTool = new HashTool(this.messagem);
        new InMemoryHashToolRepository().add(hashTool);
    }
    public String getMessagem() {
        return messagem;
    }
    public void setMessagem(String messagem) {
        this.messagem = messagem;
    }
}
