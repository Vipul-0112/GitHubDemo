package com.velocity.git_hub;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("vipul");
		list.add("atul");
		list.add("prathamesh");
		list.add("samiksha");


		for (String s : list) {
			System.out.println(s);
		}
	}
}
