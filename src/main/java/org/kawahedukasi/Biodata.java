package org.kawahedukasi;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class Biodata {
    @GET
    @Path("/namasaya")
    @Produces(MediaType.TEXT_PLAIN)
    public String namaSaya() {
        String nama, alamat, kota, data;
        nama = "ilham";
        alamat = "Jl kotakenangan";
        kota = "Bandung";
        data = "nama saya adalah : " + nama + "\n" + "Alamat: " + alamat + "\n" + "kota : " + kota;

        return data;
    }

    @GET
    @Path("/umursaya")
    @Produces(MediaType.TEXT_PLAIN)
    public String umur() {
        String data2, tanggalLahir;
        int umur;
        tanggalLahir = "15 Juni 2000";
        umur = 22;
        data2 = "Tanggal Lahir : " + tanggalLahir + "\n" + "umur: " + umur;

        return data2;
    }

    @GET
    @Path("/infosepatu")
    @Produces(MediaType.TEXT_PLAIN)
    public String getInfoSepatu() {
        String data3;
        String sepatu = "sepatu NIKE";
        int ukuran = 40;

        data3 = "GET  \n " + "Nama sepatu : " + sepatu + "\n" + "ukuran : " + ukuran;
        return data3;
    }

    @POST
    @Path("/infosepatu")
    @Produces(MediaType.TEXT_PLAIN)
    public String postInfoSepatu() {
        String data4;
        String sepatu = "sepatu NIKE";
        int ukuran = 40;

        data4 = "POST \n " + "Nama sepatu : " + sepatu + "\n" + "ukuran: " + ukuran;
        return data4;
    }

}
