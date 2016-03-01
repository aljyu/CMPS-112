module Main where
import Player


main = do  
	putStrLn("Welcome to [the game]!")
	putStrLn("What is your name?")
	n <- getLine
	putStrLn("\nHello " ++ n ++ "!\n")
	 
	--player function (set name, ...)
	--player 
	let player = Player 100 10
	putStrLn("You currently have [current HP] and [current potions].")
	putStrLn("If you wish to view these stats during any point of the game, type in \"Status\".")

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
	goToOptions1
	--LOOP1
	--x <- getLine
	--stat x
	--check if input calls status

-- options for first choices
goToOptions1 = do
   putStrLn "\"Alright\" you think to yourself \"Where should I check out first? Should I CHECK OUT THE KITCHEN, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD?\""
   input <- getLine
   if input == "KITCHEN"
     then do putStrLn "\nYou walk into the kitchen.\n\"Alright\" you think to yourself \"Do I want to LOOK INSIDE THE SINK, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD"
             goToKitchen
     else if input == "DOG HOUSE"
            then do putStrLn "DOG HOUSE TEXT"
                    goToDogHouse 
            else if input == "BACKYARD"
            	   then do putStrLn "CHECK OUT THE BACKYARD TEXT"
            	           goToKitchen
            	    else do putStrLn "Command not recognized. Please try again.\n"
            	            goToOptions1

-- otions if you go to the kitchen
goToKitchen = do
   putStrLn "\nYou walk into the kitchen.\n\"Alright\" you think to yourself \"Do I want to LOOK INSIDE THE SINK, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD"
   input <- getLine
   if input == "LOOK INSIDE THE SINK"
     then do putStrLn ">>> look inside the sink <<"
             goToSink
     else if input == "CHECK OUT THE DOG HOUSE"
            then do putStrLn "DOG HOUSE TEXT"
                    goToDogHouse 
            else if input == "CHECK OUT THE BACKYARD"
            	   then do putStrLn "CHECK OUT THE BACKYARD TEXT"
            	           goToBackyard
            	    else do putStrLn "Command not recognized. Please try again.\n"
            	            goToKitchen --loop back to fuction



	--	let move1 = move player
	--getLine


	--check if input calls status
	--if (input == "TAKE THE ITEM" ) then currentHP - 5
		-- if current HP <= 0 then gamestat false		
	--putStrLn("You remove the item from Blue's mouth only to find out that it is an old tennis ball.\n")
	--putStrLn("Do you want to CHECK OUT THE KITCHEN or CHECK OUT THE BACKYARD?")

	--check if input calls status
	--if (input == "CHECK OUT THE KITCHEN " ) then currentHP - 5
		-- if current HP <= 0 then gamestat false		
	--putStrLn("\nYou walk into the kitchen.\n\"Alright\" you think to yourself \"Do I want to LOOK INSIDE THE SINK, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD")

	--check if input calls status
	--if (input == "LOOK INSIDE THE SINK " ) then currentHP - 5
		-- if current HP <= 0 then gamestat false			

	--putStrLn("\nYou look over to your sink and find a bunch of dirty dishes. \"I should've cleaned those hours ago...\" you think to yourself")
	--putStrLn("\"Do I want to CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD\"?\n")

	--check if input calls status
	--if (input == "LOOK INSIDE THE SINK " ) then currentHP - 5
		-- if current HP <= 0 then gamestat false	

	--break LOOP1
	--else 
		--if (input == "LOOK INSIDE THE SINK " ) then currentHP - 5
		-- if current HP <= 0 then gamestat false