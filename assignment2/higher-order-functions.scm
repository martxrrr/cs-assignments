; higher order functions take functions as arguments and return functions as results. This allows for more abstract and flexible programming.

;; 'count-matches' is a higher-order function.
;; 'pred' is the testing function passed in (returns true or false).
;; 'lst' is the list of elements we want to check.


(define (count-matches pred lst)
  (cond ((null? lst) 0) ; base case: if the list is empty, return 0
        ((pred (car lst)) ;if true return 1 + the count of the rest of the list
         (+ 1 (count-matches pred (cdr lst))))
        (else 
         (count-matches pred (cdr lst)))))

(display(count-matches (lambda (x) (> x 5)) '(2 7 4 9 1)))
(newline)