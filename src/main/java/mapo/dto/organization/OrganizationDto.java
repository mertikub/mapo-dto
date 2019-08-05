package mapo.dto.organization;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor
public class OrganizationDto {

	Long id;
	String name;
	String type;
	Long parentId;
	LocalDate effectiveStartDate;
	LocalDate effectiveEndDate;
	Long regionId;
	
}
