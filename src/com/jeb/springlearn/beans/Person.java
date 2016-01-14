package com.jeb.springlearn.beans;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeb.springlearn.Tool;

public class Person {

	public Person() {
	}

	private String name;
	private int age;
	private Tool tool;
	private Collection<String> favorites;
	private Map<String, Integer> friends;
	
	public Map<String, Integer> getFriends() {
		return friends;
	}
	public void setFriends(Map<String, Integer> friends) {
		this.friends = friends;
	}
	public String getName() {
		return name;
	}
	public Collection<String> getFavorites() {
		return favorites;
	}
	public void setFavorites(Collection<String> favorites) {
		this.favorites = favorites;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Tool getTool() {
		return tool;
	}
	public void setTool(Tool tool) {
		this.tool = tool;
	}
	
	public Person(String name, int age, Tool tool) {
		this.name = name;
		this.age = age;
		this.tool = tool;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(name);
		sb.append("\n")
		  .append(age)
		  .append("Ëê£¬");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
//		System.out.println(person);
//		person.getTool().useTool();
//		Collection<String> favorites = person.getFavorites();
//		for(String favorite : favorites) {
//			System.out.println(favorite);
//		}
		
		Map<String, Integer> friends = person.getFriends();
		Iterator<String> iterator = friends.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(friends.get(iterator.next()));
		}
	}
}
