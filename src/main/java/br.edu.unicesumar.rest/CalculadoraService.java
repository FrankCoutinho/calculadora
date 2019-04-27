package br.edu.unicesumar.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraService {

    @GET
    @Path("/soma/{param1}/{param2}")
    public Response somar(@PathParam("param1") Integer parametro1, @PathParam("param2") Integer parametro2) {

        Integer soma = parametro1 + parametro2;
        String result = "SOMA: " + soma;

        return Response.status(200).entity(result).build();
    }
}
