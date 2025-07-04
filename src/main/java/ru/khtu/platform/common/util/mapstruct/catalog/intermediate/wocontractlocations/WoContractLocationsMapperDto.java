package ru.khtu.platform.common.util.mapstruct.catalog.intermediate.wocontractlocations;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.khtu.platform.common.data.dto.catalog.intermediate.wocontractlocations.WoContractLocationsDto;
import ru.khtu.platform.common.data.entity.catalog.intermediate.wocontractlocations.WoContractLocationsEntity;
import ru.khtu.platform.common.util.mapstruct.MapperDto;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface WoContractLocationsMapperDto extends MapperDto<WoContractLocationsDto, WoContractLocationsEntity> {

    WoContractLocationsDto toDto(WoContractLocationsEntity entity);

    WoContractLocationsEntity toEntity(WoContractLocationsDto dto);

    List<WoContractLocationsDto> toDtos(List<WoContractLocationsEntity> entities);

    List<WoContractLocationsEntity> toEntities(List<WoContractLocationsDto> dtos);

}
