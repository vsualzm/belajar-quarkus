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

@Path("tugas17")
public class TugasKalkulator {
    // Pertambahan menggunakan path param
    @GET
    @Path("/{angka1}+{angka2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String inputByPathParam(@PathParam("angka1") int angka1, @PathParam("angka2") int angka2,
            @PathParam("hasil") int hasil, @PathParam("data") String data) {
        data = "hasil anda adalah : ";
        hasil = angka1 + angka2;
        return data + hasil;
    }

    // pengurangan menggunakan param
    @GET
    @Path("/param")
    @Produces(MediaType.TEXT_PLAIN)
    public String inputParam(@QueryParam("angka1") int angka1, @QueryParam("angka2") int angka2,
            @QueryParam("data") String data, @QueryParam("hasil") int hasil) {

        data = "hasil pengurangan adalah : ";
        hasil = angka1 - angka2;
        return data + hasil;
    }

    // perkalian menggunakan header
    @GET
    @Path("/header")
    @Produces(MediaType.TEXT_PLAIN)
    public String inputByHeader(@HeaderParam("angka1") int angka1,
            @HeaderParam("angka2") int angka2,
            @HeaderParam("hasil") int hasil) {
        hasil = angka1 * angka2;
        return "perkalian dari " + angka1 + " dan " + angka2 + " adalah:" + hasil;
    }

    // menghitung luas persegi panjang dengan path param

    @GET
    @Path("/{panjang}x{lebar}")
    @Produces(MediaType.TEXT_PLAIN)

    public String luasPersegiPanjang(@PathParam("panjang") int panjang, @PathParam("lebar") int lebar,
            @PathParam("hasil") int hasil) {
        hasil = panjang * lebar;
        return "hasil luas persegi panjang : " + hasil;
    }

    // menghitung luas segitiga dengan param
    @GET
    @Path("/luas-segitiga")
    @Produces(MediaType.TEXT_PLAIN)
    public String luasSegitiga(@QueryParam("alas") int alas, @QueryParam("tinggi") int tinggi,
            @QueryParam("data") String data, @QueryParam("hasil") int hasil) {

        data = "hasil pengurangan adalah : ";
        hasil = (alas * tinggi) / 2;
        return data + hasil;
    }

    // mencari luas lingkaran dengan header
    @GET
    @Path("/header")
    @Produces(MediaType.TEXT_PLAIN)
    public String inputByHeader2(@HeaderParam("jari") int jari, @HeaderParam("hasil") float hasil) {
        hasil = (22 / 7) * jari * jari;
        return "Luas lingkaran adalah" + hasil;
    }

    // konversi data dari kilogram ke gram memakai body
    @POST
    @Path("/konversikgtog")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String inputByReqBody(Integer input) {
        int berat = input * 1000;
        return "Input nya adalah => " + berat;
    }

}
