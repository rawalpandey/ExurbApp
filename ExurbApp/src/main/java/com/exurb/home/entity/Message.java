package com.exurb.home.entity;


import org.springframework.stereotype.Component;

@Component
public class Message {
	    private String request;
	    private String response;
	    private String name;
	   

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getRequest() {
	        return request;
	    }

	    public void setRequest(String request) {
	        this.request = request;
	    }

	    public String getResponse() {
	        return response;
	    }

	    public void setResponse(String response) {
	        this.response = response;
	    }

}
