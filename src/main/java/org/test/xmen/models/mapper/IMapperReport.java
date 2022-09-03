package org.test.xmen.models.mapper;

import org.mapstruct.Mapper;
import org.test.xmen.models.dto.ReportDTO;
import org.test.xmen.models.entity.Report;

@Mapper(componentModel = "spring")
public interface IMapperReport {
	
	ReportDTO reportToReportDTO(Report report);

}
