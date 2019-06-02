package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class WorkExperienceDto {
	private String job;	
	private String company;	
	private LocalDate dateBegin;	
	private LocalDate dateEnd;	
	private String comments;
}
