package mapo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class ZoneDto {

	Long id;
	String name;
	String abbreviation;
	Long regionId;
	@Builder.Default
	boolean active = true;
}
