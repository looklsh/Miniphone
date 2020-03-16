package homework.pro.ex;

import java.io.File;
import java.util.Scanner;

public class Phone {
	private String name;
	private String hp;
	private String tel;
	

	
	 


	
	public Phone(String name, String hp, String tel) {
		this.name=name;
		this.hp=hp;
		this.tel=tel;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
	}

}
