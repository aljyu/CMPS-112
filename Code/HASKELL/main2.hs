module Main where
import Player

-- fuction for printing out status
status :: Player -> IO() 
status (Player {hp = h, potions = p}) = print ("Player has " ++ (show h) ++ " HP and " ++ (show p) ++ " potions" ) 

-- global player object
player = Player 100 0

main = do  
  putStrLn("Welcome to EK4!")
  putStrLn("What is your name?")
  n <- getLine
  putStrLn("\nHello " ++ n ++ "!\n")
   
  --player 
  --putStrLn $ status player 
  putStrLn "If you wish to view these stats during any point of the game, type in \"STATUS\"." 
  putStrLn("If you wish to drink a potion, first type in Status and follow the instructions given.")
  putStrLn("In this game, every time you perform an action you will lose HP. When your HP hits 0, you will die and the game will end.")
  putStrLn("Now, let's begin...")

  --if (stat True) then 

  putStrLn("--------------------------------------------------------------------------------------------------------------------------------------------")
  putStrLn("                                                                Level 1");
  putStrLn("--------------------------------------------------------------------------------------------------------------------------------------------")

  putStrLn("ZZZzzz...\nYou are sleeping peacefully, dreaming of summer vacation, when suddenly you are awakened by a bright, annoying light flashing through the window, directly at your face.")
  putStrLn("\"Why is it so bright...?!\" you gripe as you pull your covers over your head, trying to ignore the light and fall back asleep.")
  putStrLn("However, your attempts turn out to be futile as you begin to hear a series of high-pitched noises.")
  putStrLn("You decide that you've had enough and get out of bed to check the window for the source of the disturbance, only to realize that the light shining through your window is making it too bright to see anything outside.")
  putStrLn("As you stand next to your window clad only in your PJs wondering what you should do, the high-pitched noises begin to fade as you hear a voice.")
  putStrLn("\"" ++ n ++ "\" a soft, gentle voice calls out.")
  putStrLn("You look around, trying to pinpoint the location of the voice.")
  putStrLn("\"This voice is hauntingly beautiful... and... familiar...?\" you think as you being to feel compelled to track down its owner.")
  putStrLn("As you begin to walk out of your room, the light behind you begins to slowly fade away.\n")
  --let player2 = move player 

--LOOP1
  goToOptions1
  --x <- getLine
  --stat x
  --check if input calls status

-- options for first choices
goToOptions1 = do
     putStrLn "\"Alright\" you think to yourself \"Where should I check out first? Should I check out the KITCHEN, check out the HOUSE, or check out the BACKYARD?\""
     input <- getLine
     let player = move player
     if input == "KITCHEN" --1
       then do goToKitchen
       else if input == "DOG HOUSE" --1 --2
              then do goToDogHouse 
              else if input == "BACKYARD" --2 --3
                   then do goToBackyard
                   else if input == "status" --3 --4
                      then do (status player) --if status is called error: *** Exception: <<loop>>
                      else do putStrLn "Command not recognized. Please try again.\n" --4
                              goToOptions1

-- otions if you go to the kitchen
goToKitchen = do
   putStrLn "\nYou walk into the kitchen.\n\"Alright\" you think to yourself \"Do I want to LOOK INSIDE THE SINK, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD"
   input <- getLine
   if input == "LOOK INSIDE THE SINK" --1
     then do putStrLn ">>> look inside the sink <<"
             goToSink
     else if input == "CHECK OUT THE DOG HOUSE" --1 --2
            then do putStrLn "DOG HOUSE TEXT"
                    goToDogHouse 
            else if input == "CHECK OUT THE BACKYARD" --2 --3
                 then do putStrLn "CHECK OUT THE BACKYARD TEXT"
                         goToBackyard
                  else do putStrLn "Command not recognized. Please try again.\n" --3
                          goToKitchen --loop back to fuction
                          --needs status

goToSink = do
   putStrLn "\nYou look over to your sink and find a bunch of dirty dishes. \"I should've cleaned those hours ago...\" you think to yourself"
   putStrLn "\"Do I want to check out the DOG HOUSE, or check out the BACKYARD\"?\n"      
   input <- getLine
   if input == "DOG HOUSE" --1
     then do goToDogHouse
     else if input == "BACKYARD" --1 --2
            then do goToBackyard
            else if input == "STATUS" --2 --3
                 then do (status player)
                         goToSink
                  else do putStrLn "Command not recognized. Please try again.\n" --3
                          goToSink 

-- deciding to go to the doghouse
goToDogHouse = do
   putStrLn "\n\"Blue?\" you call out as you walk out the front door towards the dog house."
   putStrLn "You hear your dog, Blue, trotting towards you with something in his mouth."
   putStrLn "\"Should I take the ITEM, check out the KITCHEN, or check out the BACKYARD?\" you wonder to yourself as you absent-mindedly pet Blue on the head."
   input <- getLine
   if input == "ITEM"
     then do goToKitchen
     else if input == "KITCHEN"
            then do goToKitchen 
            else if input == "BACKYARD"
                 then do goToBackyard
                  else do putStrLn "Command not recognized. Please try again.\n"
                          goToDogHouse

-- deciding to go to the backyard   
goToBackyard = do
   putStrLn "\nYou walk outside to the backyard where you are immediately caught in a tractor beam."
   putStrLn "Your thoughts immediately go into overdrive mode, debating whether it would be better to STRUGGLE against the beam or just COMPLY."
   input <- getLine
   if input == "STRUGGLE"
     then do putStrLn "Your struggles are useless as you feel yourself being beamed up and everything fades to black."
             goToLevel2
     else if input == "COMPLY"
            then do putStrLn "You relax your body and as you feel yourself being beamed up, everything fades to black."
                    goToLevel2
             else do putStrLn "Command not recognized. Please try again.\n"
                     goToDogHouse --gotoBACKYARD
                     --needs status
      
goToLevel2 = do 
  putStrLn "\nYou walk outside to the backyard where you are immediately caught in a tractor beam."
  goToLevel3
  

goToLevel3 = do
	putStrLn("\n--------------------------------------------------------------------------------------------------------------------------------------------")
	putStrLn("                                                                Level 3")
	putStrLn("--------------------------------------------------------------------------------------------------------------------------------------------")
	goToOptions3

goToOptions3 = do
	putStrLn("\nYou find yourself in a long hallway. There is a guard standing near a door who seems like he is dozing off. \"That room must be important if it has a guard in front of it...\" you think to yourself as you approach it.")
	putStrLn "Do you want to SCREAM and hope that the loud noise wakes you up from what are hoping is a dream, SURPRISE ATTACK the guard in hopes that your attack will render them unconscious, or SNEAK INSIDE the room?"
	input <- getLine
	if input == "SCREAM"
		then do putStrLn "\nThe guard wakes up with a jolt and attacks you. You are quickly overpowered by the guard who proceeds to eleminate the threat, you."
	    		gameOverFail
	    		else if input == "ATTACK"
	    			then do 
	    				putStrLn "\nYou quietly sneak over to the guard and whack them over their head with both hands as hard as you can, hoping that it is enough to render them unconscious. With a groan, the guard slumps down onto the floor."
	    				goToGuard
							else if input == "SNEAK INSIDE"
								then do 
									putStrLn "\nYou quietly sneak around the guard and reach your hand out for the door handle. You carefully turn the handle and open the door, only to realize that doing so has created a loud noise.\nThe guard's eyes quickly shoot open and sees you right away. You are quickly overpowered by the guard who proceeds to eleminate the threat, you."
									gameOverFail
	    								else if input == "STATUS"
	    									then do (status player)
	    									else do 
	    										putStrLn "Command not recognized. Please try again.\n"
	    										goToOptions3

goToGuard = do
	putStrLn"You sigh in relief and stare down at the guard. You can see something sticking out of their pocket and debate whether or not you want to grab the ITEM or JUST LEAVE."
	putStrLn"You can see the guard beginning to stir and quickly decide that you want to..."
	input <- getLine
	if input == "ITEM" 
		then do 
			putStrLn "\nYou quickly bend over to grab the item from the guard's pocket. However, upon doing so, your hand brushes against their armor and you feel a jolt of electricity passing throughout your body.\nYou cry out from the excruciating pain despite your best efforts not to as you stagger through the door to the next room.\nYou let out a whimper as you lean against the door and you swear that you can feel your body getting weaker by the second.\nWhat feels like hours pass before you feel well enough to get up and move around again. You take this chance to study your surroundings and notice that you are in a large room containing a huge holographic picture of Earth being projected above a white, circular table.\nYou quickly snap out of your awestruck state as you hear footsteps and what sounds like voices getting closer to the room. You panic as you quickly hide behind the table. You rack your brains thinking of what the best course of action is. You see a flashing red BUTTON on the control panel in front of you, a GUN next to you, and a DESK behind you. The door to the room slides open as you dive for the..."
			goToDeath
		else if input == "JUST LEAVE"
			then do 
				putStrLn "\nYou find yourself in a large room containing a huge holographic picture of Earth being projected above a white, circular table.\nYou quickly snap out of your awestruck state as you hear footsteps and what sounds like voices getting closer to the room. You panic as you quickly hide behind the table. You rack your brains thinking of what the best course of action is. You see a flashing red BUTTON on the control panel in front of you, a GUN next to you, and a DESK behind you. The door to the room slides open as you dive for the..."
				goToDeath
				else if input == "STATUS"
					then do (status player)
						else do putStrLn "Command not recognized. Please try again.\n"
	    						goToGuard

goToDeath = do
	input <-  getLine
	if input == "BUTTON"
		then do 
			putStrLn "\nYour hand slaps the button right as the alien guards burst through the door. You are quickly subdued by the guards as the ship begins to give off a piercing noise.\nYou have activated attack mode! The giant lasers in front of the ship begin to power up, gathering dark energy.\nYou watch helplessly, unable to do anything, as the ship's lasers finish powering up and a shot of pure, black energy is shot towards Earth, tearing a hole through the middle of the planet."
			putStrLn "You let out an inhumane scream filled with pain, loss, and regret as you realize that you just killed everyone you cared about. You struggle against your captors, screaming out profanity after profanity, swearing to kill them before you hit the floor. Hard."
			putStrLn "\nTHUMP! Your eyes shoot open and you find yourself face to face with... your bed...? You look down at yourself and realize that you are on the floor with your legs tangled in your blankets. You let out a sigh of relief as you realize that you must have been having a nightmare. You untangle your legs from your blankets and get back into bed, relieved that it was all a dream..."
			gameOverWin 
		else if input == "GUN"
			then do 
				putStrLn "\nYour hand closes around the butt of the gun right as the alien guards burst through the door. You quickly raise your arms and point the gun at the guards and press the trigger, effectively blowing yourself backwards against the wall due to the sheer force of the recoil. As you are tackled by the guards, you notice with satisfaction that at the very least the blast from your gun has taken out one of them."
				putStrLn "You laugh and give out a victory shout before you are spun around and a fist meets your face. You grunt in pain as you hit the floor and are met with a kick to the stomach. The aliens seem to be pissed as they take turns punching and kicking you as you curl up into a ball in an attempt to try to protect yourself. The attacks stop and you look up to see a boot coming right at your face. You quickly squeeze your eyes shut right before it makes contact with your face and you feel your body flying through the air before hitting the wall behind you. Hard."
				putStrLn "\nTHUMP! Your eyes shoot open and you find yourself face to face with... your bed...? You look down at yourself and realize that you are on the floor with your legs tangled in your blankets. You let out a sigh of relief as you realize that you must have been having a nightmare. You untangle your legs from your blankets and get back into bed, relieved that it was all a dream..."
				gameOverWin
				else if input == "DESK"
					then do
						putStrLn "\nYou manage to hide next to a desk right as the aliens burst through the door. You shut your eyes and desperately hope that you won't be found. However, your hope fades as you are grabbed by the neck and roughly hauled to your feet. You open your eyes and are met with a fist flying at your face. You quickly squeeze your eyes shut before it makes contact with your face and you feel yourself falling onto the floor."
						putStrLn "\nTHUMP! Your eyes shoot open and you find yourself face to face with... your bed...? You look down at yourself and realize that you are on the floor with your legs tangled in your blankets. You let out a sigh of relief as you realize that you must have been having a nightmare. You untangle your legs from your blankets and get back into bed, relieved that it was all a dream..."
						else if input == "STATUS"
							then do (status player)
							 	else do putStrLn "Command not recognized. Please try again.\n"
	    								goToDeath

gameOverFail = do
	putStrLn "You ran out of HP. Better luck next time!\nGAME OVER!"
gameOverWin = do
	putStrLn "You did it! You managed to survive!\nAchievement Unlocked!\nSURVIVOR"
