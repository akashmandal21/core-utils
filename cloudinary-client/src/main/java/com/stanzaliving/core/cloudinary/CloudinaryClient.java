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
                properties.put(CloudinaryConstants.USE_FILENAME, Boolean.TRUE);
                properties.put(CloudinaryConstants.FILENAME, file.getOriginalFilename());
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

            Map result = cloudinary.uploader().upload(file.getBytes(), properties);

            cloudinaryPath = (String) result.get(CloudinaryConstants.SECURE_URL);
        } catch (Exception e) {
            log.error("Exception while uploading file to cloudinary: {}", e);
        }

        log.info("Returning uploaded cloudinaryFilePath as: {}", cloudinaryPath);

        return cloudinaryPath;
    }

    public String getFautoQautoCloudinaryFilePath(String cloudinaryPath) {

        return cloudinaryPath.replaceFirst(CloudinaryConstants.IMAGE_UPLOAD_URL, CloudinaryConstants.IMAGE_UPLOAD_F_AUTO_Q_AUTO_URL);
    }
}
