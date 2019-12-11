package com.stanzaliving.comments.http.service;

import java.util.List;
import java.util.Map;

public interface UserHttpService {
	
	Map<String, String> findUserNames(List<String> userIds);

}
