package mapo.dto.employee;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mapo.dto.employee.plus.DocumentDto;
import mapo.dto.employee.plus.EmployeeRankRecordDto;
import mapo.dto.employee.plus.FingerprintDto;
import mapo.dto.employee.plus.TrainingRecordDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
	Long placeOfBirthId;
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

	@Override
	public String toString() {
		return String.format(
				"\nEmployeeDto [bcs=%s, matricule=%s, name=%s, surname=%s, fatherName=%s, gender=%s, middleName=%s, dateOfBirth=%s, nina=%s, amo=%s, "
				+ "motherName=%s, bloodGroup=%s, passportNumber=%s, verified=%s, drivingLicenseNumber=%s, agentId=%s, dateOfIncorporation=%s, "
				+ "dateOfRetirement=%s, photo=%s, civilStatus=%s, contactDetails=%s, salary=%s, employeeRank=%s, employeeStatus=%s, qualifications=%s, "
				+ "review=%s, rightFingerprint=%s, leftFingerprint=%s, trainingRecords=%s, documents=%s, jobHistory=%s, rankHistory=%s]",
				bcs, matricule, name, surname, fatherName, gender, middleName, dateOfBirth, nina, amo, motherName,
				bloodGroup, passportNumber, verified, drivingLicenseNumber, agentId, dateOfIncorporation,
				dateOfRetirement, photo, civilStatus, contactDetails, salary, employeeRank, employeeStatus,
				qualifications, review, rightFingerprint, leftFingerprint, trainingRecords, documents, jobHistory,
				rankHistory);
	}

}
