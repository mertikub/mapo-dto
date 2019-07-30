package mapo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@Builder @AllArgsConstructor @ToString
public class EmployeePostResponse {
	
	public static final String OK = "ok";
	public static final String DUPLICATE = "duplicate";
	public static final String ERROR = "error";	
	
	String status;
	EmployeeMatchDto employeeMatch;
	String message;
	
}
