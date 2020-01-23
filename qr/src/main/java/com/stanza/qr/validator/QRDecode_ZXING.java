package com.stanza.qr.validator;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.multi.ByQuadrantReader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class QRDecode_ZXING
{

    private static final Map<DecodeHintType,Object> HINTS;

    static {
        HINTS = new EnumMap<>(DecodeHintType.class);
        HINTS.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        HINTS.put(DecodeHintType.POSSIBLE_FORMATS, EnumSet.of(BarcodeFormat.QR_CODE));
    }

    private static String decodeSingleQRCodeZxing(BufferedImage bufferedImage) throws FormatException, ChecksumException, NotFoundException {
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

    public static String attemptSingleDecodeUsingZxing(URL url) throws IOException, FormatException, ChecksumException, NotFoundException {
        return decodeSingleQRCodeZxing(ImageIO.read(url));
    }
    public static String attemptSingleDecodeUsingZxing(BufferedImage image) throws IOException, FormatException, ChecksumException, NotFoundException {
        return decodeSingleQRCodeZxing(image);
    }
    public static String attemptSingleDecodeUsingZxing(InputStream stream) throws IOException, FormatException, ChecksumException, NotFoundException {
        return decodeSingleQRCodeZxing(ImageIO.read(stream));
    }
}
