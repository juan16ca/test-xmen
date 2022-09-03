package org.test.xmen.models.mapper;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.test.xmen.models.dto.SequenceAdnDTO;
import org.test.xmen.models.entity.SequenceAdn;

@Component
public class MapperSequenceAdnImpl implements IMapperSequenceAdn {

	@Override
	public SequenceAdn sequenceAdnDTOToSequenceAdn(SequenceAdnDTO sequenceAdnDTO) {

		SequenceAdn sequenceAdn = new SequenceAdn();
		sequenceAdn.setId(sequenceAdnDTO.getId());
		sequenceAdn.setAdn(Arrays.toString(sequenceAdnDTO.getAdn()));

		return sequenceAdn;

	}

}
