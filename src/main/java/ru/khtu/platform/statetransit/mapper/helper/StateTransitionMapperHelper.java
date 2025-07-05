package ru.khtu.platform.statetransit.mapper.helper;

import ru.khtu.platform.statetransit.data.entity.StateTransitionEntity;
import ru.khtu.platform.statetransit.data.dto.StateTransitionFullDto;

import java.util.ArrayList;
import java.util.List;

public class StateTransitionMapperHelper// extends MapperDto<StateTransitionEntity, StateTransitionHelper>
{

    public static StateTransitionFullDto toDto(StateTransitionEntity entity) {
        return new StateTransitionFullDto(
                entity.getId(),
                entity.getWoName(),
                entity.getActionName(),
                entity.getActionLabel(),
                entity.getCurrentState(),
                entity.getNextState(),
                entity.getCustomUrl(),
                entity.getClassName(),
                entity.getMethodName(),
                entity.getDefaultDisplay(),
                entity.getReadOnly(),
                entity.getCloseWindow(),
                entity.getSecondaryAction() );
    }

    public static List<StateTransitionFullDto> toFullDtos(List<StateTransitionEntity> entities) {
        List<StateTransitionFullDto> result = new ArrayList<>();
        for (StateTransitionEntity entity : entities) {
            result.add( toDto(entity) );
        }
        return result;
    }

}
