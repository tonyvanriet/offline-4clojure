;; Flatten a Sequence - Easy
;; Write a function which flattens a sequence.
;; tags - seqs:core-functions
;; restricted - flatten
(ns offline-4clojure.p28
  (:use clojure.test))

(def __
  #(loop [values %
           acc []]
      (let [value (first values)]
        (if (nil? value)
          acc
          (if (coll? value)
            (if (empty? (rest values))
              (recur value
                     acc)
              (recur (apply conj (apply vector value) (rest values))
                     acc))
            (recur (rest values)
                   (conj acc value))))))
)



(defn -main []
  (are [soln] soln
(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
(= (__ '((((:a))))) '(:a))
))

