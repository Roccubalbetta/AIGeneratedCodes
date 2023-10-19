% codice sbagliato

% Define predicates to transcribe individual DNA bases to mRNA bases
transcribe(a, u).
transcribe(t, a).
transcribe(g, c).
transcribe(c, g).

% Define a predicate to transcribe a DNA strand to mRNA
transcribe_dna_to_mrna([], []).
transcribe_dna_to_mrna([DNA_Base | Rest_DNA], [mRNA_Base | Rest_mRNA]) :-
    transcribe(DNA_Base, mRNA_Base),
    transcribe_dna_to_mrna(Rest_DNA, Rest_mRNA).

% Query to transcribe DNA to mRNA
?- transcribe_dna_to_mrna([a, t, g, c, t, a], mRNA).