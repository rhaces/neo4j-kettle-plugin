package org.neo4j.kettle.steps.output;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

public class Neo4jOutputData extends BaseStepData implements StepDataInterface{
	public RowMetaInterface outputRowMeta;

	public Neo4jOutputData(){
		super();
	}

}
