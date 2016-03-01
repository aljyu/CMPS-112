module Player
(
  Player(..)
  ,move
  ,hit
  ,drink
) where

data Player = Player{hp :: Int, potions :: Int} deriving (Show,Eq)

move::Player->Player
move hero  = Player ((hp hero) - 5) (potions hero)

hit::Player->Player
hit hero  = Player ((hp hero) - 20) (potions hero)

drink::Player->Player
drink hero  = Player ((hp hero) + 20) (potions hero)



