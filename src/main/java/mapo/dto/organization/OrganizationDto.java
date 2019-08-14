package mapo.dto.organization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor @ToString
public class OrganizationDto {

	Long id;
	String name;
	String type;
	Long parentId;
	LocalDate effectiveStartDate;
	LocalDate effectiveEndDate;
	Long regionId;
	Long realId;
	
	@Builder.Default
	List<JobPositionDto> jobPositions = new ArrayList<JobPositionDto>();
	
	JobPositionDto chief;
}
