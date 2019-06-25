package mapo.dto.employee;

import java.util.HashSet;
import java.util.Set;

public class TypeDtoSet {
	private Set<TypeDto> types;
	
	public TypeDtoSet() {
		types = new HashSet<TypeDto>();
	}
	
	public TypeDtoSet(Set<TypeDto> types) {
		this();
		this.types.addAll(types);
	}

	public Set<TypeDto> getTypes() {
		return types;
	}

	public void setTypes(Set<TypeDto> types) {
		this.types = types;
	}	
}
