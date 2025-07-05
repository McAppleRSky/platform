package ru.khtu.platform.statetransit.mapper;

import org.mapstruct.Mapper;
import ru.khtu.platform.common.data.dto.StateDto;
import ru.khtu.platform.common.data.entity.StateEntity;
import ru.khtu.platform.statetransit.util.mapper.mapstruct.MapperDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StateMapperDto extends MapperDto<StateEntity, StateDto> {

    StateDto toMinDto(StateEntity entity);

    StateEntity toEntity(StateDto dto);

    List<StateDto> toDtos(List<StateEntity> entities);

    List<StateEntity> toEntities(List<StateDto> dtos);

    default String dtoToStr(StateDto dto) {
        return dto.getWoState();
    }

    List<String> toStrings(List<StateDto> dtos);

}
