package io.pivotal.rsocketserver.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class MyCustomBean {
	
	private String name;
	private int age;
	private String deptt;

}
