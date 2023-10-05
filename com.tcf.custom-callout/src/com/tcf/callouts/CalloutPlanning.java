package com.tcf.callouts;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MProduction;
import org.compiere.util.CLogger;

public class CalloutPlanning implements IColumnCallout {

	CLogger log = CLogger.getCLogger(CalloutPlanning.class);
	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		// TODO Auto-generated method stub

		
		if(mField.getColumnName().equalsIgnoreCase("M_Planning_ID")) 
			mTab.setValue(MProduction.COLUMNNAME_Name, mField.getValue());
			
		
		
		return null;
	}

}
