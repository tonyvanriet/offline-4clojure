;; Prime Numbers - Medium
;; Write a function which returns the first x
;;number of prime numbers.
;; tags - primes
;; restricted - 
(ns offline-4clojure.p67
  (:use clojure.test))

(def __
  (fn [n]
    (take n (filter (fn [a] (and (< 1 a)
                                 (not-any? #(integer? (/ a %)) (range 2 a)))) (range)))))


(defn -main []
  (are [soln] soln
(= (__ 2) [2 3])
(= (__ 5) [2 3 5 7 11])
(= (last (__ 100)) 541)
))
