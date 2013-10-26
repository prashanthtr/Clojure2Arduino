(ns clojure-git.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World here in the whole world!"))

(defn printlist [list]

  (set [list '(1 2 3 4)]

       (println list (map list inc))

       )

  )
