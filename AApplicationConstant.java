package com.digitplus.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
private final class AApplicationConstant {

	
	public static final List<String> WHITELIST_URL = new ArrayList(Arrays.asList("/oauth/grant", "/oauth/grant/login", "/oauth/revoke/",
			"/keycloak/grant", "/oauth/changepassword", "/saveRephraseCallBackData", "/info", "/configdata", "health/grantAuthentication",
			"/fleetnames", "/getFleetData", "/save/preinspection", "/getMappedFieldNames", "/activitystatus", "/sheetname", "/health/","/region","/check","/validate/otp","/generate/otp" ));

	

}
