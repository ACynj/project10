package com.ynj.problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.ynj.beans.Book;
import com.ynj.beans.Student;

public class Problem1 {
	public static void main(String []args) {
 /*List<Book> bookList =new ArrayList<>();
 //封装数据
    Book book1=new Book();
    book1.setId("1");
    book1.setName("舒克和贝塔");
    book1.setPrice("30");
    book1.setPublish("中国儿童文学出版社");
    Book book2=new Book();
    book2.setId("2");
    book2.setName("React.js");
    book2.setPrice("50");
    book2.setPublish("清华大学出版社");
    //放入list
    bookList.add(book1);
    bookList.add(book2);
    //遍历
    for(Book book:bookList) {
    	System.out.println(book);
    }
    */
		
		/*Map<String, Book> bookMap=new HashMap<>();
		//封装数据
		    Book book1=new Book();
		    book1.setId("1");
		    book1.setName("舒克和贝塔");
		    book1.setPrice("30");
		    book1.setPublish("中国儿童文学出版社");
		    Book book2=new Book();
		    book2.setId("2");
		    book2.setName("React.js");
		    book2.setPrice("50");
		    book2.setPublish("清华大学出版社");
		    //放入map
		    bookMap.put(book1.getId(), book1);
		    bookMap.put(book2.getId(), book2);
		    for(Integer i=1;i<=bookMap.size();i++) {
		    	System.out.println(bookMap.get(i.toString()));
		    }*/
		HashMap<String, Student> studentMap=new HashMap<>();
		  Scanner in=new Scanner(System.in);
		  System.out.println("请输入学生学号、姓名和年龄,按照顺序中间以空格隔开");
		  String studentInfo=in.nextLine();
		  while (!studentInfo.equals("exit")) { 
			  String []students=studentInfo.split(" ");
			  Student student=new Student();
			  student.setId(students[0]);
			  student.setName(students[1]);
			  student.setAge(students[2]);
			  studentMap.put(student.getId(),student);
			  System.out.println("请输入学生学号、姓名和年龄,按照顺序中间以空格隔开");
			  studentInfo=in.nextLine();  
		  }
		  for(Integer i=1;i<=studentMap.size();i++) {
			  System.out.println(studentMap.get(i.toString()));
		  }
	}
}
