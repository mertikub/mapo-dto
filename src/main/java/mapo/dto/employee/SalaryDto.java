package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class SalaryDto {

	private Integer payClass;	
	private Double salary;	
	private LocalDate effectiveStartDate;	
	private LocalDate effectiveEndDate;
	private Integer ticketNumber;
	private String paymentMethod;
	private Integer grossEarningsIndex;
	private Integer numberOfChildrenReceivingBenefits;
	private Integer numberofChildrenInvalid;
	private Double familyAllowanceAmount;
	private Double premiumsAndAllowances;
	private Double salaryReminders;
	private Double totalPremiumsAndAllowances;
	private Integer taxableBase;
	private String functionalCode;
	private String imputation;
	private String its;
	private String cmssinps; 
	private Double healthInsuranceDeductions;
	private Double totalDeductions;
	private Double salaryNet;
	private Double withholdingTax;
	private Double netToPay;
	private String comments;
	
}
