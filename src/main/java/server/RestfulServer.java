package server;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import data.model.Contract;
import data.model.Invoice;

@Path("/contract/data")
public class RestfulServer {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Contract[] getContractData(){
		Contract inLine = new Contract(134,"hb",35630,true);
		Contract serviceOrder = new Contract(239,"wt",275,false);
		Contract serviceAgreement = new Contract(4,"sa",125,false);
		
		Contract[] examples = {inLine,serviceOrder,serviceAgreement};
		
		return examples;
	}
	
	public Invoice[] getInvoiceData(){
		Invoice invoice0 = new Invoice(335783,135,275,new Date(),false);
		Invoice invoice1 = new Invoice (335784,239,275,new Date(), false);
		
		Invoice[] examples = {invoice0, invoice1};
		return examples;
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postContractData(Contract[] contracts){
		String result = "";
		for(int i=0; i<contracts.length; i++){
			result += "Contract: "+ contracts[i];
		}
		return Response.status(201).entity(result).build();
	}
}