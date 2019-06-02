package mapo.dto.employee;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class EmployeeReviewDto {
	@Builder.Default
	Set<RewardDto> rewards = new HashSet<RewardDto>();
	@Builder.Default
	Set<SanctionDto> sanctions = new HashSet<SanctionDto>();
	@Builder.Default
	Set<EvaluationDto> evaluations = new HashSet<EvaluationDto>();
}
