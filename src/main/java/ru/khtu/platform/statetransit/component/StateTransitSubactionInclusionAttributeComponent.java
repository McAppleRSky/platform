package ru.khtu.platform.statetransit.component;

import ru.khtu.platform.statetransit.data.dto.StateTransitionSubactionFullDto;

public interface StateTransitSubactionInclusionAttributeComponent {

    void getByStateTransitionsSubactionAndPut(StateTransitionSubactionFullDto stateTransitionSubaction);

}
