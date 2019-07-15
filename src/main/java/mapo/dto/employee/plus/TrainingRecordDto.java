package mapo.dto.employee.plus;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mapo.dto.employee.AdministrativeActDto;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class TrainingRecordDto {

	String courseCode;
	LocalDate startDate;
	LocalDate endDate;
	Long regionId;
	String description;
	String sponsor;
	String employeeId;
	String comment;
	AdministrativeActDto administrativeAct;
	
}
