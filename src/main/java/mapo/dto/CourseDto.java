package mapo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Builder @AllArgsConstructor
public class CourseDto {

	Long id;
	String code;
	String title;
	boolean status;
	String company;
	String description;
}
