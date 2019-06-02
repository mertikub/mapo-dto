package mapo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Builder @AllArgsConstructor
public class EmployeePostResponse {
	
	String status;
	EmployeeMatchDto employeeMatch;
	String message;
	
}
