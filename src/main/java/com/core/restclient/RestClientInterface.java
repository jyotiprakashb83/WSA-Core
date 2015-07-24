package com.core.restclient;

public interface RestClientInterface {

	public abstract void startHttpClient();
	
	public abstract void closeHttpClient();
	
	public abstract void getEnvoirmentProperties();

	public abstract void setEnvoirmentProperties();

	/* GET CALL */
	public abstract void getResource();	
	
	/* POST CALL */
	public abstract void postResource();	
	
	/* PUT CALL */
	public abstract void putResource();
		
	/* PATCH CALL */
	public abstract void patchResource();
	
	/* DELETE CALL */
	public abstract void deleteResource();

}
