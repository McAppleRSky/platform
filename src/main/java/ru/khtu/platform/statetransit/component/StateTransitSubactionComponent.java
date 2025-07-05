package ru.khtu.platform.statetransit.component;

import ru.khtu.platform.statetransit.data.dto.StateTransitionFullDto;

import java.util.List;

public interface StateTransitSubactionComponent {

    void getByStateTransitionsAndPutSubaction(List<StateTransitionFullDto> stateTransitions);

}
