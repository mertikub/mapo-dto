package mapo.dto;

import java.util.HashSet;
import java.util.Set;

public class StatusDtoSet {

	private Set<StatusDto> statusList;
	
	public StatusDtoSet() {
		statusList = new HashSet<StatusDto>();
	}
	
	public StatusDtoSet(Set<StatusDto> statusList) {
		this();
		this.statusList.addAll(statusList);
	}

	public Set<StatusDto> getStatusList() {
		return statusList;
	}

	public void setStatusList(Set<StatusDto> statusList) {
		this.statusList = statusList;
	}
	
	
}
