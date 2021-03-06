(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else           ""))

(defn teen? [age]
  (if (> 20 age 12) true false))

(defn not-teen? [age]
  (not (teen? age)))



(defn generic-doublificate [n]
  (cond
    (number? n) (* n 2)
    (empty?  n) nil
    (list?   n) (* (count n) 2)
    (vector? n) (* (count n) 2)
    :else       true))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4   year) true
    :else               false))

; '_______'
