# Exam 2


Task 1 and 2 should be included in the file `ArrayExamples.java` in the
`ArrayExamples` class. Task 3 should be implemented by adding to
`ExamplesSearch.java`:



## Task 1

Write a method `findSecond` that takes a `String[]` and a `String` and
returns the _index of the second time_ that string appears in the array, or
`-1` if it appears in the array 1 or 0 times.

**Example**: For input {"a", "b", "a"} and "a", it should produce 2.

Provide test and/or examples that justify the correctness of the method you
wrote.

## Task 2

Consider the following methods:

```
int find(int[] nums, int n) {
  for(int i = 0; i < nums.length; i += 1) {
    if(nums[i] == n) { return i; }
  }
  return -1;
}
int mystery(int[] nums, int n) {
  int index = find(nums, n);
  int result = new int[index];
  for(int i = 0; i < index; i += 1) {
    result[i] = nums[i];
  }
  return result;
}
```

1. Describe what `mystery` does in a single English sentence.
2. Come up with an input for `mystery`, **other than** `null` for `nums`,
which causes an exception when run.
3. Change the program so that instead of causing this exception, the program
instead returns an empty array for that input and other inputs like it.

## Task 3

Add a new class to `ExamplesSearch.java` called `AllQuery`. It should
implement the `ImageQuery` interface, have a field of type `ImageQuery[]` and
a corresponding constructor to initialize that field. Its `matches` method
should return true when _all_ of the queries in the list match the given
image. Create at least three `AllQuery`s with arrays of different sizes and
containing different queries to test your class, then call the `matches`
method on several different images to demonstrate that it works correctly.

## Video Task

Trace a use of AllQuery with an array of length 3 with 3 different Query
types in it.