;; Get the Caps - Easy
;; Write a function which takes a string and returns a new string containing only the capital letters.
;; tags - strings
;; restricted -
(ns offline-4clojure.p29
  (:use clojure.test))

(def __
  (fn [input]
    (->> (re-seq #"[A-Z]+" input)
         (apply str)))
)

(defn -main []
  (are [soln] soln
(= (__ "HeLlO, WoRlD!") "HLOWRD")
(empty? (__ "nothing"))
(= (__ "$#A(*&987Zf") "AZ")
))
