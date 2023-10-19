% Define the predicate to find the missing exponent x
find_exponent(_, 0, 0) :- !. % If B is 0, X should be 0 regardless of A.
find_exponent(0, _, _) :- !, fail. % If A is 0, it's not possible to find X.
find_exponent(A, B, X) :-
    X is log(B) / log(A).

?- find_exponent(2, 8, X).