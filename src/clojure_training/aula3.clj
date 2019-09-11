(ns clojure-training.aula3)

(defn valor-descontado
  "Retorna o valor bruto com 10% de desconto"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))

(println (valor-descontado 100))



(defn aplica-desconto?
  [valor-bruto]
  (println "chamando funcao")
  (if (> valor-bruto 100)
    true
    false
  ))


(println (aplica-desconto? 1000))

(println (aplica-desconto? 100))


(defn valor-descontado
  "Retorna o valor bruto com 10% de desconto"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(println (valor-descontado 1000))

(println (valor-descontado 100))



(defn valor-descontado
  "Retorna o valor bruto com 10% de desconto se deve aplicar desconto"
  [aplica? valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "funcao como parametro")
(println (valor-descontado aplica-desconto? 1000))
(println (valor-descontado aplica-desconto? 100))


(println "função anônima com definição na linha")
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))

(println "função anônima com abreviação de parâmetros")
(println (valor-descontado (fn [v] (> v 100)) 1000))

(println "função anônima com função implícita")
(println (valor-descontado #(> %1 100) 1000))
