---
layout: page
title: "UCSD CSE11 S20 – Take Home Exam 2"
doodle: "/doodle.png"
---

# Exam 2

This page details a **take-home exam** that you will complete over the next
few days. You can't communicate with anyone about the content of the
assignment until you receive your grade. The course staff will not give
debugging advice or answer questions about the problems. If you have
technical trouble creating a screencast (detailed below) feel free to reach
out for assistance.

You **can** make use of any course notes, online resources, Java tools, and
so on to complete the exam.

You will complete the programming tasks 1 and 2 in the file `ArrayExamples.java` in the `ArrayExamples` class. Task 3 should be implemented by adding to the file `ExamplesSearch.java`. You should submit both files `ArrayExamples.java` and `ExamplesSearch.java` to the `exam2` Gradescope assignment.

You will aslo submit a **video screencast** of yourself presenting a portion of it to this [TODO]().

Submission checklist (see long descriptions below for full details):

- `[ ]` `findSecond` method in the `ArrayExamples` class
- `[ ]` TODO examples of testing `findSecond` in the `ArrayExamples` class
- `[ ]` A comment describing the `mystery` method in `ArrayExamples`
- `[ ]` A test for the `mystery` method in `ArrayExamples` that threw an exception in the original implementation of that method
- `[ ]` Modified the `mystery` method to not throw the exception from the test above
- `[ ]` `AllQuery` class
- `[ ]` Constructed three instances of `AllQuery` with specified array lengths
- `[ ]` Six tests using these constructed `AllQuery` objects
- `[ ]` Screencast
  - Show ID
  - Trace evaluation of the `AllQuery` test


Your submission will be graded **after** the deadline. The Gradescope upload
will just check to make sure that there aren't any errors reported by Java
when we try to run your programs, not whether tests succeeded or failed. You
should test thoroughly yourself to make sure your program works as expected.

## Tasks

Download this starter code:

[https://github.com/ucsd-cse11-s20/exam2](https://github.com/ucsd-cse11-s20/exam2)

(TODO Is it adapted from anything?)

**TODO** Is this applicable?
You should **not** change any of the existing methods or classes except for
adding to `ExamplesSearch`. Don't change `ImageQuery` or the other query
classes, just add new ones as described below.


### Task 1

Add a **method** to the `ArrayExamples` class called `findSecond` that takes a `String[]` and a `String` and returns the _index of the second time_ that string appears in the array, or `-1` if it appears in the array 1 or 0 times. For example, for the array input `{"a", "b", "a", "a"}` and

- the string input `"a"`, it should produce 2.
- the string input `"b"`, it should produce -1.
- the string input `"c"`, it should produce -1.

<!-- TODO How detailed should this be?-->
Provide test and/or examples that justify the correctness of the method you
wrote. 

<!-- Make sure to _at least_ test your method on the following inputs:

- An empty array and any valid string
- A non-empty array and a string that does not appear in the array
- A non-empty array and a string that appears once in the array
- A non-empty array and a string that appears twice in the array
- A non-empty array and a string that appears three times in the array
- A `null` array and any valid string
- Any valid array and a `null` string
 -->

### Task 2

<!-- TODO Put this code in the ArrayExamples class? -->
Consider the following methods in the `ArrayExamples` class:

```
int find(int[] nums, int n) {
  for(int i = 0; i < nums.length; i += 1) {
    if(nums[i] == n) { return i; }
  }
  return -1;
}
int[] mystery(int[] nums, int n) {
  int index = find(nums, n);
  int[] result = new int[index];
  for(int i = 0; i < index; i += 1) {
    result[i] = nums[i];
  }
  return result;
}
```

1. Consider the `mystery` method in the `ArrayExamples` class. Write a comment above this method describing what it does in a *single* English sentence.
2. Write a test for `mystery` which calls it with an input **other than** `null` for `nums` which causes an exception when run. Write this test as a field named `taskTwoTest` in `ArrayExamples`.
3. Change the `mystery` method so that instead of causing this exception, the program instead returns an empty array for that input and other inputs like it. Note that you must _modify_ this method, not write a new method.

### Task 3

In the file `ExamplesSearch.java`, add a new class called `AllQuery` implementing `ImageQuery`. It should have a field of type `ImageQuery[]` and a corresponding constructor to initialize that field. Its `matches` method should return true when _all_ of the queries in the list match the given image. 

Create at least three `AllQuery`s with arrays of size 0, 3 and 5, each containing different queries. Demonstrate using each query's `matches` method on at least two different `ImageData` inputs, once returning `true` and once returning `false`. So at least 6 tests in total.

### Task 4 – Video

You will record a short video of no more than 8 minutes. Include:

- Your face and your student ID for a few seconds at the beginning. You don't
  have to be on camera the whole time, though it's fine if you are. Just a
  brief confirmation that it's you creating the video/doing the work attached
  to the work itself is what we want.
- For the `AllQuery` with array of size 3 that you created in [Task 3](#task-3):

  Run the `ExamplesSearch` program and show the output corresponding to a method call for this example. Then, starting from the line in your code with the call to the `matches` method, indicate each line of code that runs in your program while evaluating that method call. You can scoll to and click the lines to highlight them, or otherwise indicate each one. You should indicate them in the other that **Java will evaluate them** (this might be different than the order they appear in the file).

An example of what your video should look like when doing this kind of
explanation is here:

[https://drive.google.com/open?id=1E-TcVXSg9BI4MnWoVU9_BbcRJsu8ZhCf](https://drive.google.com/open?id=1E-TcVXSg9BI4MnWoVU9_BbcRJsu8ZhCf)

PA5 has a tutorial for creating a screencast like this
[https://ucsd-cse11-s20.github.io/pa5/](https://ucsd-cse11-s20.github.io/pa5/).
