  
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
 
import javax.swing.JLabel;


public class Main extends JFrame
	{
	static String name; 
	static int className;
	static int question;
	static JFrame frame = new JFrame();

	
	

	public static void main(String[] args)
	    {
//	    //takes input
 


			JOptionPane.showMessageDialog(
					frame, 
					"Thank Goodness you're here detective! \n We are in great need of your expertise since we've reached a dead end in this homocide case.");
			Object[] comitment = {"YES", "NO"};
			question = JOptionPane.showOptionDialog(
					frame,
	    			"Will you help us solve this mystery?",
					"Your Decision ",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					comitment, 
					comitment[0]);  //makes third option the default);

			switch(question)
			{
				case 0:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"Ok let's get started!");
					break;}
				case 1:
						{
							JOptionPane.showMessageDialog(
									frame, 
									"Too bad, it's your job and the Presidents orders, so get to work!");
							break;}
			}
			
			Object[] StepOne = {"Interview the Woman", "Keep walking"};
			question = JOptionPane.showOptionDialog(
					frame,
	    			"As you take a stroll downtown you read through your new case file. The file details how a local bartender, Jeremiah Howell, was murdered about a month ago. His body was found in the Swanson River with glass shards found in his head. \n As your walking you notice a young woman staring at you through her window shades. Would you like to interview her?",
					"Interview the Woman",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					StepOne, 
					StepOne[0]);  //makes third option the default);

			switch(question)
			{
				case 0:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"You knock on the womans door. She opens it and immediatly invites you inside. Over tea, she tells you her name is Ms. Virginia Shaw. \n She is unmarried and lives a simplistic life. She tells you she never new 'Sad Jerry' because he was a bartender and she doesn't drink. You leave her house empty-handed.");
					break;}
				case 1:
						{
							JOptionPane.showMessageDialog(
									frame, 
									"You keep walking, a curious woman is nothing more than a waste of time!");
							break;}
			}
			
			Object[] StepTwo = {"Interview the Gangsters", "Keep looking around the Hangout"};
			question = JOptionPane.showOptionDialog(
					frame,
	    			"Next, you venture to the back room of a diner, which is a known hangout spot for local gangsters.",
					"Interview the Gangsters",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					StepTwo, 
					StepTwo[0]);  //makes third option the default);

			switch(question)
			{
				case 0:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"When you mention Jerry's name to the first two gangsters you see, they scowl and refuse to answer any questions.");
					break;}
				case 1:
						{
							JOptionPane.showMessageDialog(
									frame, 
									"You keep walking, a curious woman is nothing more than a waste of time!");
							break;}
			}
	    

Object[] StepThree = {"Interview the Betting Gangster", "Leave the Hangout"};
question = JOptionPane.showOptionDialog(
		frame,
		"You make eye contact with a scary gangster betting at a table.",
		"Interview the Betting Gangster",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null, 
		StepThree, 
		StepThree[0]);  //makes third option the default);

switch(question)
{
	case 0:
			{
    	JOptionPane.showMessageDialog(
				frame, 
				"You ask the betting gangster for a minute of his time. \"Sad Jerry owed me $20 for a bet he lost, but that doesn't mean I killed the guy.\" You show yourself out.");
		break;}
	case 1:
			{
				JOptionPane.showMessageDialog(
						frame, 
						"You leave the hangout without any info.");
				break;}
}
Object[] StepFour = {"Go Undercover as a Waiter", "Go Undercover as a New Gangster in Town"};
question = JOptionPane.showOptionDialog(
		frame,
		"You plan to go to the SpeakEasy that Jerry worked at that night. What do you go undercover as?",
		"Listen in on two women talking",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null, 
		StepFour, 
		StepFour[0]);  //makes third option the default);

switch(question)
{
	case 0:
			{
				Object[] StepFive = {"Listen in on the Conversation", "Mind your own business"};
				question = JOptionPane.showOptionDialog(
						frame,
						"That night undercover you see two flapper girls talking. You walk over and offer them martinis on the house. While you're setting up their table you hear Jerry's name come up. ",
						"Listen in on two women talking",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, 
						StepFive, 
						StepFive[0]);  //makes third option the default);

				switch(question)
				{
					case 0:
							{
				    	JOptionPane.showMessageDialog(
								frame, 
								" One woman says, \" I hear Jerry and the trumpet player, Sid Sawyer, got into a brawl last night, before he disappeared.\" ");
						break;}
					case 1:
							{
								JOptionPane.showMessageDialog(
										frame, 
										"You leave their table and start listening the beautiful jazz music playing.");
								break;}
				}		break;}
	case 1:
			{
				JOptionPane.showMessageDialog(
						frame, 
						"You enter the hangout that night. Many eyes turn towards you and your expensive taste. You sit down at the bar and tap your fingers to the beat of the jazz music playing.");
				break;}
}
JOptionPane.showMessageDialog(
		frame, 
		"The beautiful jazz singer belts her lyrics out, \"I loved you, baby / You stopped lovin' me / I had to do it / Don't you see?\" ");

Object[] StepSeven = {"Walk over and greet the woman, her hair looks familiar", "Leave the Hangout"};
question = JOptionPane.showOptionDialog(
		frame,
		"You notice a woman lounging in the corner.",
		"Interview the Betting Gangster",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null, 
		StepSeven, 
		StepSeven[0]);  //makes third option the default);

switch(question)
{
	case 0:
			{
    	JOptionPane.showMessageDialog(
				frame, 
				"You tap on the womans shoulder...It's Virginia Shaw holding a glass of wine! \n She panics and confesses that she does go to the Speak Easy and she drinks. She explains that she only lied because she was scared but that she never said anything more to Jerry than her drink order.");
		break;}
	case 1:
			{
				JOptionPane.showMessageDialog(
						frame, 
						"You leave the hangout without any info.");
				break;}
}

Object[] StepEight = {"Talk to the actress", "Ignore her, she just wants the fame"};
question = JOptionPane.showOptionDialog(
		frame,
		"Your assistant tell you there is a wanna-be actress at her desk claiming to have a tip on the case.",
		"Interview the Actress",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null, 
		StepEight, 
		StepEight[0]);  //makes third option the default);

switch(question)
{
	case 0:
			{
 		
    	Object[] StepNine = {"Follow the tip and go to Hyde Manor", "Ignore the Tip"};
    	question = JOptionPane.showOptionDialog(
    			frame,
    			"The actress introduces herself as Christie Johnson. She tells you, \"I go to the speakeasy sometimes when I have the money, so I've seen Jerry before. About a week ago,\" she says, \"I saw Jerry driving up to the old Hyde Manor. \n I remember, because I hear they almost never have visitors there. Rumor is he was sellin them his world famous moonshine.\\\"",
    			"Follow the tip",
    			JOptionPane.YES_NO_CANCEL_OPTION,
    			JOptionPane.QUESTION_MESSAGE,
    			null, 
    			StepNine, 
    			StepNine[0]);  //makes third option the default);

    	switch(question)
    	{
    		case 0:
    				{    	
    		    	Object[] StepTen = {"Talk to Janet", "Don't put her through that"};
    		    	question = JOptionPane.showOptionDialog(
    		    			frame,
    		    			"You follow the tip and go to Hyde Manor. There you meet the newly widowed Janet Cross. A few months ago Janets second husband was found in a river, she was heartbroken. You are weary to bring up another death to her and question her about Jerry.",
    		    			"Talk to Janet",
    		    			JOptionPane.YES_NO_CANCEL_OPTION,
    		    			JOptionPane.QUESTION_MESSAGE,
    		    			null, 
    		    			StepTen, 
    		    			StepTen[0]);  //makes third option the default);

    		    	switch(question)
    		    	{
    		    		case 0:
    		    				{
    		    	    	JOptionPane.showMessageDialog(
    		    					frame, 
    		    					"You ask Janet about the case. She's in great spirits. \"Yes, Jerry visited. He was such a doll, so handsome. I tried to get him to stay, but he seemed...distracted. Such a shame! So handsome.\"");     	    	
    		    	    	JOptionPane.showMessageDialog(
    		    	    			frame, 
    		    	    			"As you leave the manor you see two maids vigorously cleaning up a broken vase on the floor. \n You offer to help but as soon as they see your badge they refuse and hurry you out the door. ");
    		    	    	finale();
    		    	    	break;}
    		    				
    		    		case 1:
    		    				{
    		    					JOptionPane.showMessageDialog(
    		    							frame, 
    		    							"You leave the manor and soon you reach a dead end in the case.");
    		    					break;}
    		    	}
        	    	break;}

    		case 1:
    				{
    					JOptionPane.showMessageDialog(
    							frame, 
    							"You don't go to Hyde Manor and reach a dead end in the case.Somewhere along the line you must have made a wrong choice!.");
    					break;}
    	}
    	break;}
	case 1:
			{
				JOptionPane.showMessageDialog(
						frame, 
						"The actress leaves angry she didn't get to talk to you and you soon reach a dead end in the case. Somewhere along the line you must have made a wrong choice!");
				break;}
}

}
	public static void finale()
		{
			Object[] StepThree = {"Virginia Shaw", "The Gangsters", "Verna Leach, the jazz singer", "Christie Johnson, the actress", "Janet Cross, the widow", "The maids"};
			question = JOptionPane.showOptionDialog(
					frame,
					"You have to make a final decision! Who killed Jerry?",
					"Your Final Answer",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					StepThree, 
					StepThree[0]);  //makes third option the default);

			switch(question)
			{
				case 0:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"You tell the officials your vinal verdict and....you imprison an innocent! You got the case wrong!");
					break;}
				case 1:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"You tell the officials your vinal verdict and....you imprison an innocent! You got the case wrong!");
					break;}
				case 2:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"You tell the officials your vinal verdict and....you imprison an innocent! You got the case wrong!");
					break;}
				case 3:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"You tell the officials your vinal verdict and....you imprison an innocent! You got the case wrong!");
					break;}
				case 4:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							
			    			"You tell the officials your vinal verdict and....you imprison Janet Cross, the murderer! /n She killed her past two husbands and threw their bodies in the river, just like she did to Jerry, after being intoxicated by his moonshine, when he rejected her pass at him because he was in love with Verna the Jazz singer who recently dumped him. The nurses were cleaning up the glass pieces of the vase that Janet used to kill Jerry, that's why there were shards of glass in his head.");
			    	JOptionPane.showMessageDialog(
							frame, 
							"Thank you for your help, detective. We couldn't have caught Janet Cross and prevented her from taking more lives without you!");
			    	break;}
				case 5:
						{
			    	JOptionPane.showMessageDialog(
							frame, 
							"You tell the officials your vinal verdict and....you imprison an innocent! You got the case wrong!");
					break;}

			}
		}
	}

			



