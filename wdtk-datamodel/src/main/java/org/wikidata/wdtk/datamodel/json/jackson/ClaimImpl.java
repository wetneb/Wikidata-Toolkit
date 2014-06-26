package org.wikidata.wdtk.datamodel.json.jackson;

import java.util.List;

import org.wikidata.wdtk.datamodel.interfaces.Claim;
import org.wikidata.wdtk.datamodel.interfaces.EntityIdValue;
import org.wikidata.wdtk.datamodel.interfaces.Snak;
import org.wikidata.wdtk.datamodel.interfaces.SnakGroup;

/**
 * This class only exists to satisfy the interface of the data model.
 * @author Fredo Erxleben
 *
 */
public class ClaimImpl implements Claim {

	private StatementImpl statement;
	
	ClaimImpl(StatementImpl statement){
		this.statement = statement;
	}
	
	@Override
	public EntityIdValue getSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Snak getMainSnak() {
		return this.statement.getMainsnak();
	}

	@Override
	public List<SnakGroup> getQualifiers() {
		// TODO
		return null;
	}

}
