package mapo.dto.employee.plus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @AllArgsConstructor
@NoArgsConstructor
public class FingerprintDto {

	private byte[] image;
	private byte[] templateSG400;
	private String templateSourceAfis;
	
	private int imageQuality;
	private boolean  isValid;
}
