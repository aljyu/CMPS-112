
data Player = ∀ m. Player 
	{
	 name :: String, 
	 health :: Health
	}


type Name = String
type Health = Int


instance Show Player where 
	show (Player {playerName = name}) - show name

main = do
	putStrLn("Welcome to [the game]!")
	putStrLn("What is your name?")
	name <- getLine
	putStrLn("\nHello " ++ name ++ "!")
	(name, 100) <- player
