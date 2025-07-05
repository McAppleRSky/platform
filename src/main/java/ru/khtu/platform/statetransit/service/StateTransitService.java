package ru.khtu.platform.statetransit.service;

import ru.khtu.platform.common.data.enums.WorkObject;

import java.util.Map;

public interface StateTransitService {

    Map<String, Object> getStateTransition(WorkObject workObject);

}
