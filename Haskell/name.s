askUserForName :: IO Name
askUserForName
   = do putStr "What's your name? (10 chars max)  "
        s <- getLine
        case nameFromString s of
            Just n  -> return n
            Nothing -> askUserForName