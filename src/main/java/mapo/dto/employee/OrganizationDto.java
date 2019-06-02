package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class OrganizationDto {

	Long id;
	String name;
	String type;
	OrganizationDto parent;
	LocalDate effectiveStartDate;
	LocalDate effectiveEndDate;
	JobPositionDto chief;
}
