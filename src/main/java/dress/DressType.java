package dress;

import java.util.ArrayList;

public class DressType {
	String shirt;
	String pants;
	String cap;
	String shoes;
	
	ArrayList<String> shirtList = new ArrayList<>();
	ArrayList<String> pantsList = new ArrayList<>();
	ArrayList<String> capList = new ArrayList<>();
	ArrayList<String> shoesList = new ArrayList<>();

	public DressType selectDressType(DressType type) {
		return type.selectDressType(type);
	}
	
	public DressType selectDressName(DressType name) {
		return name.selectDressName(name);
	}

}
