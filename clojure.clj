(defn atlas-v
  []
   {:dry-mass 50050
    :fuel-mass 284450
    :time 0
    :isp 3050
    :max-fuel-rate (/ 28445 253)
    :max-thrust 4.152e6})
(defn double-+
    [a b]
    (* 2 (+ a b)))
(defn double-op
    [f a b]
    (* 3 (a a b)))
(defn double-<f>
    [a b]
    (* 2 (f a b)))
(defn double-*
    [a b]
    (* 2 (* a b)))
