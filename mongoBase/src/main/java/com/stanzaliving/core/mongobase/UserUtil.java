package com.stanzaliving.core.mongobase;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.pojo.CurrentUser;
import lombok.experimental.UtilityClass;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.Objects;

@UtilityClass
public class UserUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String getCurrentUserId() {
        CurrentUser userIdDto = getCurrentUser();

        String userId = null;

        if (Objects.nonNull(userIdDto)) {
            userId = userIdDto.getUserId();
        }

        return userId;
    }

    public static String getCurrentUserName() {
        CurrentUser userIdDto = getCurrentUser();

        StringBuilder builder = new StringBuilder();

        String userName = null;

        if (Objects.nonNull(userIdDto) && Objects.nonNull(userIdDto.getFirstName())) {

            builder.append(userIdDto.getFirstName());

            if (Objects.nonNull(userIdDto.getLastName())) {
                builder.append(" ");
                builder.append(userIdDto.getLastName());
            }

            userName = userIdDto.getFirstName() + " " + userIdDto.getLastName();
        }

        return userName;
    }

    private static CurrentUser getCurrentUser() {
        try {
            RequestAttributes attributes = RequestContextHolder.currentRequestAttributes();
            Object scopedObject =
                    attributes.getAttribute(CurrentUser.class.getName(), RequestAttributes.SCOPE_REQUEST);

            String json = objectMapper.writeValueAsString(scopedObject);

            return objectMapper.readValue(json, CurrentUser.class);
        } catch (Exception e) {
        }
        return null;
    }


}
