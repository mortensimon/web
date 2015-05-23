package com.owera.xaps.web.app.page.staging;

import java.util.Map;

import com.owera.xaps.dbi.Users;
import com.owera.xaps.web.app.Output;
import com.owera.xaps.web.app.input.ParameterParser;
import com.owera.xaps.web.app.page.AbstractWebPage;
import com.owera.xaps.web.app.security.WebUser;
import com.owera.xaps.web.app.util.SessionCache;



/**
 * The Class StagingPage.
 */
public class StagingPage extends AbstractWebPage {
	
	/* (non-Javadoc)
	 * @see com.owera.xaps.web.app.page.WebPage#process(com.owera.xaps.web.app.input.ParameterParser, com.owera.xaps.web.app.output.ResponseHandler)
	 */
	public void process(ParameterParser params, Output outputHandler) throws Exception {
		Map<String, Object> root = outputHandler.getTemplateMap();
		
		WebUser user = SessionCache.getSessionData(params.getSession().getId()).getUser();
		boolean displayDistributorLink = (user!=null&&user.getAccess().equals(Users.ACCESS_ADMIN))||(user!=null && user.getAllowedPages()!=null && user.getAllowedPages().contains("distributors"));
		root.put("ADMIN", displayDistributorLink);
		
		outputHandler.setTemplatePathWithIndex("staging");
	}

}
