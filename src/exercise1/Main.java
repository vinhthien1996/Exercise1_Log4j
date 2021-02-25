package exercise1;

import org.apache.log4j.Logger;

public class Main {
	
	static Logger log = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		Menu menu = new Menu();

		while (true) {
			int choose = menu.getMenu();

			switch (choose) {
				// ADD STUDENT
				case 1: {
					while (true) {
						boolean rsMenu;
						rsMenu = menu.addStudent();
						
						// LOG4J LOG INFO REQUEST
						log.info("Add user");
	
						if (!rsMenu)
							break;
					}
					break;
				}
	
				// SHOW STUDENT
				case 2: {
					menu.showListStudent();

					// LOG4J LOG INFO REQUEST
					log.info("Show list user");
					
					break;
				}
	
				// FIND STUDENT
				case 3: {
					menu.menuFind();
					
					// LOG4J LOG INFO REQUEST
					log.info("Find user");
					
					break;
				}
			}
		}
	}

	public Main() {
		super();
	}

}