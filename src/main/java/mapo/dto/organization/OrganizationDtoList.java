package mapo.dto.organization;

import java.util.ArrayList;
import java.util.List;

public class OrganizationDtoList {

	private List<OrganizationDto> list;
	
	public OrganizationDtoList() {
		list = new ArrayList<OrganizationDto>();
	}
	
	public OrganizationDtoList(List<OrganizationDto> list) {
		this();
		this.list.addAll(list);
	}
	
	public List<OrganizationDto> getList() {
		return list;
	}
}
