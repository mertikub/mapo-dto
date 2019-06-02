package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class JobHistoryItemDto {
	String jobPosition;	
	String orgStructure;	
	String grade;	
	LocalDate effectiveStartDate;	
	LocalDate effectiveEndDate;
	JobTerminationDto termination;
	AdministrativeActDto administrativeAct;
}
