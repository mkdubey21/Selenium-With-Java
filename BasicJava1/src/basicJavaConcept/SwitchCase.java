package basicJavaConcept;

public class SwitchCase {
	
	public static void main(String [] args){
		int p_age = 1;
		String TicketType;

		//if else
		switch(p_age){
		case 1: //1-5
			TicketType = "Enjoy the Free Rides";
			break;
			
		case 2: //6-15
			TicketType = "You are Child, You will get the CHILD concession";
			break;
			
		case 3:// 16-59:
			TicketType = "Hey, You are Young, NO Concession Please";
			break;
			
		case 4: //60-99;
			TicketType = "Wait, You will get the Concession Please";
			break;
			
		default:
			TicketType = "Sorry, Invalid Input";
			break;
		}
			System.out.println(TicketType);
		}
	}
