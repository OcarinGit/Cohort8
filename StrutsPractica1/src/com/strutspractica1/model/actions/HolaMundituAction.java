package com.strutspractica1.model.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HolaMundituAction extends ActionSupport {

	private String HolaMundo;
	
	@Override
	public String execute()
	{
		HolaMundo= "Hola Munditu";
		return "success";
	}
	
	public String getHolaMundo()
	{
		return HolaMundo;
	}
	
	public void setHolaMundo(String HolaMundo)
	{
		this.HolaMundo = HolaMundo;
	}
}
