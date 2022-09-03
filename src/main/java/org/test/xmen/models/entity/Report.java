package org.test.xmen.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Report {

	@Id
	private Long id;
	private int totalMutants;
	private int totalHumans;
	private double ratio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTotalMutants() {
		return totalMutants;
	}

	public void setTotalMutants(int totalMutants) {
		this.totalMutants = totalMutants;
	}

	public int getTotalHumans() {
		return totalHumans;
	}

	public void setTotalHumans(int totalHumans) {
		this.totalHumans = totalHumans;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

}
