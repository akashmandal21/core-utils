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
import com.stanzaliving.core.base.exception.StanzaException;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class QRCodeDataExtractor
{
    public static String decodeSingleQRCode(BufferedImage image, QRDecoderOptions decoder) throws StanzaException
    {
        String result=null;
        try {
            switch (decoder) {
                case ZXING:
                    result = QRDecode_ZXING.attemptSingleDecodeUsingZxing(image);
                    break;

                case BOOFCV:
                    result =  QRDecode_BoofCV.attemptSingleQRDecodeUsingBoofCV(image);
                    break;

                default:
                    throw new StanzaException("Decoder:"+decoder.getDecoderName()+" is not implemented yet");
            }
        }
        catch (Exception ex)
        {
            throw new StanzaException("Unable to detect QR Code using decoder:"+decoder.getDecoderName()+" "+ex.getMessage());
        }

        if(result==null)
        {
            throw new StanzaException("Unable to detect QR Code using decoder:"+decoder.getDecoderName());
        }
        else
            return result;
    }

    public static String decodeSingleQRCode(URL url, QRDecoderOptions decoder) throws StanzaException
    {
        BufferedImage image =UtilImageIO.loadImage(url);
        return decodeSingleQRCode(image,decoder);
    }
    public static String decodeSingleQRCode(InputStream stream, QRDecoderOptions decoder) throws StanzaException
    {
        BufferedImage image = null;
        try {
            image = ImageIO.read(stream);
        } catch (IOException e) {
            throw new StanzaException("Unable to detect QR Code using decoder:"+decoder.getDecoderName()+" "+e.getMessage());
        }
        return decodeSingleQRCode(image,decoder);
    }

//    @Test
//    public static void main(String[] args) {
//
//        File file = new File("/Users/ankit.khandelwal/Downloads/qrimg/micro_qr/qr_3_pixel_32char/");
//        Arrays.stream(file.listFiles()).forEach(f->{
//            if (f.getName().endsWith("jpg")) {
//                System.out.print(f.getName()+",");
//                try {
//                    System.out.print("BoofCV:"+attemptSingleQRDecodeUsingBoofCV(f.toURI().toURL())+",");
//                    System.out.println("ZXing :"+attemptSingleDecodeUsingZxing(f.toURI().toURL()));
//                } catch(Exception e){
//                    System.out.println("Could not decode QR Code, IOException :: " + e.getMessage());
//                }
//            }
//        });
//
//    }

}
