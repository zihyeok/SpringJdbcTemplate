package com.exe.springJdbcTemplate;

import lombok.Data;
import lombok.ToString;

//@Getter
//@Setter
 
//public@Data class CustomDTO { 이런 방식도 있음
@ToString
@Data //get,set 다만듬
public class CustomDTO {

	//private @Setter int id; 1개씩 할수도 있다 	
	private int id;
	private String name;
	private int age;
	
	
	
}
