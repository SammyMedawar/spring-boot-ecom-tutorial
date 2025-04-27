package com.medawarsi.dreamshops.repository;

import com.medawarsi.dreamshops.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
