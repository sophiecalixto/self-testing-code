(ns self-testing-code.core)

(defn delivery-fee
  "If the purchase amount is up to 100 reais, a delivery fee of 15 dollars must be charged.
   If it is greater than 100 and less than 200, 5 dollars.
   If it is above 200, the fee is free."
  [purchase-amount]
  (if (<= purchase-amount 100)
    15))