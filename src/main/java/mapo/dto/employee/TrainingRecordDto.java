package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class TrainingRecordDto {

	String courseCode;
	LocalDate startDate;
	LocalDate endDate;
	RegionDto location;
	String description;
	String sponsor;
	String employeeId;
	String comment;
	AdministrativeActDto administrativeAct;
	
}
