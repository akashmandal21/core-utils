package com.stanzaliving.core.search.client.api.food;

import com.stanzaliving.core.base.http.StanzaRestClient;
import com.stanzaliving.core.food.dto.response.DataCountPageResponse;
import com.stanzaliving.search.food.index.dto.vasmaster.VasMasterIndexDto;
import com.stanzaliving.search.food.search.dto.VasMasterSearchDto;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 17-Mar-2021
 */

public interface VasMasterService {

	DataCountPageResponse<VasMasterIndexDto> searchVasMaster(StanzaRestClient restClient, VasMasterSearchDto searchDto);
}
