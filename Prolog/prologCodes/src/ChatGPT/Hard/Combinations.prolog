% soluzione corretta
% combination(K,L,C) :- C is a list of K distinct elements
%    chosen from the list L

combination(0,_,[]).
combination(K,L,[X|Xs]) :- K > 0,
   el(X,L,R), K1 is K-1, combination(K1,R,Xs).

% Find out what the following predicate el/3 exactly does.

el(X,[X|L],L).
el(X,[_|L],R) :- el(X,L,R).

%% soluzione di ChatGPT
% Define a predicate to generate combinations of K distinct elements from a list.
combination(0, _, []).
combination(K, [X|T], [X|Combination]) :-
    K > 0,
    K1 is K - 1,
    combination(K1, T, Combination).
combination(K, [_|T], Combination) :-
    K > 0,
    combination(K, T, Combination).

% Define a wrapper predicate to find combinations.
combinations(K, List, Combinations) :-
    combination(K, List, Combinations).

% Example usage:
% ?- combinations(3, [a, b, c, d, e, f], L).
% L = [a, b, c] ;
% L = [a, b, d] ;
% L = [a, b, e] ;
% ...