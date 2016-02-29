--Haskell
module Player where
import Control.Monad.State

data Player = Player { name :: String, health :: Health } deriving Show

characterName :: String -> State Player ()
characterName n = do
    nVal <- get
    put (nVal { name = n })

playerMaxHP :: State Player Int
playerMaxHP = get >>= return . health

getHealth :: Player 