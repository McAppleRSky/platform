package ru.khtu.platform.statetransit.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.khtu.platform.statetransit.data.dto.StateTransitionSubactionFullDto;
import ru.khtu.platform.statetransit.mapper.StateTransitSubactionAttributeMapperDto;
import ru.khtu.platform.statetransit.mapper.StateTransitSubactionInclusionMapperDto;
import ru.khtu.platform.statetransit.repository.StateTransitionSubactionAttributeRepository;
import ru.khtu.platform.statetransit.repository.StateTransitionSubactionInclusionRepository;

@RequiredArgsConstructor
@Component
public class StateTransitSubactionInclusionAttributeComponentImpl implements StateTransitSubactionInclusionAttributeComponent {

    private final StateTransitionSubactionInclusionRepository stateTransitionSubactionInclusionRepository;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private final StateTransitSubactionInclusionMapperDto stateTransitSubactionInclusionMapper;
    private final StateTransitionSubactionAttributeRepository stateTransitionSubactionAttributeRepository;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private final StateTransitSubactionAttributeMapperDto stateTransitSubactionAttributeMapper;

    @Override
    public void getByStateTransitionsSubactionAndPut(StateTransitionSubactionFullDto stateTransitionSubaction) {
        stateTransitionSubaction.setStateTransitionSubactionInclusionDto(
                stateTransitSubactionInclusionMapper.toDtos(
                        stateTransitionSubactionInclusionRepository.findByStateTransitionIdAndStateTransitionSubactionId(
                                stateTransitionSubaction.getIdStateTransit(),
                                stateTransitionSubaction.getId() ) ) );
        stateTransitionSubaction.setStateTransitionSubactionAttributeDto(
                stateTransitSubactionAttributeMapper.toDtos(
                        stateTransitionSubactionAttributeRepository.findByStateTransitionIdAndStateTransitionSubactionId(
                                stateTransitionSubaction.getIdStateTransit(),
                                stateTransitionSubaction.getId() ) ) );
    }

}
