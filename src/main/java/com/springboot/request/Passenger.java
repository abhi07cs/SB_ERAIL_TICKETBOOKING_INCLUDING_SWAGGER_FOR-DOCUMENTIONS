package com.springboot.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Passenger {
	
	private String Fname;
	private String Lname;
	private String From ;
	private String To ;
	private String Doj;
	private String TrainNum;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getDoj() {
		return Doj;
	}
	public void setDoj(String doj) {
		Doj = doj;
	}
	public String getTrainNum() {
		return TrainNum;
	}
	public void setTrainNum(String trainNum) {
		TrainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passenger [Fname=" + Fname + ", Lname=" + Lname + ", From=" + From + ", To=" + To + ", Doj=" + Doj
				+ ", TrainNum=" + TrainNum + "]";
	}
	
	
	
	
	
	

}
