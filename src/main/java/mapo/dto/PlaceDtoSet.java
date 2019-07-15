package mapo.dto;

import java.util.HashSet;
import java.util.Set;

public class PlaceDtoSet {
	private Set<PlaceDto> places;
	
	public PlaceDtoSet() {
		places = new HashSet<PlaceDto>();
	}
	
	public PlaceDtoSet(Set<PlaceDto> set) {
		this();
		this.places = set;
	}

	public Set<PlaceDto> getPlaces() {
		return places;
	}

	public void setPlaces(Set<PlaceDto> places) {
		this.places = places;
	}


	
	
}
