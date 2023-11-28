package com.BikkadIT.Binding.conversion;

	import java.io.FileNotFoundException;
	import java.io.FileReader;

	import com.BikkadIT.Binding.Student;
	import com.google.gson.Gson;
	import com.google.gson.JsonParseException;
	import com.google.gson.JsonSyntaxException;

	public class JsonToJavaObj {

		public static void main(String[] args) throws JsonSyntaxException, JsonParseException, FileNotFoundException {

			Gson gson = new Gson();
			Student fromJson = gson.fromJson(new FileReader("Student.Gson"), Student.class);
			System.out.println(fromJson);

		}
}
