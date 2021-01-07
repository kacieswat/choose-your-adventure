package Main;

import java.util.Scanner;

public class AdventureApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("It's time to begin your Adventure!");
		System.out.println("Before your adventure starts, please tell me your name:");
		String enterYourName = scanner.nextLine();
		
		System.out.println("\n" + "Welcome, " + enterYourName + "! It's officially adventure time! Let's get on with the story..." + "\n");
		
		// Story begins: Gas station or scary mansion
		System.out.println("Your car runs out of gas on the way to your grandmother's house. You spot an abandoned-looking mansion in the distance, but it looks super creepy. What do you do, " + enterYourName + "?");
		System.out.println("A. Walk to the nearest gas station" + "\n" + "B. Take a gamble and see if someone at the mansion can help you.");
		String makeYourFirstSelection = scanner.nextLine();
		
			// 2A. Walk to the nearest gas station
			if (makeYourFirstSelection.equalsIgnoreCase("a")) {
			System.out.println("");
			System.out.println("The closest gas station is 5 miles away, and it'll take you 3 hours to get there and back! What do you do, " + enterYourName + "?");
			System.out.println("A. Make your way to the mansion after all..." + "\n" + "B. Call grandma and let her know what you are going to be extremely late.");
			String waitingGrandma = scanner.nextLine();
			
				//3A. Make your way to the mansion after all...
				System.out.println("");
				if (waitingGrandma.equalsIgnoreCase("a")) {
				System.out.println("As you approach the mansion, you can see one light flickering on the third floor. Maybe someone is home!");
				System.out.println("You walk up the creaky front steps and knock on the front door. As you knock, the front door opens slightly. What do you do, " + enterYourName + "?");	
				System.out.println("A. Make your way into the house." + "\n" + "B. Call up to the person that may be on the third floor. You don't want to be rude!");
				String enterTheHouse = scanner.nextLine();
						
						// 4A: Enter the house 
						if (enterTheHouse.equalsIgnoreCase("A")) {
						System.out.println("");
						System.out.println("You slowly enter the house and begin climbing the stairs up to the third floor.");
						System.out.println("As you enter the third floor hallway, you see a room that has a light coming from it. What do you do, " + enterYourName + "?");
						System.out.println("A. Enter the room and see if someone can help you." + "\n" + "B. Quietly head back down the stairs, leave the house, and call up to the person instead.");
						String enterTheRoom = scanner.nextLine();
							
								// 5A: Enter the room 								
								if (enterTheRoom.equalsIgnoreCase("A")) {
								System.out.println("You slowly make your way into the room, and you see a small old woman with a shotgun sitting in a chair facing the window.");
								System.out.println("The woman quickly turns around, screams, and shoots you with her shotgun. You bleed out on the floor. Try again");
								
								// 5B: Quietly head back down the stairs, leave the house, and call up to the person instead.
								} else if (enterTheRoom.equalsIgnoreCase("B")) {
								System.out.println("You back away slowly, and head back down the stairs.");
								System.out.println("As you make your way back onto the front porch, you yell up that the third floor and let them know that you're having car trouble. "
										+ "The light on the third floor goes out and after a few minutes, you hear footsteps on the other side of the door.");
								System.out.println("The door slowly opens, and a small old woaman greets you with her shotgun. What do you do, " + enterYourName + "?");
								System.out.println("A. Tell her your story, and let her know that you've run out of gas." + "\n" + "B. Run away and go to the gas station instead.");
								String talkToTheWoman = scanner.nextLine();	
								
										// 6A: Tell her your story, and let her know that you've run out of gas.
										if (talkToTheWoman.equalsIgnoreCase("A")) {
										System.out.println("");
										System.out.println("She puts her shotgun down and introduces herself. Her name is Betty, and she mentions that she hasn't had visitors in years. She says"
												+ " that she has an extra gas can in the garage that you can use so you can visit your grandma.");
										System.out.println("You fill up the tank, and promise Betty that you'll replace the gas after you visit your grandma.");
										System.out.println("\n" + "Your car is back up and running, AND you've made a new friend! You win!");
										
										// 6B: Run away and go to the gas station instead.
										} else if(talkToTheWoman.equalsIgnoreCase("B")) {
										System.out.println("You look at the old woman and then look at the shotgun and realize that maybe this was a bad idea.");
										System.out.println("You manage to say 'Nevermind!' and run away from the mansion as fast as you can.");
										
										System.out.println("/n" + "You make the 5-mile trek to and from the gas station, fill up your tank, and drive home. "
												+ "As you drive away defeated, you wonder what the interraction with the old woman would have been like. Try again.");
									}
								}
								
						// 4B: all up to the person that may be on the third floor. You don't want to be rude!
						} else if (enterTheHouse.equalsIgnoreCase("B")) {
						System.out.println("");
						System.out.println("You yell up that the third floor and let them know that you're having car trouble. The light on the third floor goes out and after a "
								+ "few minutes, you hear footsteps on the other side of the door.");
						System.out.println("The door slowly opens, and a small old woaman greets you with her shotgun. What do you do, " + enterYourName + "?");
						System.out.println("A. Tell her your story, and let her know that you've run out of gas." + "\n" + "B. Run away and go to the gas station instead.");
						String oldLadyWithAShotgun = scanner.nextLine();
						System.out.println("");
							
							// 5A: Talk to the old woman (WIN)
							if (oldLadyWithAShotgun.equalsIgnoreCase("A")) {
							System.out.println("");
							System.out.println("She puts her shotgun down and introduces herself. Her name is Betty, and she mentions that she hasn't had visitors in years. She says"
									+ " that she has an extra gas can in the garage that you can use so you can visit your grandma.");
							System.out.println("You fill up the tank, and promise Betty that you'll replace the gas after you visit your grandma.");
							System.out.println("\n" + "Your car is back up and running, AND you've made a new friend! You win!");
							
							
							// 5B: Run away and go to the gas station instead (LOSE)
							System.out.println("You look at the old woman and then look at the shotgun and realize that maybe this was a bad idea.");
							System.out.println("You manage to say 'Nevermind!' and run away from the mansion as fast as you can.");
							
							System.out.println("/n" + "You make the 5-mile trek to and from the gas station, fill up your tank, and drive home. "
									+ "As you drive away defeated, you wonder what the interraction with the old woman would have been like. Try again.");
						}	
					}
				// 3B. Call grandma and let her know what you are going to be extremely late. (LOSE)
				} else if (waitingGrandma.equalsIgnoreCase("b")) {
				System.out.println("You give your grandma the bad news, and you can tell that she is very disappointed. She had a whole day planned for the two of you, and now it's ruined!");
				System.out.println("You have disappointed grandma and are now filled with self-loathing. Try again.");
				
				}
			}
		
		// 2B: Take a gamble and see if someone at the mansion can help you.
			else if (makeYourFirstSelection.equalsIgnoreCase("B")) {
			System.out.println("");
			System.out.println("As you approach the mansion, you can see one light flickering on the third floor. Maybe someone is home!");
			System.out.println("You walk up the creaky front steps and knock on the front door. As you knock, the front door opens slightly. What do you do, " + enterYourName + "?");
			System.out.println("A. Make your way into the house and try to find someone." + "\n" + "B. Call up to the person that may be on the third floor. You don't want to be rude!");
			String enterTheHouse = scanner.nextLine();
			
				// 3A: Make your way into the house and try to find someone
				if (enterTheHouse.equalsIgnoreCase("A")) {
				System.out.println("You slowly enter the house and begin climbing the stairs up to the third floor.");
				System.out.println("As you enter the third floor hallway, you see a room that has a light coming from it. What do you do, " + enterYourName + "?");
				System.out.println("A. Enter the room and see if someone can help you." + "\n" + "B. Quietly head back down the stairs, leave the house, and call up to the person instead.");
				String enterTheRoom = scanner.nextLine();

					// 4A: Enter the room and see if someone can help you (LOSE)
					if (enterTheRoom.equalsIgnoreCase("A")) {
					System.out.println("You slowly make your way into the room, and you see a small old woman with a shotgun sitting in a chair facing the window.");
					System.out.println("The woman quickly turns around, screams, and shoots you with her shotgun. You bleed out on the floor. Try again");
					
					//4B: Quietly head back down the stairs, leave the house, and call up to the person instead.
					} else if (enterTheRoom.equalsIgnoreCase("B")) {
						System.out.println("");
						System.out.println("You back away slowly, and head back down the stairs.");
						System.out.println("As you make your way back onto the front porch, you yell up that the third floor and let them know that you're having car trouble. "
								+ "The light on the third floor goes out and after a few minutes, you hear footsteps on the other side of the door.");
						System.out.println("The door slowly opens, and a small old woman greets you with her shotgun. What do you do, " + enterYourName + "?");
						System.out.println("A. Tell her your story, and let her know that you've run out of gas." + "\n" + "B. Run away and go to the gas station instead.");
						String oldLadyWithAShotgun = scanner.nextLine();
						System.out.println("");
				
			}
				
				//3B: Call up to the person that may be on the third floor. You don't want to be rude!
				} else if (enterTheHouse.equalsIgnoreCase("B")) {
				System.out.println("You yell up that the third floor and let them know that you're having car trouble. The light on the third floor goes out and after a "
						+ "few minutes, you hear footsteps on the other side of the door.");
				System.out.println("The door slowly opens, and a small old woman greets you with her shotgun. What do you do, " + enterYourName + "?");
				System.out.println("A. Tell her your story, and let her know that you've run out of gas." + "\n" + "B. Run away and go to the gas station instead.");
				String oldLadyWithAShotgun = scanner.nextLine();
				System.out.println("");
				
					// 4A: Talk to the old woman (WIN)
					if (oldLadyWithAShotgun.equalsIgnoreCase("A")) {
					System.out.println("She puts her shotgun down and introduces herself. Her name is Betty, and she mentions that she hasn't had visitors in years. She says"
						+ " that she has an extra gas can in the garage that you can use so you can visit your grandma.");
					System.out.println("You fill up the tank, and promise Betty that you'll replace the gas after you visit your grandma.");
					System.out.println("\n" + "Your car is back up and running, AND you've made a new friend! You win!");
				
					// 3B: Run away like a baby (LOSE)
					} else if (oldLadyWithAShotgun.equalsIgnoreCase("B")) {
					System.out.println("You look at the old woman and then look at the shotgun and realize that maybe this was a bad idea.");
					System.out.println("You manage to say 'Nevermind!' and run away from the mansion as fast as you can.");
					
					System.out.println("/n" + "You make the 5-mile trek to and from the gas station, fill up your tank, and drive home. "
							+ "As you drive away defeated, you wonder what the interraction with the old woman would have been like. Try again.");
				
				}
			}
		}
	}

}
