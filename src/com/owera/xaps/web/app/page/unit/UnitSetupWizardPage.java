package com.owera.xaps.web.app.page.unit;

import com.owera.xaps.web.app.Output;
import com.owera.xaps.web.app.input.InputDataIntegrity;
import com.owera.xaps.web.app.input.InputDataRetriever;
import com.owera.xaps.web.app.input.ParameterParser;
import com.owera.xaps.web.app.page.AbstractWebPage;


/**
 * The Class UnitSetupWizardPage.
 */
public class UnitSetupWizardPage extends AbstractWebPage {

	/* (non-Javadoc)
	 * @see com.owera.xaps.web.app.page.WebPage#process(com.owera.xaps.web.app.input.ParameterParser, com.owera.xaps.web.app.output.ResponseHandler)
	 */
	@Override
	public void process(ParameterParser params, Output outputHandler) throws Exception {
		UnitData inputData = (UnitData) InputDataRetriever.parseInto(new UnitData(), params);

		InputDataIntegrity.loadAndStoreSession(params,outputHandler, inputData, inputData.getUnittype(), inputData.getProfile(),inputData.getUnit());
		
		if(inputData.getUnit().notNullNorValue(""))
			outputHandler.getTemplateMap().put("unit", inputData.getUnit().getString());

		outputHandler.setTemplatePath("unit/setup-wizard");
	}

}
