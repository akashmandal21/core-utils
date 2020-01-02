package com.stanza.qr.validator;

import boofcv.abst.fiducial.QrCodeDetector;
import boofcv.alg.fiducial.qrcode.QrCode;
import boofcv.factory.fiducial.FactoryFiducial;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.io.image.UtilImageIO;
import boofcv.struct.image.GrayU8;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.multi.ByQuadrantReader;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class QRCodeDataExtractor
{

    private static final Map<DecodeHintType,Object> HINTS;

    static {
        HINTS = new EnumMap<>(DecodeHintType.class);
        HINTS.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        HINTS.put(DecodeHintType.POSSIBLE_FORMATS, EnumSet.of(BarcodeFormat.QR_CODE));
    }

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

    public static final String attemptSingleQRDecodeUsingBoofCV(URL url)
    {
        BufferedImage input = UtilImageIO.loadImage(url);
        List<String> ret = decodeUsingBoofCV(input);
        if(ret==null)
            return null;
        else
            return ret.get(0);
    }

    public static List<String> attemptMultiQRDecodeUsingBoofCV(URL url)
    {
        return decodeUsingBoofCV(UtilImageIO.loadImage(url));
    }

    public static String attemptSingleDecodeUsingZxing(URL url) throws IOException, FormatException, ChecksumException, NotFoundException {
        return decodeSingleQRCodeZxing(ImageIO.read(url));
    }


    public static String decodeSingleQRCodeZxing(BufferedImage bufferedImage) throws FormatException, ChecksumException, NotFoundException {
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Reader reader = new MultiFormatReader();
        ByQuadrantReader byQuadrantReader = new ByQuadrantReader(reader);
        Result result = byQuadrantReader.decode(bitmap, HINTS);

        if(result!=null)
        {
            return result.getText();
        }
        return null;
    }

    @Test
    public static void main(String[] args) {

        File file = new File("/Users/ankit.khandelwal/Downloads/qrimg/micro_qr/qr_3_pixel_32char/");
        Arrays.stream(file.listFiles()).forEach(f->{
            if (f.getName().endsWith("jpg")) {
                System.out.print(f.getName()+",");
                try {
                    System.out.print("BoofCV:"+attemptSingleQRDecodeUsingBoofCV(f.toURI().toURL())+",");
                    System.out.println("ZXing :"+attemptSingleDecodeUsingZxing(f.toURI().toURL()));
                } catch(Exception e){
                    System.out.println("Could not decode QR Code, IOException :: " + e.getMessage());
                }
            }
        });

    }

}
