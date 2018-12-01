package com.proyectofinal.model;

public class Donacion {
	private int idDonation;
	private double amount;
	private String payMethod;
	private String date;
	
	public Donacion()
	{
		
	}
	
	public Donacion(int idDonation, double amount, String payMethod, String date)
	{
		setIdDonation(idDonation);
		setAmount(amount);
		setPayMethod(payMethod);
		setDate(date);
	}
	
	public int getIdDonation()
	{
		return idDonation;
	}
	
	public void setIdDonation(int idDonation)
	{
		this.idDonation = idDonation;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public String getPayMethod()
	{
		return payMethod;
	}
	
	public void setPayMethod(String payMethod)
	{
		this.payMethod = payMethod;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String toString()
	{
		return "Id Donation: "+getIdDonation()+" Amount: "+getAmount()+" Payment Method: "+getPayMethod()+" Date: "+getDate();
	}
}
