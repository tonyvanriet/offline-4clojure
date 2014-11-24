;; A nil key - Elementary
;; Write a function which, given a key and map, returns true <a href="http://en.wikipedia.org/wiki/If_and_only_if">iff</a> the map contains an entry with that key and its value is nil.
;; tags - maps
;; restricted -
(ns offline-4clojure.p134
  (:use clojure.test))

(def __
  (fn [k m]
    (if (contains? m k)
      (= nil (k m))
      false))
)

(defn -main []
  (are [soln] soln
(true?  (__ :a {:a nil :b 2}))
(false? (__ :b {:a nil :b 2}))
(false? (__ :c {:a nil :b 2}))
))
