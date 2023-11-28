package com.BikkadIT.Binding.conversion;

import com.BikkadIT.Binding.Student;
import com.google.gson.Gson;

public class JavaObjToJson {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.setSid(111);
		stu.setSname("Rakesh");
		stu.setSrank(1);
		stu.setSage(31);
		System.out.println(stu);

		Gson gson = new Gson();
		String json = gson.toJson(stu);
		System.out.println(json);

	}

}
