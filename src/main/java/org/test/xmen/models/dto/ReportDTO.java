package org.test.xmen.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReportDTO {

	private int countMutantDna;
	private int countHumanDna;
	private double ratio;

	@JsonProperty("count_mutant_dna")
	public int getTotalMutants() {
		return countMutantDna;
	}

	public void setTotalMutants(int countMutantDna) {
		this.countMutantDna = countMutantDna;
	}

	@JsonProperty("count_human_dna")
	public int getTotalHumans() {
		return countHumanDna;
	}

	public void setTotalHumans(int countHumanDna) {
		this.countHumanDna = countHumanDna;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

}
