(ns aoc-day1
  (:require [clojure.string :as str]))

(def input (as-> (slurp "/Users/ywei/dev/aoc-21/day1-input.txt") input-str
             (str/split input-str #"\n")
             (map #(Integer/parseInt %) input-str)))

(defn find-increases
  "find count of decreases between two adjacent depth number in a list"
  [xs]
  (->> (partition 2 1 xs)
    (filter (fn [[previous-number next-number]] (< previous-number next-number)))
    count))
