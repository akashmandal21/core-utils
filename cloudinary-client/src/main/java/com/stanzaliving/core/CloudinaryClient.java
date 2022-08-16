package com.stanzaliving.core;

import com.cloudinary.Cloudinary;
import org.springframework.web.multipart.MultipartFile;

public class CloudinaryClient {

    private Cloudinary cloudinary;

    public CloudinaryClient(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    public String uploadImageAndGetUrl(MultipartFile file, int width, int height) {



        return null;
    }
}
