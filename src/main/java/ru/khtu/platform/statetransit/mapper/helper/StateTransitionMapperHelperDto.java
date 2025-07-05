package ru.khtu.platform.statetransit.mapper.helper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.khtu.platform.statetransit.data.dto.StateTransitionMinDto;
import ru.khtu.platform.statetransit.data.dto.StateTransitionFullDto;
import ru.khtu.platform.statetransit.util.mapper.mapstruct.MapperDto;

@Mapper(componentModel = "spring")
public interface StateTransitionMapperHelperDto extends MapperDto<StateTransitionFullDto, StateTransitionMinDto> {

    @Override
    @Mapping(target = "nameOfClass", source = "helper.className")
    @Mapping(target = "nameOfMethod", source = "helper.methodName")
    @Mapping(target = "isReadOnly", source = "helper.readOnly")
    StateTransitionMinDto toMinDto(StateTransitionFullDto helper);

}
