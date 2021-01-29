package com.dlabs.java8_workouts;

import java.util.StringJoiner;

/**
 * Hello world!
 *
 */
public class StringJoinerDemo {
	public static void main(String[] args) {
		// Document Template 1550478640966 CHN_1450-543.pdf
		String fileName = "Document Template.txt";
		String s1 = fileName.substring(fileName.lastIndexOf("."));
		String s2 = fileName.substring(0, fileName.lastIndexOf("."));
		String s3 = "1550485749340";
		String reportType = "CH_345";
		System.out.println("Hello World!1 :" + s1);
		System.out.println("Hello World!2 : " + s2);

		StringBuilder sb = new StringBuilder(" ");

		// StringJoiner sj = new StringJoiner();

		StringJoiner sj = new StringJoiner(" ");
		sj.add(s2).add(s3).add(reportType).add(s1);
		// sj.add(s3);
		// sj.add(reportType);
		// sj.add(s1);
		System.out.println("Hello World!3 : " + sj);

	}
}
