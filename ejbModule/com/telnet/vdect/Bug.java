package com.telnet.vdect;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bug
 *
 */
@Entity

public class Bug implements Serializable {

	
	private Integer id;
	private String description;
	private Date discoveryDate;
	private static final long serialVersionUID = 1L;

	public Bug() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Date getDiscoveryDate() {
		return this.discoveryDate;
	}

	public void setDiscoveryDate(Date discoveryDate) {
		this.discoveryDate = discoveryDate;
	}
   
}
