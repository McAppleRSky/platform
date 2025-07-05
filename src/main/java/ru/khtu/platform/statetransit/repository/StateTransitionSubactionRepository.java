package ru.khtu.platform.statetransit.repository;

import org.springframework.data.repository.Repository;
import ru.khtu.platform.statetransit.data.entity.StateTransitionSubactionEntity;

public interface StateTransitionSubactionRepository extends Repository<StateTransitionSubactionEntity, Long> {

    StateTransitionSubactionEntity findById(Long id);

}
