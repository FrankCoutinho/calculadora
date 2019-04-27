package br.edu.unicesumar.model;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/json/produto")
public class ProdutoService {

    @GET
    @Path("/get")
    @Produces("application/json")
    public Produto getProdutoJSON() {

        Produto produto = new Produto();
        produto.setNome("Moto X - Android");
        produto.setQuantidade(10);

        return produto;
    }

    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response criarProdutoJSON(Produto produto) {

        String result = "Product created : " + produto;
        return Response.status(201).entity(result).build();
    }
}
