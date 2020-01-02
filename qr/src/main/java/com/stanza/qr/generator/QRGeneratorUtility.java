package com.stanza.qr.generator;

import io.nayuki.qrcodegen.QrCode;
import io.nayuki.qrcodegen.QrSegment;
import lombok.extern.log4j.Log4j2;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QRGeneratorUtility
{
    public final static QrCode.Ecc DEFAULT_ECC_LEVEL = QrCode.Ecc.MEDIUM;
    public final static int DEFAULT_PIXEL_SCALE = 2;
    public final static int DEFAULT_NUM_BORDERS = 2;

    public static BufferedImage generateUUIDAndQRImage() throws IOException
    {
        UUID uuid = UUID.randomUUID();
        return generateQRImageForUuid(createNumericSegmentsForUUID(uuid.toString()),DEFAULT_ECC_LEVEL,DEFAULT_PIXEL_SCALE,DEFAULT_NUM_BORDERS);
    }

    public static BufferedImage generateQRImageUsingUuid(String uuidString) throws IOException
    {
        List<QrSegment> list = createNumericSegmentsForUUID(uuidString);
        return generateQRImageForUuid(list,DEFAULT_ECC_LEVEL,DEFAULT_PIXEL_SCALE,DEFAULT_NUM_BORDERS);
    }

    private static List<QrSegment> createNumericSegmentsForUUID(String uuidString)
    {

        UUID uuid=UUID.fromString(uuidString);
        List<QrSegment> list = new ArrayList<>(2);
        list.add(QrSegment.makeNumeric(Long.toUnsignedString(uuid.getMostSignificantBits())));
        list.add(QrSegment.makeNumeric(Long.toUnsignedString(uuid.getLeastSignificantBits())));
        return list;
    }


    private static BufferedImage generateQRImageForUuid(List<QrSegment> list, QrCode.Ecc ecc, int scale, int numBorders) throws IOException
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

    public static void main(String args[]) throws IOException {
        ImageIO.write(generateUUIDAndQRImage(), "png", new File("qr-code.png"));

    }

}
