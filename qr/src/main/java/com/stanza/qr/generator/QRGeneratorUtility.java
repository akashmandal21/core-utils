package com.stanza.qr.generator;

import io.nayuki.qrcodegen.QrCode;
import io.nayuki.qrcodegen.QrSegment;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QRGeneratorUtility
{
    public final static QrCode.Ecc DEFAULT_ECC_LEVEL = QrCode.Ecc.MEDIUM;
    public final static int DEFAULT_PIXEL_SCALE = 2;
    public final static int DEFAULT_NUM_BORDERS = 2;


    public static BufferedImage generateQRImageUsingLong(String longString) throws IOException
    {
        List<QrSegment> list = createNumericSegmentsForLong(longString);
        return generateQRImage(list,DEFAULT_ECC_LEVEL,DEFAULT_PIXEL_SCALE,DEFAULT_NUM_BORDERS);
    }

    public static BufferedImage generateQRImage(String string) throws IOException
    {
        List<QrSegment> list = createSegments(string);
        return generateQRImage(list,DEFAULT_ECC_LEVEL,DEFAULT_PIXEL_SCALE,DEFAULT_NUM_BORDERS);
    }

    public static byte[] getImageByteArray(BufferedImage image) throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write( image, "png", baos );
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();
        return imageInByte;
    }

    private static List<QrSegment> createNumericSegmentsForLong(String longString)
    {
        List<QrSegment> list = new ArrayList<>(1);
        list.add(QrSegment.makeNumeric(longString));
        return list;
    }

    private static List<QrSegment> createSegments(String inputString){
        return QrSegment.makeSegments(inputString);
    }

    private static BufferedImage generateQRImage(List<QrSegment> list, QrCode.Ecc ecc, int scale, int numBorders) throws IOException
    {
        QrCode qr1 = QrCode.encodeSegments(list, ecc, 2, 2, 2, false);
        BufferedImage img1=qr1.toImage(scale,numBorders);

        return img1;
    }

    public static BufferedImage getQRImage(String text)
    {
        List<QrSegment> list = QrSegment.makeSegments(text);
        return QrCode.encodeSegments(list,DEFAULT_ECC_LEVEL).toImage(DEFAULT_PIXEL_SCALE,DEFAULT_NUM_BORDERS);
    }

}
