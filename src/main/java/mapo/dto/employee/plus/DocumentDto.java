package mapo.dto.employee.plus;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mapo.dto.employee.AttachmentDto;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class DocumentDto {
	Long docTypeId;
	LocalDate dateAdded;
	String comments;
	AttachmentDto attachment;
	String employee;
}
