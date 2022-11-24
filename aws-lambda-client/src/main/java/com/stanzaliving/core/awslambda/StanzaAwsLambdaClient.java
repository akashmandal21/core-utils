package com.stanzaliving.core.awslambda;

import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.model.FunctionConfiguration;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.model.ListFunctionsResult;
import com.stanzaliving.core.base.exception.StanzaException;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Log4j2
public class StanzaAwsLambdaClient {

    private AWSLambda awsLambda;

    public StanzaAwsLambdaClient(AWSLambda awsLambda) {
        this.awsLambda = awsLambda;
    }

    public String invokeLambdaHandler(String lambdaName, String eventJsonString) {

        InvokeRequest invokeRequest = new InvokeRequest()
                .withFunctionName(lambdaName);

        if (StringUtils.isNotBlank(eventJsonString)) {
            invokeRequest.withPayload(eventJsonString);
        }

        InvokeResult invokeResult = null;
        String lambdaHandlerFnResponseJson = null;
        try {
            invokeResult = awsLambda.invoke(invokeRequest);

            log.info("Lambda invocation status code: {}, and response is: {}", invokeResult.getStatusCode(), invokeRequest);

            if (Objects.isNull(invokeResult)) {
                throw new StanzaException("Lambda invoke operation is not success");
            }

            ByteBuffer payload = invokeResult.getPayload();

            if (Objects.nonNull(payload) || payload.hasRemaining()) {
                lambdaHandlerFnResponseJson = new String(payload.array(), StandardCharsets.UTF_8);
            }

            log.info("Response payload body from lambda invoke handler fn: {}", lambdaHandlerFnResponseJson);

        } catch (Exception e) {
            log.error(e);
        }

        return lambdaHandlerFnResponseJson;
    }

    public List<String> listAllLambdaFunctions() {

        List<String> lambdaNameList = new ArrayList<>();

        ListFunctionsResult functionResult = null;

        try {
            functionResult = awsLambda.listFunctions();

            List<FunctionConfiguration> list = functionResult.getFunctions();

            for (Iterator iter = list.iterator(); iter.hasNext();) {

                FunctionConfiguration config = (FunctionConfiguration) iter.next();

                log.info("The function name is " + config.getFunctionName());

                lambdaNameList.add(config.getFunctionName());
            }
        } catch (Exception e) {
            log.error(e);
        }
        return lambdaNameList;
    }
}
