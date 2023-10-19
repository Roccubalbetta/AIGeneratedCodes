power(_, 0, 1).
power(0, _, 0).
power(A, X, B) :- X > 0, X1 is X - 1, power(A, X1, B1), B is A * B1.
find_exponent(A, B, X) :- A =\= 0, B =\= 0, between(0, B, X), power(A, X, B).


?- find_exponent(0, 81, X).
false.

?- find_exponent(3, 0, X).
false.

?- find_exponent(3, 81, X).
X = 4.