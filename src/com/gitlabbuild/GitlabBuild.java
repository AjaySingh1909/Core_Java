package com.gitlabbuild;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GitlabBuild {
	
	@Builder.Default long id=System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		GitlabBuild gb=GitlabBuild.builder()
				.id(10)
				.build();
		
		System.out.println(gb);
		
		
	}
}
