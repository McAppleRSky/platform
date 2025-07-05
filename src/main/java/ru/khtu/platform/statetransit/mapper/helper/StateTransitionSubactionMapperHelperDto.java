package ru.khtu.platform.statetransit.mapper.helper;

import org.mapstruct.Mapper;
import ru.khtu.platform.statetransit.data.dto.StateTransitionSubactionFullDto;
import ru.khtu.platform.statetransit.data.dto.StateTransitionSubactionMinDto;
import ru.khtu.platform.statetransit.util.mapper.mapstruct.MapperDto;

@Mapper(componentModel = "spring")
public interface StateTransitionSubactionMapperHelperDto extends MapperDto<StateTransitionSubactionFullDto, StateTransitionSubactionMinDto> {

    @Override
    StateTransitionSubactionMinDto toMinDto(StateTransitionSubactionFullDto helper);

}
