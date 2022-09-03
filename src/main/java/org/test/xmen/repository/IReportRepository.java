package org.test.xmen.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.test.xmen.models.entity.Report;

public interface IReportRepository  extends CrudRepository<Report, Long>{
	
	@Query(nativeQuery = true,value = "SELECT * FROM view_report")
	public Report getReport();

}
