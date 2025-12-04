package com.example.demo.service;

import com.example.demo.domain.Image;

import java.util.List;

public interface ImageService {

    Image saveImage(Long bookId , String imgUrl);

    List<Image> findByBook(Long bookId);

    void delete(Long imgId);
}
