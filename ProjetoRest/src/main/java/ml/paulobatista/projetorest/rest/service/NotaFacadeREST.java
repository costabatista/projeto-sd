/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.paulobatista.projetorest.rest.service;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ml.paulobatista.projetorest.rest.Nota;

/**
 *
 * @author paulo
 */
@Stateless
//@Path("ml.paulobatista.projetorest.rest.service.nota")
@Path("notas")
public class NotaFacadeREST extends AbstractFacade<Nota> {

    @PersistenceContext(unitName = "ml.paulobatista_ProjetoRest_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public NotaFacadeREST() {
        super(Nota.class);
    }

    @POST
    @Override
    //@Path("post/")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Nota entity) {
        super.create(entity);
    }
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("post")
    public void createJSON(String entity) {
        Nota nota = new Gson().fromJson(entity, Nota.class);
        this.create(nota);
    }
    @PUT
    @Path("put/{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, String entity) {
        Nota nota = new Gson().fromJson(entity, Nota.class);
        super.edit(nota); 
    }

    @DELETE
    @Path("del/{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public String find(@PathParam("id") Integer id) {
        Nota nota = super.find(id);
        Gson gson = new Gson();
        return gson.toJson(nota);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Nota> findAll() {
        return super.findAll();
    }
    
    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    public String findAllJSON() {
        List<Nota> notas = this.findAll();
        Gson gson = new Gson();
        
        return gson.toJson(notas);
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Nota> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
