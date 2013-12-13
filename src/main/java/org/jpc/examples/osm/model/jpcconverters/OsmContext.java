package org.jpc.examples.osm.model.jpcconverters;

import org.jpc.Jpc;
import org.jpc.JpcBuilder;

public class OsmContext {

	private static Jpc context;
	
	public static Jpc getOsmContext() {
		if(context == null) {
			context = JpcBuilder.create()
					.register(new OsmJpcConverter())
					.register(new CoordinateJpcConverter())
					.register(new NodeJpcConverter())
					.register(new WayJpcConverter())
					.build();
		}
		return context;
	}
	
}
