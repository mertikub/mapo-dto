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
public class EmployeeDto {
	
	String bcs;
	String matricule;
	String name;
	String surname;
	String fatherName;
	String gender;
	String middleName;
	LocalDate dateOfBirth;
	String nina;
	String amo;
	String motherName;
	String bloodGroup;
	String passportNumber;
	@Builder.Default
	Boolean verified = false;
	String drivingLicenseNumber;
	String agentId;
	LocalDate dateOfIncorporation;
	LocalDate dateOfRetirement;
	
	PhotoDto photo;
	CivilStatusDto civilStatus;
	ContactDetailsDto contactDetails;
	SalaryDto salary;
	EmployeeRankDto employeeRank;
	EmpStatusDto employeeStatus;
	QualificationsDto qualifications;
	EmployeeReviewDto review;
	
}
