package com.devcrumb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Feature {
	 	@Id
	    @GeneratedValue
	    private Long id;
	    private String name;
	    private String description;

		public Feature(String name, String description) {
			super();
			this.name = name;
			this.description = description;
		}
		public Long getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getDescription() {
			return description;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setDescription(String description) {
			this.description = description;
		}
}
