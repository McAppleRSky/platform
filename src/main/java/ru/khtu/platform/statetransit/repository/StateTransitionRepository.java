package ru.khtu.platform.statetransit.repository;

import org.springframework.data.repository.Repository;
import ru.khtu.platform.statetransit.data.entity.StateTransitionEntity;

import java.util.List;

public interface StateTransitionRepository extends Repository<StateTransitionEntity, Long> {

    List<StateTransitionEntity> findByWoName(String woName);

}
