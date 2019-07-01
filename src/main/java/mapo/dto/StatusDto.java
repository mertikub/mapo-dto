package mapo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor
public class StatusDto {
	
	String type;
	String level;
	Long id;
	String name;
	Long parentId;
	Integer statusRank;
	String code;

}
