package org.kawahedukasi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("test")
public class materiDana {

    // path param ya gais
    @GET
    @Path("/{nama}")
    @Produces(MediaType.TEXT_PLAIN)
    public String inputByPathParam(@PathParam("nama") String nama) {
        return "nama saya :" + nama;
    }

    // input dari query param

    @GET
    @Path("/param")
    @Produces(MediaType.TEXT_PLAIN)
    public String inputAngka(@QueryParam("nama") String nama, @QueryParam("umur") int umur,
            @QueryParam("address") String address) {
        return "nama :" + nama + " umur:" + umur + " address:" + address;
    }

    // input dengan header

    @GET
    @Path("/header")
    @Produces(MediaType.TEXT_PLAIN)

    public String inputByHeader(@HeaderParam("nama") String nama, @HeaderParam("umur") int umur) {
        return "nama:" + nama + ", umur: " + umur;
    }

    // @GET
    // @Path("/body")
    // @Produces(MediaType.TEXT_PLAIN)

    // public String inputByBody(@HeaderParam("nama") String nama,
    // @HeaderParam("umur") int umur) {
    // return "nama:" + nama + ", umur: " + umur;
    // }

    // harus dengan metod POST
    // menggunakan body
    // @POST
    // @Path("/body")
    // @Produces(MediaType.TEXT_PLAIN)
    // @Consumes(MediaType.TEXT_PLAIN)
    // public String inputByReqBody(String input) {
    // return "Input nya adalah => " + input;
    // }

}
