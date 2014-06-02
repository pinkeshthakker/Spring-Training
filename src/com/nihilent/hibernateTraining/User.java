package com.nihilent.hibernateTraining;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6272645473400175462L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="hibernate_training_OneToOne")
	@SequenceGenerator(name="hibernate_training_OneToOne", sequenceName="hibernate_training_OneToOne")
	@Column(name = "ID", nullable = false)
	private long id;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@PrimaryKeyJoinColumn
	private UserAddress userAddress;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	
}
