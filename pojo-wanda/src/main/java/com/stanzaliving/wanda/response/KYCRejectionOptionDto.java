package src.main.java.com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KYCRejectionOptionDto {

    private String uuid;
    private String option;
}
