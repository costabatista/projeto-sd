/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.paulobatista.projetosoap;

import java.util.List;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.PathParam;

/**
 *
 * @author paulo
 */
//@Stateless
//@Path("ml.paulobatista.projetorest.rest.service.nota")
//@Path("notas")
@WebService
public class NotaDB extends AbstractFacade<Nota> {

    @PersistenceContext(unitName = "ml.paulobatista_ProjetoRest_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public NotaDB() {
        super(Nota.class);
    }

    public void createEntidade(Nota entity) {
        super.create(entity);
    }


   
    public void edit(Integer id, Nota entity) {
        
        super.edit(entity);
    }


    public void remove(Integer id) {
        super.remove(this.find(id));
    }

 
    public Nota find(Integer id) {
        return super.find(id);

    }


    public List<Nota> findAll() {
        return super.findAll();
    }


  
    public List<Nota> findRange(Integer from,Integer to) {
        return super.findRange(new int[]{from, to});
    }

  
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
