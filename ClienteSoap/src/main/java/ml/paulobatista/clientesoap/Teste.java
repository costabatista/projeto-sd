/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.paulobatista.clientesoap;

import java.util.List;
import ml.paulobatista.projetosoap.Nota;
import ml.paulobatista.projetosoap.NotaDB;
import ml.paulobatista.projetosoap.NotaDBService;

/**
 *
 * @author paulo
 */
public class Teste {
    public static void main(String args[]) {
        NotaDB ws = new NotaDBService().getNotaDBPort();
        
        List<Nota> notas = ws.findAll();
        
        for(Nota n :  notas) {
            System.out.println(n.getTitulo());
        }
        
        Nota nota = new Nota();
        nota.setDescricao("ola mundo");
        nota.setTitulo("teste");
        
        ws.createEntidade(nota);
  
    }
}
