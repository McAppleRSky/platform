package ru.khtu.platform.statetransit.component;

import ru.khtu.platform.common.data.dto.StateDto;
import ru.khtu.platform.common.data.enums.WorkObject;
import ru.khtu.platform.statetransit.data.dto.StateTransitionFullDto;
import ru.khtu.platform.statetransit.mapper.StateMapperDto;

import java.util.List;
import java.util.Map;

public interface StateTransitComponent {

    Map.Entry<List<StateDto>, List<StateTransitionFullDto>> getStateTransition(WorkObject workObject);

    StateMapperDto getStateMapper();

}
