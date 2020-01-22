package com.stanza.qr.validator;

import boofcv.abst.fiducial.QrCodeDetector;
import boofcv.alg.fiducial.qrcode.QrCode;
import boofcv.factory.fiducial.FactoryFiducial;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.io.image.UtilImageIO;
import boofcv.struct.image.GrayU8;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class QRDecode_BoofCV
{

    private static final List<String> decodeUsingBoofCV(BufferedImage image)
    {
        if(image==null)
            return null;
        GrayU8 gray = ConvertBufferedImage.convertFrom(image, (GrayU8) null);
        QrCodeDetector<GrayU8> detector = FactoryFiducial.qrcode(null,GrayU8.class);
        detector.process(gray);

        List<QrCode> detections = detector.getDetections();
        if(detections==null || detections.isEmpty())
            return null;

        return detections.stream().map(s->s.message).collect(Collectors.toList());
    }


    public static String attemptSingleQRDecodeUsingBoofCV(BufferedImage image) {
        List<String> ret = decodeUsingBoofCV(image);
        if(ret==null)
            return null;
        else
            return ret.get(0);
    }

    public static String attemptSingleQRDecodeUsingBoofCV(InputStream stream) throws IOException, FormatException, ChecksumException, NotFoundException {
        return attemptSingleQRDecodeUsingBoofCV(ImageIO.read(stream));
    }

    public static final String attemptSingleQRDecodeUsingBoofCV(URL url)
    {
        return attemptSingleQRDecodeUsingBoofCV(UtilImageIO.loadImage(url));
    }

    public static List<String> attemptMultiQRDecodeUsingBoofCV(URL url)
    {
        return decodeUsingBoofCV(UtilImageIO.loadImage(url));
    }

}
