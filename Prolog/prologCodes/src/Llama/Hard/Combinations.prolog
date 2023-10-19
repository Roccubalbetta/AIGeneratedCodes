% soluzione corretta
% combination(K,L,C) :- C is a list of K distinct elements
%    chosen from the list L

combination(0,_,[]).
combination(K,L,[X|Xs]) :- K > 0,
   el(X,L,R), K1 is K-1, combination(K1,R,Xs).

% Find out what the following predicate el/3 exactly does.

el(X,[X|L],L).
el(X,[_|L],R) :- el(X,L,R).


% soluzione di Llama
combination(0, _, []).
combination(K, [X|Xs], [X|Ys]) :-
    K > 0,
    K1 is K - 1,
    combination(K1, Xs, Ys).
combination(K, [_|Xs], Ys) :-
    K > 0,
    combination(K, Xs, Ys).