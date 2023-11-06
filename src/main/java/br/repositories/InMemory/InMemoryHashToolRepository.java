package br.repositories.InMemory;

import br.entity.HashTool;

import java.util.ArrayList;

public class InMemoryHashToolRepository {
    private static ArrayList<HashTool> dados;

    public InMemoryHashToolRepository(){
        if (dados == null) {
            dados = new ArrayList<>();
        }
    }
    public void add(HashTool dado) {
        dados.add(dado);
    }
    public ArrayList<HashTool> getAll() {
        return dados;
    }

}
