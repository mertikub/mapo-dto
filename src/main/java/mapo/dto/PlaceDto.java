package mapo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@Builder @NoArgsConstructor
public class PlaceDto {

	Long id;
	String name;
	String abbreviation;
	Long regionId;
	@Builder.Default
	boolean active = true;
	
}
