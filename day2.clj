(ns day2.clj
  (:require [clojure.string :as str]))

(def input (as-> (slurp "/Users/ywei/dev/aoc/day1-input.txt") input-str
             (str/split input-str #"\n")
             (map #(Integer/parseInt %) input-str)))

(defn find-sliding-window-increases
  "find count of increases between two adjacent 3 sum sliding windows"
  [xs]
  (->> (partition 3 1 xs)
    (map (partial apply +))
    (aoc-day1/find-increases)))
