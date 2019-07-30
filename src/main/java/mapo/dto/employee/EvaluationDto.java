package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class EvaluationDto {
	private Integer rawScore;
	private String rating;
	private Integer year;	
	private LocalDate evaluationDate;	
	private LocalDate effectiveStartDate;	
	private LocalDate effectiveEndDate;
	private String comments;
	
}
