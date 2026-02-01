package com.springboot.response;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@XmlRootElement
public class Ticket {
	private Integer TicketId;
	private String From;
	private String To;
	private String TrainNum;
	private String TktCost;
	private String TicketStatus;
	public Integer getTicketId() {
		return TicketId;
	}
	public void setTicketId(Integer ticketId) {
		TicketId = ticketId;
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
	public String getTrainNum() {
		return TrainNum;
	}
	public void setTrainNum(String trainNum) {
		TrainNum = trainNum;
	}
	public String getTktCost() {
		return TktCost;
	}
	public void setTktCost(String tktCost) {
		TktCost = tktCost;
	}
	public String getTicketStatus() {
		return TicketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		System.out.print("My name is abhi");
		TicketStatus = ticketStatus;
	}


	@Override
	public String toString() {
		return "Ticket [TicketId=" + TicketId + ", From=" + From + ", To=" + To + ", TrainNum=" + TrainNum
				+ ", TktCost=" + TktCost + ", TicketStatus=" + TicketStatus + "]";
	}
	
	
}

