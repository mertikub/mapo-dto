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
public class QualificationsDto {
	@Builder.Default
	Set<WorkExperienceDto> workExperiences = new HashSet<WorkExperienceDto>();
	@Builder.Default
	Set<EducationDto> educations = new HashSet<EducationDto>();
	@Builder.Default
	Set<SpecialityDto> specialities = new HashSet<SpecialityDto>();
	@Builder.Default
	Set<LanguageDto> languages = new HashSet<LanguageDto>();
}
