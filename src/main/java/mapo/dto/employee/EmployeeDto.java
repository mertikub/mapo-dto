package mapo.dto.employee;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import mapo.dto.employee.plus.DocumentDto;
import mapo.dto.employee.plus.EmployeeRankRecordDto;
import mapo.dto.employee.plus.FingerprintDto;
import mapo.dto.employee.plus.TrainingRecordDto;

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
	
	FingerprintDto rightFingerprint;
	FingerprintDto leftFingerprint;
	
	List<TrainingRecordDto> trainingRecords;
	Set<DocumentDto> documents;
	List<JobHistoryItemDto> jobHistory;
	List<EmployeeRankRecordDto> rankHistory;
}
