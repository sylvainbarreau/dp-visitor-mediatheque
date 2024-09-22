package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
            i.accept(new VisitorItemPrinter());
	}
	
	public void printOnlyBooks() {
		/*throw new UnsupportedOperationException("Not supported yet."); 
		 
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
		for (Item i : items)
            i.accept(new VisitorItemPrinterBook());
	}

	public void printOnlyCDs() {
		/*throw new UnsupportedOperationException("Not supported yet.");
		 
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
				*/
		for (Item i : items)
            i.accept(new VisitorItemPrinterCD());
	}
				

}
