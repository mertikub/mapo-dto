package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class EmployeeRankRecordDto {

	private String corps;	
	private String grade;	
	private LocalDate effectiveFromDate;	
	private LocalDate effectiveEndDate;
	private AdministrativeActDto administrativeAct;
}
