;always gives the same output for the same input
;doesn't modify anything outside itself

(define (square x)
  (* x x))

(define (add x y)
  (+ x y))  

; (display (square 5))
; (newline)
; (display (add 10 5))
; (newline)

;impure function
(define count 0)

(define (increment)
  (set! count (+ count 1))
  count)

(display (increment))
(newline)
(display (increment))
(newline)
(display (increment))
(newline)