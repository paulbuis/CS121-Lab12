# CS121 - Lab 12: HeapSort

Recall from yesterday's lecture that
the Heap sort algorithm consists of two
phases:

1. Take all items from an `ArrayList<T>` and
   add them to an initially empty `Heap<T>`.
2. Repeatedly call `removeMin()` on the `Heap<T>`
   and add them to an initially empty `ArrayList<T>`

The `ArrayList<T>` used in step 2 will now be sorted!

## Lab Assignment - Part 1

Look in the `cs121.Main` class in `main()`
to see where to replace comments with code
that does both steps 1 and 2 from the above
summary of the Heap Sort algorithm.

Run the code and see if it appears to work:
1. The sizes of `array`, `heap`, and `sorted`
  are all the same (and non-zero).
2. `isSorted(sorted)` returns `true`.

## Lab Assignment - Part 2

Note that there are three values of the
`Comparator<String>` named `comp` available
at the beginning of `Main`:

1. `Comparator.naturalOrder()`
2. `String.CASE_INSENSITIVE_ORDER`
3. `new DictionaryOrder()`

Note that if the natural ordering for
strings is used, all of the dictionary
words printed out from `sorted` start
with a capital letter "A".

Change `comp` to use the case-insensitive order
and run the program again. Note, in particular,
the relative order of the words "abacus" and "Abacus".

If you look in a real dictionary, you will notice
that capitalized words that have the same letter
sequences as uncapitalized words come first.

Now change `comp` use `new DictionaryOrder()`, run
the program yet again and note the relative order
of the words "abacus" and "Abacus".

## You are done!

Describe, the difference or lack of difference between your results
for case-insensitive order and dictionary order
to you instructor for credit for the lab.