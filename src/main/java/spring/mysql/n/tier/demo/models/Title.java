package spring.mysql.n.tier.demo.models;

import java.sql.Timestamp;

public class Title {
	
	Integer workerRefId;
	String workerTitle;
	Timestamp acceptedFrom;
	
	public Title() {
		super();
		
	}
	public Title(Integer workerRefId, String workerTitle, Timestamp acceptedFrom) {
		super();
		this.workerRefId = workerRefId;
		this.workerTitle = workerTitle;
		this.acceptedFrom = acceptedFrom;
	}
	public Integer getWorkerRefId() {
		return workerRefId;
	}
	public void setWorkerRefId(Integer workerRefId) {
		this.workerRefId = workerRefId;
	}
	public String getWorkerTitle() {
		return workerTitle;
	}
	public void setWorkerTitle(String workerTitle) {
		this.workerTitle = workerTitle;
	}
	public Timestamp getAcceptedFrom() {
		return acceptedFrom;
	}
	public void setAcceptedFrom(Timestamp acceptedFrom) {
		this.acceptedFrom = acceptedFrom;
	}
	@Override
	public String toString() {
		return "Title [workerRefId=" + workerRefId + ", workerTitle=" + workerTitle + ", acceptedFrom=" + acceptedFrom
				+ "]";
	}
	

}
