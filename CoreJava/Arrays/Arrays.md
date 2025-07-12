# Arrays in Java

An **array** is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created and cannot be changed.

---

## 1. Declaring Arrays

```java
int[] numbers;        // preferred syntax
int numbers[];        // also valid
```

---

## 2. Creating Arrays

```java
int[] numbers = new int[5];         // array of 5 integers (default values = 0)
String[] names = new String[3];     // array of 3 strings (default values = null)
```

---

## 3. Initializing Arrays

```java
int[] scores = {90, 85, 70, 60};
String[] fruits = new String[] {"Apple", "Banana", "Mango"};
```

---

## 4. Accessing and Modifying Elements

```java
int[] arr = {10, 20, 30};
System.out.println(arr[0]);   // prints 10
arr[1] = 50;                  // updates second element to 50
```

---

## 5. Looping Through Arrays

### a. Using for loop

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### b. Using enhanced for loop

```java
for (int val : arr) {
    System.out.println(val);
}
```

---

## 6. Array Length

```java
int[] data = new int[10];
System.out.println(data.length); // prints 10
```

---

## 7. Multi-Dimensional Arrays

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(matrix[1][2]); // prints 6
```

---

## 8. Jagged Arrays

```java
int[][] jagged = new int[2][];
jagged[0] = new int[]{1, 2};
jagged[1] = new int[]{3, 4, 5};
```

---

## 9. Common Error: ArrayIndexOutOfBoundsException

```java
int[] arr = {1, 2, 3};
System.out.println(arr[5]); // throws ArrayIndexOutOfBoundsException
```

---

## 10. Example: Sum of Elements

```java
int[] nums = {10, 20, 30, 40};
int sum = 0;
for (int num : nums) {
    sum += num;
}
System.out.println("Sum = " + sum);  // Output: Sum = 100
```

---

## 11. Using Arrays Utility Class

```java
import java.util.Arrays;

int[] arr = {3, 1, 4, 2};
Arrays.sort(arr);                         // sorts array
System.out.println(Arrays.toString(arr)); // prints [1, 2, 3, 4]
```

---

## 12. Key Points

- Arrays are fixed in size.
- Index starts at 0.
- Arrays are objects stored on the heap.
- Default values:
  - `0` for numeric types
  - `false` for boolean
  - `null` for object references

---

## 🔚 Conclusion

Arrays are fundamental in Java. For dynamic resizing, use collections like `ArrayList`.

