package ovillenator;

import org.springframework.data.annotation.Id;

public class Details {
	@Id
	String id;
	
	String detail;

	public Details(){ }
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
