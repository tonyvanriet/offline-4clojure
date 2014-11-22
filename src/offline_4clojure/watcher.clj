(ns offline-4clojure.watcher
  (:require [juxt.dirwatch :refer (watch-dir close-watcher)])
  (:import (java.io File)))


(defn on-file-change-event
  [{:keys [file count action]}]
  (println "running" (.toString file))
  (def changed-file-main
    (load-file (.toString file)))
  (changed-file-main))


(defn -main
  [& args]
  (watch-dir on-file-change-event (clojure.java.io/file "src/offline_4clojure")))
