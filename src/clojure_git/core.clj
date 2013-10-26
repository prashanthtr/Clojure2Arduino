(ns clojure-git.core)


(ns bars
  (:use [c2.core :only [unify]])
  (:require [c2.scale :as scale]))

(let [width 500, bar-height 20
      data {"A" 1, "B" 2, "C" 4, "D" 3}
      s (scale/linear :domain [0 (apply max (vals data))]
                      :range [0 width])]

  [:div#bars
   (unify data (fn [[label val]]
                 [:div {:style {:height bar-height
                                :width (s val)
                                :background-color "gray"}}
                  [:span {:style {:color "white"}} label]]))])(ns bars
  (:use [c2.core :only [unify]])
  (:require [c2.scale :as scale]))

(let [width 500, bar-height 20
      data {"A" 1, "B" 2, "C" 4, "D" 3}
      s (scale/linear :domain [0 (apply max (vals data))]
                      :range [0 width])]

  [:div#bars
   (unify data (fn [[label val]]
                 [:div {:style {:height bar-height
                                :width (s val)
                                :background-color "gray"}}
                  [:span {:style {:color "white"}} label]]))])

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World here in the whole world!"))

(defn printlist [list]

  (set [list '(1 2 3 4)]

       (println list)

       )

  )

(use 'clodiuno.core 'clodiuno.firmata)

(def board (arduino :firmata "/dev/tty.usbmodemfd121"))
(pin-mode board 13 OUTPUT)

(digital-write board 13 HIGH)
(digital-write board 13 LOW)
