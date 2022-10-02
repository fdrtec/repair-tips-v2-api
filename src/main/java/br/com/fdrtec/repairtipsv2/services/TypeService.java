package br.com.fdrtec.repairtipsv2.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fdrtec.repairtipsv2.mapper.DozerMapper;
import br.com.fdrtec.repairtipsv2.model.dtos.TypeDTO;
import br.com.fdrtec.repairtipsv2.model.entities.Type;
import br.com.fdrtec.repairtipsv2.repositories.TypeRepository;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;    

    public List<TypeDTO> findAll() {
        try {
            return DozerMapper.parseListObject(typeRepository.findAll(), TypeDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

    public TypeDTO findById(UUID id) {
        try {
            Optional<Type> optionalDTO = typeRepository.findById(id);
            if(optionalDTO.isPresent()){
                return DozerMapper.parseObject(optionalDTO.get(), TypeDTO.class);
            }
            return null;
            
        } catch (Exception e) {
            return null;
        }       
    }

    public TypeDTO save(TypeDTO typeDTO) {
        try {
            Type type = DozerMapper.parseObject(typeDTO, Type.class);
            return DozerMapper.parseObject(typeRepository.save(type), TypeDTO.class);            
        } catch (Exception e) {
            return null;
            // TODO: handle exception
        }
    }    
}
