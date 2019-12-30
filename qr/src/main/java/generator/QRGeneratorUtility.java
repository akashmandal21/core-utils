package generator;

import io.nayuki.qrcodegen.QrCode;
import io.nayuki.qrcodegen.QrSegment;
import lombok.extern.log4j.Log4j2;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Log4j2
public class QRGeneratorUtility
{
    public final static QrCode.Ecc DEFAULT_ECC_LEVEL = QrCode.Ecc.HIGH;
    public final static int DEFAULT_PIXEL_SCALE = 4;
    public final static int DEFAULT_NUM_BORDERS = 4;

    public static BufferedImage generateUUIDAndQRImage() throws IOException
    {
        UUID uuid = UUID.randomUUID();
        return generateQRImageForUuid(createNumericSegmentsForUUID(uuid),DEFAULT_ECC_LEVEL,DEFAULT_PIXEL_SCALE,DEFAULT_NUM_BORDERS);
    }

    public static BufferedImage generateQRImageUsingUuid(UUID uuid,int scale,int borders, QrCode.Ecc ecc) throws IOException
    {
        return generateQRImageForUuid(createNumericSegmentsForUUID(uuid),ecc,scale,borders);
    }

    private static List<QrSegment> createNumericSegmentsForUUID(UUID uuid)
    {
        List<QrSegment> list = new ArrayList<>(2);
        list.add(QrSegment.makeNumeric(Long.toUnsignedString(uuid.getMostSignificantBits())));
        list.add(QrSegment.makeNumeric(Long.toUnsignedString(uuid.getLeastSignificantBits())));
        return list;
    }


    private static BufferedImage generateQRImageForUuid(List<QrSegment> list, QrCode.Ecc ecc, int scale, int numBorders) throws IOException
    {
        QrCode qr1 = QrCode.encodeSegments(list, ecc, 2, 3, 2, false);
        BufferedImage img1=qr1.toImage(scale,numBorders);

        return img1;
    }

    public static BufferedImage getQRImage(String text)
    {
        List<QrSegment> list = QrSegment.makeSegments(text);
        return QrCode.encodeSegments(list,DEFAULT_ECC_LEVEL).toImage(DEFAULT_PIXEL_SCALE,DEFAULT_NUM_BORDERS);
    }


}
