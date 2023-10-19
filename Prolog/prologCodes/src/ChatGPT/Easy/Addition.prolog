% Define a predicate add/3 to calculate the sum of two numbers.
% add(X, Y, Z) means Z is the result of adding X and Y.
add(X, Y, Z) :-
    Z is X + Y.

% Example usage:
% To find the sum of 5 and 3, call add(5, 3, Result).
% Result will contain the value 8.