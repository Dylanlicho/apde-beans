/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraison.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import livraison.beans.LivraisonService;
import livraison.entity.OrderEntity;

/**
 *
 * @author attuku
 */
@Path("")
public class LivraisonController {
    @EJB
    LivraisonService livraisonService;
    
    @GET
    @Path("livraison/{buyer}")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<OrderEntity> getAllOrder(){
        return livraisonService.getAll();
    }
}
