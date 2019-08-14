package mapo.dto.organization;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor @ToString
public class JobPositionDto {

	Long id;
	Long realId;
	String description;
	Long positionId;
	Long rankId;
	LocalDate effectiveStartDate;
	LocalDate effectiveEndDate;
	String status;
	
	Long reportingToId;
	
	JobDto job;
	
}
