package ru.khtu.platform.statetransit.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.khtu.platform.statetransit.data.dto.StateTransitionFullDto;
import ru.khtu.platform.statetransit.mapper.helper.StateTransitionSubactionMapperHelper;
import ru.khtu.platform.statetransit.repository.StateTransitionSubactionRepository;

import java.util.List;

@RequiredArgsConstructor
@Component
public class StateTransitSubactionComponentImpl implements StateTransitSubactionComponent {

    private final StateTransitionSubactionRepository stateTransitionSubactionRepository;
    private final StateTransitSubactionInclusionAttributeComponent stateTransitSubactionInclusionAttributeComponent;

    @Override
    public void getByStateTransitionsAndPutSubaction(List<StateTransitionFullDto> stateTransitions) {
        for (StateTransitionFullDto stateTransition : stateTransitions) {
            stateTransition.setStateTransitionSubaction(
                    StateTransitionSubactionMapperHelper.toFullDto(
                            stateTransitionSubactionRepository.findById(stateTransition.getId() ) ) );
            if (stateTransition.getStateTransitionSubaction() != null) {
                stateTransitSubactionInclusionAttributeComponent.getByStateTransitionsSubactionAndPut(
                        stateTransition.getStateTransitionSubaction() );
            }
        }
    }

}
