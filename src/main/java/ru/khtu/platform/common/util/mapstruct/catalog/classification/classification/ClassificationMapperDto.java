package ru.khtu.platform.common.util.mapstruct.catalog.classification.classification;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.khtu.platform.common.data.dto.catalog.classification.classification.ClassificationDto;
import ru.khtu.platform.common.data.entity.catalog.classification.classification.ClassificationEntity;
import ru.khtu.platform.common.util.mapstruct.MapperDto;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClassificationMapperDto extends MapperDto<ClassificationDto, ClassificationEntity> {

    ClassificationDto toDto(ClassificationEntity entity);

    ClassificationEntity toEntity(ClassificationDto dto);

    List<ClassificationDto> toDtos(List<ClassificationEntity> entities);

    List<ClassificationEntity> toEntities(List<ClassificationDto> dtos);

}
