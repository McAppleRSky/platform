package ru.khtu.platform.common.util.mapstruct.catalog.space.wospace;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.khtu.platform.common.data.dto.catalog.space.wospace.WoSpaceDto;
import ru.khtu.platform.common.data.entity.catalog.space.wospace.WoSpaceEntity;
import ru.khtu.platform.common.util.mapstruct.MapperDto;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface WoSpaceMapperDto extends MapperDto<WoSpaceDto, WoSpaceEntity> {

    WoSpaceDto toDto(WoSpaceEntity entity);

    WoSpaceEntity toEntity(WoSpaceDto dto);

    List<WoSpaceDto> toDtos(List<WoSpaceEntity> entities);

    List<WoSpaceEntity> toEntities(List<WoSpaceDto> dtos);

}
