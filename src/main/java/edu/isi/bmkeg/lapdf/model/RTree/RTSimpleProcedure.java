package edu.isi.bmkeg.lapdf.model.RTree;

import edu.isi.bmkeg.lapdf.model.ChunkBlock;
import edu.isi.bmkeg.lapdf.model.WordBlock;
import edu.isi.bmkeg.lapdf.model.ordering.SpatialOrdering;
import edu.isi.bmkeg.lapdf.model.spatial.SpatialEntity;
import gnu.trove.TIntProcedure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class RTSimpleProcedure implements TIntProcedure {

	private RTSpatialRepresentation tree;
	private SpatialEntity foundEntity;

	public RTSimpleProcedure(RTSpatialRepresentation tree) {
		this.tree = tree;
	}

	@Override
	public boolean execute(int id) {
		
		SpatialEntity entity = this.tree.getEntity(id);

		if (entity!= null) {
			
			this.foundEntity = entity;
			return true;

		} else {
		
			return false;
		
		}

	}

	public SpatialEntity getFoundEntity() {
		return foundEntity;
	}

	public void setFoundEntity(SpatialEntity foundEntity) {
		this.foundEntity = foundEntity;
	}


}
