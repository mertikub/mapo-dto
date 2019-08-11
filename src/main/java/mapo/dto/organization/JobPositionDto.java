package mapo.dto.organization;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor
public class JobPositionDto {

	Long id;
	Long realId;
	String description;
	Long positionId;
	Long rankId;
	LocalDate effectiveStartDate;
	LocalDate effectiveEndDate;
	String status;
	
	//Job
	String agentId;
	LocalDate effectiveJobStartDate;
	LocalDate effectiveJobEndDate;
	String comments;
	String serviceWeapon;
	String serviceCertification;
	
}
