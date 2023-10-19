sum(X, Y, Z) :- Z is X + Y.

    ?- sum(3, 4, Result).
Result = 7.

?- sum(3, X, 7).
X = 4.