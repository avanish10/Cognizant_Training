package com.cognizant.ormlearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="stock")
public class Stock {

	@Id

	@Column(name="")
	private double open;
	@Column(name="")
	private double high;
	@Column(name="")
	private double low;
	@Column(name="")
	private double close;
	@Column(name="")
	private double volume;
	@Column(name="")
	private String name;
	public Stock()
	{
		
	}
	public Stock(double open,double high,double low,double close,double volume,String name)
	{
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.name = name;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "Stock [open = "+open+"high ="+high+"low="+low+"close="+close+"volume="+volume+"]";
		
	}
}
