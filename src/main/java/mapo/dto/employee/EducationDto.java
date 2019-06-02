package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class EducationDto {

	Long diplomaId;
	String diplomaName;
	private Integer year;	
	private LocalDate startDate;	
	private LocalDate endDate;	
	private String comments;	
}
