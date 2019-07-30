package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder @ToString(includeFieldNames=true)
public class EducationDto {

	private Long diplomaId;
	private Integer year;	
	private LocalDate startDate;	
	private LocalDate endDate;	
	private String comments;	
}
