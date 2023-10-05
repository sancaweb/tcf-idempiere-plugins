package com.tcf.factories;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.compiere.model.MProduction;
import org.compiere.util.CLogger;
import org.tcf.model.MPlanning;

import com.tcf.callouts.CalloutPlanning;

public class CustomCalloutFactory implements IColumnCalloutFactory {
	CLogger log = CLogger.getCLogger(CustomCalloutFactory.class);

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		// TODO Auto-generated method stub

		List<IColumnCallout> list = new ArrayList<IColumnCallout>();
		
		if(tableName.equalsIgnoreCase(MProduction.Table_Name) && columnName.equalsIgnoreCase(MPlanning.COLUMNNAME_M_Planning_ID))
			list.add(new CalloutPlanning());
		

		
		return list != null ? list.toArray(new IColumnCallout[0]) : new IColumnCallout[0];
	}

}
