package com.niit.vd.demoimage.respositories;

import com.niit.vd.demoimage.models.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ImageJpa extends CrudRepository<Image, Long> {
    @Override
    Iterable<Image> findAll();

    @Override
    Optional<Image> findById(Long aLong);
}
