/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.paulobatista.restclient.http;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import ml.paulobatista.restclient.Nota;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author paulo
 */
public class ClienteRest {

    private final String USER_AGENT = "Mozilla/5.0";
    private final String WEBSERVICE = "http://localhost:8080/ProjetoRest/resources/notas/";

    public ArrayList<Nota> getNotas() throws Exception {
        String url = WEBSERVICE + "list";

        String response = this.sendGet(url);

        //return response
        Type type = new TypeToken<List<Nota>>() {
        }.getType();
        //Type listType = new TypeToken<List<Nota>>() {}.getType();
        Gson gson = new Gson();

        ArrayList<Nota> notas = (ArrayList<Nota>) gson.fromJson(response, type);
        return notas;

    }
    
    public Nota getNota(int id) throws Exception {
        String url = WEBSERVICE + "get/" + id;
        String response = this.sendGet(url);
        Gson gson = new Gson();
        
        Nota nota = gson.fromJson(response, Nota.class);
        return nota;
    }

    public void sendNota(Nota nota) {
        
    }
    
    public void sendPut(Nota nota) throws UnsupportedEncodingException {
        String url = WEBSERVICE + "put/" + nota.getId();
        
        HttpClient client = HttpClientBuilder.create().build();
        HttpPut put = new HttpPut(url);
        //put.setHeader("User-Agent", USER_AGENT);
        put.setHeader("Accept", "application/json");
        put.setHeader("Content-type", "application/json");
        Gson gson = new Gson();
        String json = gson.toJson(nota);
        StringEntity params = new StringEntity(json);
        put.setEntity(params);
        try {
            int response = client.execute(put).getStatusLine().getStatusCode();
            System.out.println("Status Code: " + response) ;

        } catch (IOException ex) {
            Logger.getLogger(ClienteRest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sendPost(Nota nota) throws UnsupportedEncodingException {
        String url = WEBSERVICE + "post";
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");
        Gson gson = new Gson();
        String json = gson.toJson(nota);
        StringEntity params = new StringEntity(json);
        post.setEntity(params);
        try {
            int response = client.execute(post).getStatusLine().getStatusCode();
            System.out.println("Status Code post: " + response) ;

        } catch (IOException ex) {
            Logger.getLogger(ClienteRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void sendDelete(int id) throws Exception {
        
        String url = WEBSERVICE + "del/" + id;

        HttpClient client = HttpClientBuilder.create().build();
        HttpDelete delete = new HttpDelete(url);
        delete.setHeader("User-Agent", USER_AGENT);
        HttpResponse response = client.execute(delete);
        System.out.println(response.getStatusLine().getStatusCode());

       


    }

    private String sendGet(String url) throws Exception {
        //String url = WEBSERVICE + "list";
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        // add request header
        request.addHeader("User-Agent", USER_AGENT);
        HttpResponse response = client.execute(request);

        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        //System.out.println(result);
        return result.toString();

    }

    public static void main(String[] args) throws Exception {

        ClienteRest http = new ClienteRest();

        System.out.println("Testing 1 - Send Http GET request");
        //http.getNotas();
        //http.sendDelete();
        //System.out.println("\nTesting 2 - Send Http POST request");
        //http.sendPost();
    }

}
