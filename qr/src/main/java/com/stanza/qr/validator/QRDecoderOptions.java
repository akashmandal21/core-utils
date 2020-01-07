package com.stanza.qr.validator;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum QRDecoderOptions
{
    ZXING("zxing"),
    BOOFCV("boofcv");

    private String decoderName;

    QRDecoderOptions(String decoderName)
    {
        this.decoderName = decoderName;
    }

    private static Map<String, QRDecoderOptions> decoderOptionsMap = new HashMap<>();
    static {
        for(QRDecoderOptions decoder: QRDecoderOptions.values()) {
            decoderOptionsMap.put(decoder.getDecoderName(), decoder);
        }
    }
    public static QRDecoderOptions getQRDecoderByName(String  name) {
        return decoderOptionsMap.get(name);
    }
}
