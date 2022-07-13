package org.kawahedukasi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.HashMap;
import java.util.Map;

@Path("/json")
public class JsonResource {
    // input operasi, i dan h input request body

    @POST
    @Path("/matematika")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public Map<String, Object> contoh(Map<String, Object> input) {
        String simbol = (String) input.get("simbol");
        int i = Integer.parseInt(input.get("i").toString());
        int j = Integer.parseInt(input.get("j").toString());
        // System.out.println(input);

        int total = 0;

        switch (simbol) {
            case "tambah":
                total = i + j;
                break;
            case "kurang":
                total = i - j;
                break;
            case "kali":
                total = i * j;
                break;
            case "bagi":
                total = i / j;
                break;
            default:

        }

        Map<String, Object> result = new HashMap<>();
        result.put("hasil", total);
        return result;
    }

    // memakai jsonObject
    @Path("/toko")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public Map<String, Object> toko(JsonObject input) {
        Map<String, Object> result = new HashMap<>();
        String paket = input.getString("paket");

        switch (paket) {
            case "hemat":
                result.put("minuman", "pocari sweat");
                result.put("makanan", "oki jely drink");
                break;
            case "sembako":
                JsonArray sayuran = new JsonArray();
                sayuran.add("Wortel");
                sayuran.add("bayem");
                sayuran.add("cabe");

                result.put("sayuran", sayuran);
                result.put("Minyak", "Bimoli");
                result.put("beras", "pulen");
                break;
            case "akhir bulan":
                result.put("Sarden", "ABC");
                result.put("Mie", "indomie");
                result.put("Abon", "ikan lele");
                break;
        }
        return result;
    }

    // input dengan JSON ke POSTMAN
    // inputannya {"nama":"ilham maulana","userId": "15062000","email" :
    // "lebahgaul123@gmail.com"}
    @Path("/user")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public Map<String, Object> toko(@HeaderParam("JSON") String input) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> result = objectMapper.readValue(input, Map.class);
        return result;
    }

}
