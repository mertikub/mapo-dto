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
public class WorkExperienceDto {
	private String job;	
	private String company;	
	private LocalDate dateBegin;	
	private LocalDate dateEnd;	
	private String comments;
}
