package ru.khtu.platform.common.util.mapstruct.catalog.setup.woportalsettings;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.khtu.platform.common.data.dto.catalog.setup.woportalsettings.WoPortalSettingsDto;
import ru.khtu.platform.common.data.entity.catalog.setup.woportalsettings.WoPortalSettingsEntity;
import ru.khtu.platform.common.util.mapstruct.MapperDto;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface WoPortalSettingsMapperDto extends MapperDto<WoPortalSettingsDto, WoPortalSettingsEntity> {

    WoPortalSettingsDto toDto(WoPortalSettingsEntity entity);

    WoPortalSettingsEntity toEntity(WoPortalSettingsDto dto);

    List<WoPortalSettingsDto> toDtos(List<WoPortalSettingsEntity> entities);

    List<WoPortalSettingsEntity> toEntities(List<WoPortalSettingsDto> dtos);

}
