package com.enterprise.tecno.clone.service;

import org.springframework.web.multipart.MultipartFile;

public interface ServiceFile {
    String uploadFile(MultipartFile file);
}
