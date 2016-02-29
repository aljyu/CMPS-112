module Main where
import Player


--class Status a where
--	stat :: a -> String

--instance  Status Char where
--	stat _ =  "Would you like to drink a potion? YES or NO?"
	

main = do  
	putStrLn("Welcome to [the game]!")
	putStrLn("What is your name?")
	n <- getLine
	putStrLn("\nHello " ++ n ++ "!")
	 
	--player function (set name, ...)
	let player = Player 100 10
	putStrLn("You currently have [current HP] and [current potions].")
	putStrLn("If you wish to view these stats during any point of the game, type in \"Status\".");

	putStrLn("If you wish to drink a potion, first type in \"Status\" and follow the instructions given.")
	putStrLn("In this game, every time you perform an action you will lose HP. When your HP hits 0, you will die and the game will end.")
	putStrLn("\nNow, let's begin...\n")

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
	putStrLn("\"Alright\" you think to yourself \"Where should I check out first? Should I CHECK OUT THE KITCHEN, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD?\"")

	
	--x <- getLine
	--stat x
	--check if input calls status
	--LOOP1
	input <- getLine
	--let inp = read input :: String
	if (input == "DOG HOUSE" ) 
		then do
		--move1 = move player 
		-- if current HP <= 0 then gamestat false
		putStrLn("\n\"Blue?\" you call out as you walk out the front door towards the dog house.");
		putStrLn("You hear your dog, Blue, trotting towards you with something in his mouth.");
		putStrLn("\"Should I take the ITEM, CHECK OUT THE KITCHEN, or CHECK OUT THE BACKYARD?\" you wonder to yourself as you absent-mindedly pet Blue on the head.");
		input <- getLine
	--check if input calls status
		if (input == "ITEM" ) 
			then do
			--if current HP <= 0 then gamestat false		
			putStrLn("You remove the item from Blue's mouth.\nYOU HAVE OBTAINED A POTION!")
			--potions++
		else do
			putStrLn "You remove the item from Blue's mouth only to find out that it is an old tennis ball.\n"
			
		putStrLn "Do you want to check out the KITCHEN or check out the BACKYARD?"
		input <- getLine
			--check if input calls status
		if (input == "KITCHEN" )
			then do 
			-- if current HP <= 0 then gamestat false		
			putStrLn("\nYou walk into the kitchen.\n\"Alright\" you think to yourself \"Do I want to LOOK INSIDE THE SINK, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD");
			input <- getLine

			--check if input calls status
			if (input == "SINK" ) 
				then do
				--if current HP <= 0 then gamestat false		
				putStrLn "\nYou look over to your sink and find a bunch of dirty dishes. \"I should've cleaned those hours ago...\" you think to yourself"
				putStrLn "\"Do I want to check out the DOG HOUSE, or check out the BACKYARD\"?\n"
				-- if current HP <= 0 then gamestat false			
				--input <- getLine

			else putStrLn ""
		else do 	
			putStrLn "\nYou walk outside to the backyard where you are immediately caught in a tractor beam."
			putStrLn "Your thoughts immediately go into overdrive mode, debating whether it would be better to STRUGGLE against the beam or just COMPLY."
			--input <- getLine
	
		else putStrLn ""