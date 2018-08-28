package model;

import java.sql.Timestamp;

public class Project {

	private int pNum;
	private String pName;
	private Timestamp pStartDate;
	private Timestamp pEndDate;
	
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Timestamp getpStartDate() {
		return pStartDate;
	}
	public void setpStartDate(Timestamp pStartDate) {
		this.pStartDate = pStartDate;
	}
	public Timestamp getpEndDate() {
		return pEndDate;
	}
	public void setpEndDate(Timestamp pEndDate) {
		this.pEndDate = pEndDate;
	}
	@Override
	public String toString() {
		return "Project [pNum=" + pNum + ", pName=" + pName + ", pStartDate=" + pStartDate + ", pEndDate=" + pEndDate
				+ "]";
	}
}
