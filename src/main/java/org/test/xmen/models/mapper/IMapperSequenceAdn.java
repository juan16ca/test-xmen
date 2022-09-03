package org.test.xmen.models.mapper;

import org.mapstruct.Mapper;
import org.test.xmen.models.dto.SequenceAdnDTO;
import org.test.xmen.models.entity.SequenceAdn;

@Mapper(componentModel = "spring")
public interface IMapperSequenceAdn {
	
	SequenceAdn sequenceAdnDTOToSequenceAdn(SequenceAdnDTO sequenceAdn);

}
