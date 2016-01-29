package in.yogi;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import in.yogi.PrimaryType;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the main Application!!!");
		PrimaryType sourceObject = new PrimaryType("Yogi", 31);
		System.out.println(sourceObject);
		Mapper mapper = new DozerBeanMapper();
		SecondaryType destObject =  
		    mapper.map(sourceObject, SecondaryType.class);
		System.out.println(destObject);
	}
}
