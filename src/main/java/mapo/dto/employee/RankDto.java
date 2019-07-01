package mapo.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class RankDto {

	Long id;
	String name;
	String abbreviation;
	Integer index;
	Long parentId;
	String type;
	Integer rank;
	Integer retirementAge;
	String code;
}
