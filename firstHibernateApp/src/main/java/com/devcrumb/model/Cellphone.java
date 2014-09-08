package com.devcrumb.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
/**
 * Person entity
 *
 */
@Entity
public class Cellphone {
 
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String model;
//    private Set<Feature> features = new HashSet<Feature>();

    public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

//	public Set<Feature> getFeatures() {
//		return features;
//	}


	public void setName(String name) {
		this.name = name;
	}


	public void setModel(String model) {
		this.model = model;
	}


//	public void setFeatures(Set<Feature> features) {
//		this.features = features;
//	}


	public Cellphone() {}
 
    
}