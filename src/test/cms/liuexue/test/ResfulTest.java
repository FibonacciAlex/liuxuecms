package cms.liuexue.test;

import com.google.gson.JsonObject;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.junit.Test;

import javax.ws.rs.core.MediaType;


/**
 * Created by Sandwich on 2016/2/16.
 */
public class ResfulTest {
    @Test
    public void Test() {
        JsonObject json6 = new JsonObject();
        json6.addProperty("name", "sandw");
        json6.addProperty("sex", "2");
        String wsResult6 = (String)getWebClient("http://localhost:8080/personInfo", json6, String.class);
        System.out.println(">>>>>>"+wsResult6+"<<<<<<");
    }
    public Object getWebClient(String url, JsonObject json, Class resultClass){
        Client client = new Client();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON_TYPE).type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,json.toString());
        return response.getEntity(resultClass);
    }
}
