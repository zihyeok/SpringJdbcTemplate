package com.exe.springJdbcTemplate;

import lombok.Data;
import lombok.ToString;

//@Getter
//@Setter
 
//public@Data class CustomDTO { �̷� ��ĵ� ����
@ToString
@Data //get,set �ٸ���
public class CustomDTO {

	//private @Setter int id; 1���� �Ҽ��� �ִ� 	
	private int id;
	private String name;
	private int age;
	
	
	
}
