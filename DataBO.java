package shajee.ahmad.labs.rx.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DataBO {

	private Long tid;
	
	private String name;
	
	private String code;
	
}
