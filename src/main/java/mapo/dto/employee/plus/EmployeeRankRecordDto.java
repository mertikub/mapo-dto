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
public class EmployeeRankRecordDto {

	private String corps;	
	private String grade;	
	private LocalDate effectiveFromDate;	
	private LocalDate effectiveEndDate;
	private AdministrativeActDto administrativeAct;
}
