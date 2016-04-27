package client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestfulClient {

	Client client = Client.create();
	String getUrl = "http://localhost:8000/JAX-RS-JSON/src/main/java/contract/data/get";
	String postUrl = "http://localhost:8000/JAX-RS-JSON/src/main/java/contract/data/post";
	
	public void getRequest(){
		WebResource webResource = client.resource(getUrl);
		
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		if(response.getStatus()!=200){
			throw new RuntimeException("HTTP Error: "+ response.getStatus());
		}
		
		String result = response.getEntity(String.class);
		System.out.println("Server Response: ");
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		RestfulClient restfulClient = new RestfulClient();
		restfulClient.getRequest();

	}
}