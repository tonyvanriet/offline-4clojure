;; Implement range - Easy
;; Write a function which creates a list of all integers in a given range.
;; tags - seqs:core-functions
;; restricted - range
(ns offline-4clojure.p34
  (:use clojure.test))

(def __
  (fn [start end]
    (loop [curr start
           acc []]
      (if (>= curr end)
        acc
        (recur (inc curr)
               (conj acc curr)))))

)

(defn -main []
  (are [soln] soln
(= (__ 1 4) '(1 2 3))
(= (__ -2 2) '(-2 -1 0 1))
(= (__ 5 8) '(5 6 7))
))
