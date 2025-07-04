package ru.khtu.platform.common.util.mapstruct;

import java.util.List;

public interface MapperDto<D, E> {

    D toDto(E entity);

    E toEntity(D dto);

    List<D> toDtos(List<E> entities);

    List<E> toEntities(List<D> dtos);

}
