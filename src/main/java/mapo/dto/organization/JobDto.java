package mapo.dto.organization;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import mapo.dto.employee.AdministrativeActDto;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor @ToString
public class JobDto {

	String agentId;
	LocalDate effectiveJobStartDate;
	LocalDate effectiveJobEndDate;
	String comments;
	String serviceWeapon;
	String serviceCertification;
	
	AdministrativeActDto administrativeAct;
}
