(ns clojure-training.aula4)

(def precos [30 700 1000])

(println (precos 0))
(println (get precos 2))
(println (get precos 2 0))

(println (update precos 0 inc))
(println precos)

; Código da aula 3
(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false
  ))

(defn valor-descontado
  "Retorna o valor bruto com 10% de desconto se deve aplicar desconto"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

; Using map to apply a function to all vector values
(map valor-descontado precos)

; Using filter to apply a condition to each element in a vector
(println (filter even? (range 10)))
(println (filter odd? (range 10)))

(println "filter" (filter aplica-desconto? precos))

; Using map after a filter to each element in a vector
(println "map after filter" (map valor-descontado (filter aplica-desconto? precos)))

; REDUCE

(println (reduce + precos))
(println (reduce - precos))

; DEMO OF HOW REDUCE WORKS

(defn minha-soma
  "Function that sums two values"
  [valor-1 valor-2]
  (println "somando" valor-1 valor-2)
  (+ valor-1 valor-2))

(println (reduce minha-soma precos))
(println (reduce minha-soma (range 10)))
