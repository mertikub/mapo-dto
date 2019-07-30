package mapo.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder @ToString(includeFieldNames=true)
public class SpecialityDto {
	Long specialityId;
	Integer yearsOfExperience;	
	String comments;
}
