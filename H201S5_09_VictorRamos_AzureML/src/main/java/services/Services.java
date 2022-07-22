package services;

import com.google.gson.Gson;
import java.io.IOException;
import model.modelo;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

// AzureML
public class Services {

    public static String obtenerJSon(modelo modelo) throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n"
                + "  \"Inputs\": {\n"
                + "    \"input1\": {\n"
                + "      \"ColumnNames\": [\n"
                + "        \"b\",\n"
                + "        \"30.83\",\n"
                + "        \"0\",\n"
                + "        \"u\",\n"
                + "        \"g\",\n"
                + "        \"w\",\n"
                + "        \"v\",\n"
                + "        \"1.25\",\n"
                + "        \"t\",\n"
                + "        \"t (2)\",\n"
                + "        \"1\",\n"
                + "        \"f\",\n"
                + "        \"g (2)\",\n"
                + "        \"202\",\n"
                + "        \"0 (2)\",\n"
                + "        \"+\"\n"
                + "      ],\n"
                + "      \"Values\": [\n"
                + "        [\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"0\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"0\",\n"
                + "          \"value\"\n"
                + "        ],\n"
                + "        [\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"0\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"value\",\n"
                + "          \"value\",\n"
                + "          \"0\",\n"
                + "          \"0\",\n"
                + "          \"value\"\n"
                + "        ]\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"GlobalParameters\": {}\n"
                + "}");
        Request request = new Request.Builder()
                .url("https://ussouthcentral.services.azureml.net/workspaces/8b9c8e81308e4cf6b3dc51d53329f674/services/00089100171044008a52088c48d4c8bb/execute?api-version=2.0&details=true")
                .method("POST", body)
                .addHeader("Authorization", "Bearer u6SmFp4L3uj1AMwZJKWEv14zrZwgPyO9CnFPp1Cj1ltDKzizsBFS3Jo51TFhtKzGuskjfJxem3cZB6bNT0LyTQ==")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();

    }

    public static void main(String[] args) throws IOException {
        try {
            modelo resultado = new modelo();
            String result="";
           result = obtenerJSon(resultado); 
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("error en " + e.getMessage());
        }
    }
}

//    Request-Response
//    /execute?api-version=2.0&format=swagger      
//    
//    {
//      "Inputs": {
//        "input1": [
//          {
//            "Embarazos": 3,
//            "Glucosa": 110,
//            "Presión sanguínea": 75,
//            "Pliegue cutáneo": 21,
//            "Insulina": 81,
//            "Índice de masa corporal": 32.168,
//            "Pedigrí diabetes": 0.42354,
//            "Edad": 33,
//            "Diabetes": "",
//            "Medicación previa": "",
//            "Observaciones": "",
//            "Fecha de diagnóstico": ""
//          }
//        ]
//      },
//      "GlobalParameters": {}
//    }
