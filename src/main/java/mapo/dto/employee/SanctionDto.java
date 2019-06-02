package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class SanctionDto {
	String comments;
	String motive;
	Long sanctionId;
	String sanctionName;
	LocalDate date;
	Integer numberOfStopDays;
}
