package mapo.dto.organization;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor @ToString
public class JobDto {

	String agentId;
	LocalDate effectiveJobStartDate;
	LocalDate effectiveJobEndDate;
	String comments;
	String serviceWeapon;
	String serviceCertification;
}
