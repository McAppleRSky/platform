package ru.khtu.platform.common.componentSh.repository;

import org.springframework.data.repository.Repository;
import ru.khtu.platform.common.data.entity.StateEntity;

import java.util.List;

public interface StateRepository extends Repository<StateEntity, Long> {

    List<StateEntity> findByWoName(String woName);

}