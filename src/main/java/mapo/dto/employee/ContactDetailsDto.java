package mapo.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class ContactDetailsDto {

	String addressStreet1;
	String addressStreet2;
	String number;
	String cellNumber;
	String cellNumber2;
	String telNumber;
	String email;
	String note;
	String emergencyContact;
	ZoneDto zone;
	
}
