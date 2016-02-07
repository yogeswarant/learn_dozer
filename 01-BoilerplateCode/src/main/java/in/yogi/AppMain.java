package in.yogi;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the main Application!!!");
		PrimaryType sourceObject = new PrimaryType("Yogi", 31);
		System.out.println(sourceObject);

		Mapper mapper = new DozerBeanMapper();

		/* Destination object will get created even if the
		 * 	SecondaryType class does not have a public constructor.
		 */
		SecondaryType destObject =
		    mapper.map(sourceObject, SecondaryType.class);
		System.out.println("mapper.map(sourceObject, SecondaryType.class);");
		System.out.println(destObject);

		/* This method can only be used when the SecondaryType
		 * has a public constructor.
		 */
		SecondaryType destObject2 = new SecondaryType();
		mapper.map(sourceObject, destObject2);
		System.out.println("mapper.map(sourceObject, destObject2);");
		System.out.println(destObject2);
	}
}
