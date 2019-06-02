package mapo.dto.employee;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder @ToString(exclude= {"photo"}, includeFieldNames=true)
public class PhotoDto {

	private LocalDate datePhoto;
	private byte[] photo;
	private String fileName;
}
