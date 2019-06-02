package mapo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class EmployeeMatchDto {

	String agentId;
	String matricule;
	String name;
	String surname;
	String fatherName;
	LocalDate dateOfBirth;	
}
