package ru.khtu.platform.statemachine.util.entity;

public interface EntityStateAble {

    String getWoRecordStateSY();
    void setWoRecordStateSY(String state);
    void setWoPreviousStateSY(String state);

}
