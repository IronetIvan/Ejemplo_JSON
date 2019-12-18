/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_json;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import ejemplo_json.Pelicula;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario DAM 2
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String linkurl = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";
        URL url = new URL(linkurl);
        HttpURLConnection httpConecction = (HttpURLConnection) url.openConnection();
        BufferedReader lector = new BufferedReader(new InputStreamReader(httpConecction.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String linea;

        while ((linea = lector.readLine()) != null) {
            builder.append(linea);
        }
        JSONObject jsonObject = new JSONObject(builder.toString());
        JSONArray jsonArray = jsonObject.getJSONArray("results");

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject object = (JSONObject) jsonArray.get(i);
            //String titulo = object.getString("original_title");//preguntamos por lo que nos interesa sacar
            //String descripcion = object.getString("overview");
            //Pelicula = new Pelicula(titulo, descripcion);
            Gson gson = new Gson();
            Pelicula p = gson.fromJson(object.toString(), Pelicula.class);
            System.out.println(p.getOriginal_title());
        }

    }*/

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana v = new Ventana() ;

            }
        });
    }
}
