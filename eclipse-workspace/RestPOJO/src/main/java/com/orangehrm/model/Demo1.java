package com.orangehrm.model;

import java.io.File;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		CreateNewUser user = new CreateNewUser();
		user.setEmpid(1);
		user.setFirstName("Soul");
		user.setMiddleName("is");
		user.setLastName("Pure");

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("C:\\Users\\DELL\\eclipse-workspace\\RestPOJO\\abc.json"), user);

		System.out.println("data is added in file");
	}

}
