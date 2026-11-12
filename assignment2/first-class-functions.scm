;first class functions have the ability to be passed as arguments to other functions, returned as values from other functions, and assigned to variables. This allows for more abstract and flexible programming.

; assigned to a variable

(define add-one (lambda (x) (+ x 1)))

;passed as an argument
(define (apply-to-ten func)
  (func 10))

;returned as a value
(define (get-math-function)
  add-one)

(display (apply-to-ten (get-math-function))) 
(newline)