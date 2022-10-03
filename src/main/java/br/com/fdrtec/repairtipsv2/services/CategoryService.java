package br.com.fdrtec.repairtipsv2.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fdrtec.repairtipsv2.domain.dtos.CategoryDTO;
import br.com.fdrtec.repairtipsv2.domain.entities.Category;
import br.com.fdrtec.repairtipsv2.mappers.DozerMapper;
import br.com.fdrtec.repairtipsv2.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDTO> findAll() {
        try {
            return DozerMapper.parseListObject(categoryRepository.findAll(), CategoryDTO.class);
            
        } catch (Exception e) {
            return null;
        }
    }

    public CategoryDTO findById(UUID id) {
        try {
            Optional<Category> optionalCategory = categoryRepository.findById(id);
            if(optionalCategory.isPresent()){
                return DozerMapper.parseObject(optionalCategory.get(), CategoryDTO.class);
            }
            return null;            
        } catch (Exception e) {
            return null;
        }
    }



}
