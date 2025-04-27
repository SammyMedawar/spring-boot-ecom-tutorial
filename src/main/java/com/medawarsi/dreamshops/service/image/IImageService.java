package com.medawarsi.dreamshops.service.image;

import com.medawarsi.dreamshops.dto.ImageDto;
import com.medawarsi.dreamshops.models.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImage(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
