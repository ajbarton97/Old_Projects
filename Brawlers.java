package server.model.players.content;

import server.model.players.Client;

/**
 * @author Austin.
 */

public class Brawlers {

	private final Client c;

	int[][] GLOVES_SKILLS = 
		{{13855, 13}, {13848, 5}, {13857, 7},
		{13856, 10}, {13854, 17}, {13853, 21},
		{13852, 14}, {13851, 11}, {13850, 8}};

	public Brawlers(final Client client) {
		super();
		this.c = client;
	}

	public void handleExperienceGain(int skill, int amount) {
		for (int i = 0; i < GLOVES_SKILLS.length; i++) {
			if ((c.playerEquipment[c.playerHands] == GLOVES_SKILLS[i][0]) && (skill == GLOVES_SKILLS[i][1]))
				c.getPA().addSkillXP(amount = (amount * 3), i);
		}
	}
}

//Should have made this static to begin with.

/*
package server.model.players.content;

import server.model.players.Client;

public class Brawlers {

	private static int[][] GLOVES_SKILLS = 
		{{13855, 13}, {13848, 5}, {13857, 7},
		{13856, 10}, {13854, 17}, {13853, 21},
		{13852, 14}, {13851, 11}, {13850, 8}};

	public static void handleExperienceGain(Client c, int skill, int amount) {
		for (int i = 0; i < GLOVES_SKILLS.length; i++) {
			if ((c.playerEquipment[c.playerHands] == GLOVES_SKILLS[i][0]) && (skill == GLOVES_SKILLS[i][1]))
				c.getPA().addSkillXP(amount = (amount * 3), i);
		}
	}
}
*/
