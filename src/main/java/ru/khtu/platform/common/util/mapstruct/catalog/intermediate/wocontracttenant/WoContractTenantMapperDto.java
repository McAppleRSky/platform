package ru.khtu.platform.common.util.mapstruct.catalog.intermediate.wocontracttenant;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.khtu.platform.common.data.dto.catalog.intermediate.wocontracttenant.WoContractTenantDto;
import ru.khtu.platform.common.data.entity.catalog.intermediate.wocontracttenant.WoContractTenantEntity;
import ru.khtu.platform.common.util.mapstruct.MapperDto;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface WoContractTenantMapperDto extends MapperDto<WoContractTenantDto, WoContractTenantEntity> {

    WoContractTenantDto toDto(WoContractTenantEntity entity);

    WoContractTenantEntity toEntity(WoContractTenantDto dto);

    List<WoContractTenantDto> toDtos(List<WoContractTenantEntity> entities);

    List<WoContractTenantEntity> toEntities(List<WoContractTenantDto> dtos);

}
