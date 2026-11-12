;Immutable means that once something has been created
;you don't change that object.

(define numbers '(1 2 3))

(define new-numbers
  (cons 4 numbers))

(display numbers)
(newline)
; (1 2 3)

(display new-numbers)
(newline)
; (4 1 2 3)