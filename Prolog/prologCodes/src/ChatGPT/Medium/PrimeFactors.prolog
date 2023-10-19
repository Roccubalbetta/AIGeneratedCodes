% soluzione corretta

% prime_factors(N, L) :- N is the list of prime factors of N.
%    (integer,list) (+,?)

prime_factors(N,L) :- N > 0,  prime_factors(N,L,2).

% prime_factors(N,L,K) :- L is the list of prime factors of N. It is
% known that N does not have any prime factors less than K.

prime_factors(1,[],_) :- !.
prime_factors(N,[F|L],F) :-                           % N is multiple of F
   R is N // F, N =:= R * F, !, prime_factors(R,L,F).
prime_factors(N,L,F) :-
   next_factor(N,F,NF), prime_factors(N,L,NF).        % N is not multiple of F


% next_factor(N,F,NF) :- when calculating the prime factors of N
%    and if F does not divide N then NF is the next larger candidate to
%    be a factor of N.

next_factor(_,2,3) :- !.
next_factor(N,F,NF) :- F * F < N, !, NF is F + 2.
next_factor(N,_,N).


% soluzione di ChatGPT

% Define a predicate to check if a number is prime.
is_prime(2).
is_prime(3).
is_prime(P) :-
    integer(P),
    P > 3,
    P mod 2 =\= 0,
    \+ has_factor(P, 3).

% Define a predicate to check if a number has a factor.
has_factor(N, F) :-
    N mod F =:= 0.
has_factor(N, F) :-
    F * F < N,
    F2 is F + 2,
    has_factor(N, F2).

% Define a predicate to find the prime factors of a number.
prime_factors(1, []).
prime_factors(N, [F|Factors]) :-
    N > 1,
    is_prime(F),
    N mod F =:= 0,
    NewN is N // F,
    prime_factors(NewN, Factors).
prime_factors(N, Factors) :-
    N > 1,
    \+ is_prime(N),
    find_smallest_prime_factor(N, 2, SmallestPrime),
    NewN is N // SmallestPrime,
    prime_factors(NewN, RestFactors),
    Factors = [SmallestPrime|RestFactors].

% Define a predicate to find the smallest prime factor of a number.
find_smallest_prime_factor(N, F, F) :-
    N mod F =:= 0,
    is_prime(F).
find_smallest_prime_factor(N, F, SmallestPrime) :-
    F < N,
    F2 is F + 1,
    find_smallest_prime_factor(N, F2, SmallestPrime).

% Example usage:
% ?- prime_factors(30, Factors).
% Factors = [2, 3, 5]