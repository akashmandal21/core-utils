package com.stanzaliving.core.base.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

import javax.security.sasl.AuthenticationException;
import java.io.IOException;

/**
 * @author anuragdhunna
 */
public class MyErrorHandler implements ResponseErrorHandler {

    private static final Log logger = LogFactory.getLog(MyErrorHandler.class);

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {

//        if (clientHttpResponse.getStatusCode() != HttpStatus.OK) {
//            logger.debug("Status code: " + clientHttpResponse.getStatusCode());
//            logger.debug("Response" + clientHttpResponse.getStatusText());
//            logger.debug(clientHttpResponse.getBody());
//
//            if (clientHttpResponse.getStatusCode() == HttpStatus.FORBIDDEN) {
//                logger.debug("Call returned a error 403 forbidden resposne ");
//                return true;
//            }
//            if (clientHttpResponse.getStatusCode() == HttpStatus.UNAUTHORIZED) {
//                logger.debug("Call returned a error 401 forbidden resposne ");
//                return true;
//            }
//        }
        return false;
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {

//        if (clientHttpResponse.getStatusCode() == HttpStatus.FORBIDDEN) {
//            logger.debug(HttpStatus.FORBIDDEN + " response. Throwing authentication exception");
//            throw new AuthenticationException();
//        } else if (clientHttpResponse.getStatusCode() == HttpStatus.UNAUTHORIZED) {
//            logger.debug(HttpStatus.UNAUTHORIZED + " response. Throwing authentication exception");
//            throw new AuthenticationException();
//        }
    }
}
