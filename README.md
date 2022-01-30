# java-tasks

These are all java tasks that I created during studying programming fundamentals subject.

## fun fact :joy:

In the above Java files, there is a file _`SarmadiList.java`_.

### story behind _`SarmadiList.java`_

When we studied **Arrays in Java**, we came to know that in Java the **length of Arrays is immutable (fixed)**. And we cannot append any item to Arrays in Java as we do in Lists in Python.

At that time I created a method in Java that takes two arguments and returns a new array.

1. **1st Argument** is an Array in which I want to insert another entry.
2. **2nd Argument** is a Number that I want to insert at the end.

```java
public static int[] append(int[] list, int value) {
    int[] newList = new int[list.length + 1];
    for (int i = 0; i < list.length; i++) {
        newList[i] = list[i];
    }
    newList[newList.length - 1] = value;
    return newList;
}
```

What it does is that it creates a new Array with the length of 1+ in the length of the previous Array. After that, it inserts all the values of a previous Array into the new Array, and the number that it takes as a 2nd argument is inserted at the last index of the new Array. Finally, it returns the new Array.

After doing this, I felt like I conquered something :rofl:.

### what I learned :sparkles:

When I show this to my teacher, he told me that by doing this I am creating a new Array in memory and not appending it at the end of that previous Array, which is not memory efficient.
