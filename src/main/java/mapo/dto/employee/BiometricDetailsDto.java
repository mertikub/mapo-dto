package mapo.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class BiometricDetailsDto {
	
	FingerprintDto rightThumb;
	FingerprintDto leftThumb;
	String employeeId;
}
