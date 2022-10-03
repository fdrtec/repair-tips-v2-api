package br.com.fdrtec.repairtipsv2.mappers;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public interface DozerMapper {

    Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    static <O,D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }

    static <O,D> List<D> parseListObject(List<O> origin, Class<D> destination) {
        List<D> destinationObjects = new ArrayList<>();
        for(O o: origin) {
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }

}