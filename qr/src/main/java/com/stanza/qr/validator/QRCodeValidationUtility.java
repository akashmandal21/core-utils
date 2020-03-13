package com.stanza.qr.validator;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;

import org.springframework.web.multipart.MultipartFile;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

@UtilityClass
@Log4j2
public class QRCodeValidationUtility {
    public String getQRCodeText(BufferedImage image, QRDecoderOptions decoder, String fileName) {
    	log.info("QRCodeValidationServiceImpl: GetQRCodeText service initiated.");
        String result = "";
        try {
            result = QRCodeDataExtractor.decodeSingleQRCode(image, decoder);
        } catch (Exception e) {
            log.error("QR Detection failed for Uploaded Image:" + fileName + " with Decoder:" + decoder.getDecoderName() + " Reason:" + e.getMessage());
        }
        log.info("QRCodeValidationServiceImpl: GetQRCodeText service completed with qrcode text {} ", result);
        return result;
    }

    private BufferedImage checkAndConvertToBufferedImageFile(MultipartFile file) {
        try {
            return ImageIO.read(file.getInputStream());
        } catch (IOException e) {
            log.error("Uploaded file with Filename:" + file.getOriginalFilename() + " is not a supported image");
            return null;
        }
    }

    public String extractQRCodeFromImage(MultipartFile file) {
    	
    	log.info("QRCodeValidationServiceImpl: validateAndExtractQRFromImage service initiated.");
    	
        final BufferedImage image = checkAndConvertToBufferedImageFile(file);
        if (Objects.isNull(image)) return null;

        String results[] = Arrays.stream(QRDecoderOptions.values()).
                map(decoder -> getQRCodeText(image, decoder, file.getOriginalFilename())).
                collect(Collectors.joining("~")).split("~");
        List<String> arr = Arrays.stream(results).filter(f -> f.trim().length() > 0).distinct().collect(Collectors.toList());
        switch (arr.size()) {
            case 0:
                log.error("Failed to Detect QR in this image:" + file.getOriginalFilename());
                return null;
            case 1:
                log.info("Detection of QR Successful:" + file.getOriginalFilename() + " qrText:" + arr.get(0));
                return arr.get(0);
            default:
                log.error("Multiple QR Results found in the imagefile:" + file.getOriginalFilename());
                return null;
        }
    }


}
