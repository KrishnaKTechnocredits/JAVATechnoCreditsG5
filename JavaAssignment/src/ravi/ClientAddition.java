package ravi;

//Client for class Addition
public class ClientAddition {
	
		public static void main(String[] args) {
			Addition object=new Addition();
			object.add(10, 20);							//different method call to add integer,decimal,string
			object.add(10.0f, 20.0f);
			object.add("Ravi","Sawarker");
		}
}
