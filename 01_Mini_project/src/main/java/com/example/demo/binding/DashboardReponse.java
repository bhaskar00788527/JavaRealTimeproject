package com.example.demo.binding;

public class DashboardReponse {
	
	private Integer Totalenq;
	private Integer Enrolledenq;
	private Integer Lostenq;
	

	public DashboardReponse(Integer totalenq, Integer enrolledenq, Integer lostenq) {
		super();
		this.Totalenq = totalenq;
	    this.Enrolledenq = enrolledenq;
		this.Lostenq = lostenq;
	}
	
	public DashboardReponse() {
		// TODO Auto-generated constructor stub
	}

	public void DashboardReponse() {
		// TODO Auto-generated constructor stub
	}
	public Integer getTotalenq() {
		return Totalenq;
	}
	public void setTotalenq(Integer totalenq) {
		Totalenq = totalenq;
	}
	public Integer getEnrolledenq() {
		return Enrolledenq;
	}
	public void setEnrolledenq(Integer enrolledenq) {
		Enrolledenq = enrolledenq;
	}
	public Integer getLostenq() {
		return Lostenq;
	}
	public void setLostenq(Integer lostenq) {
		Lostenq = lostenq;
	}
	@Override
	public String toString() {
		return "DashboardReponse [Totalenq=" + Totalenq + ", Enrolledenq=" + Enrolledenq + ", Lostenq=" + Lostenq + "]";
	}
	
	
	

}
