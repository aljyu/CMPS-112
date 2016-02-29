--Haskell
module Player where
import Control.Monad.State

class Character a where
	health :: a -> Int
	damage :: a -> Int -> a

data Player = Player { playerHP :: Int } deriving Show

instance Character Player where
	health = playerHP
	damage (Player hp) dmg = Player (hp - dmg)

--move :: Character a => a -> Int -> a
--move p = damage p (health )

--characterName :: String -> State Player ()
--characterName n = do
--    nVal <- get
--    put (nVal { name = n })

--playerMaxHP :: State Player Int
--playerMaxHP = get >>= return . health

--getHealth :: Player 