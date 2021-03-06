package br.edu.fvs.component.facebook;

import java.nio.charset.Charset;

public class Configuration {
	private String token;
	private Charset charset = Charset.defaultCharset();
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}

	public void setCharset(Charset charset) {
	    this.charset = charset;
    }
	
	public Charset getCharset() {
	    return charset;
    }
	
}
