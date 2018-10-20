(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (boolean "foo")
  (boolean nil)
  (boolean (+2 3)
  (boolean true)
  (boolean false))

(defn abs [x]
  (if (< x 0)
    (- (- x x) x)
    x)

(defn divides? [divisor n]
  (if(= (mod divisor n) 1)
    (false)
    (true)))

(defn fizzbuzz [n]
  (cond
    (mod n 3) "fizz"
    (mod n 5) "buzz"
    (mod n 15) "gotcha!"
    :else      "zero")
  )

(defn teen? [age]
  (< (> age 12) 19)
)

(defn not-teen? [age]
  (if(and(< age 13)(> age 19))
    true)
)

(defn generic-doublificate [x]
  (cond
   (number? x)(* 2 x)
   (empty? x)nil
   (list? x)(* 2 x)
   :else "true"
   )
)

(defn leap-year? [year]
  (cond
    (and (divides? year 4)(divides year 100)) true
    (and (divides? year 4)(not (divides? year 100)))true
    (not(divides? year 4))false
)

; '_______'
