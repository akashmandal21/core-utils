package com.stanzaliving.core.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.stanzaliving.core.cloudinary.constatnts.CloudinaryConstants;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Log4j2
public class CloudinaryClient {

    private Cloudinary cloudinary;

    public CloudinaryClient(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    public String uploadImageForWebsiteCmsAndGetUrl(MultipartFile file, int width, int height, String uploadFolderPath) {

        String cloudinaryPath = null;

        try {

            Map properties = new HashMap<>();

            if (StringUtils.isNotBlank(uploadFolderPath)) {
                properties.put(CloudinaryConstants.FOLDER, uploadFolderPath);
            }

            if (width > 0 && height > 0) {
                properties.put(CloudinaryConstants.TRANSFORMATION, new Transformation<>().crop(CloudinaryConstants.SCALE).width(width).height(height).fetchFormat(CloudinaryConstants.AUTO));
            } else if (width > 0) {
                properties.put(CloudinaryConstants.TRANSFORMATION, new Transformation<>().crop(CloudinaryConstants.SCALE).width(width).fetchFormat(CloudinaryConstants.AUTO));
            } else if (height > 0) {
                properties.put(CloudinaryConstants.TRANSFORMATION, new Transformation<>().crop(CloudinaryConstants.SCALE).height(height).fetchFormat(CloudinaryConstants.AUTO));
            } else {
                properties.put(CloudinaryConstants.TRANSFORMATION, new Transformation<>().fetchFormat(CloudinaryConstants.AUTO));
            }

            Map result = cloudinary.uploader().upload(file, properties);

            cloudinaryPath = (String) result.get("secure_url");

            cloudinaryPath = cloudinaryPath.replaceFirst( "image/upload", "image/upload/f_auto,q_auto");
        } catch (Exception e) {
            log.error("Exception while uploading file to cloudinary: {}", e);
        }

        log.info("Returning  cloudinaryFilePath as:", cloudinaryPath);

        return cloudinaryPath;
    }
}
