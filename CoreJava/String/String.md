# Strings in Java

## Introduction

In Java, **Strings** are objects that represent sequences of characters. The `String` class is part of the `java.lang` package and is **immutable**, meaning once a `String` object is created, it cannot be changed.

---

## Creating Strings

### Using String Literal
```java
String str = "Hello";
```
This uses the String constant pool for memory optimization.

## Using new Keyword
```java
String str = new String("Hello");
```
This creates a new object in the heap even if the string already exists in the pool.

## String Immutability
Once a String object is created, its value cannot be changed. Any operation that seems to modify it actually creates a new object.

```java
String str = "Hello";
str.concat(" World"); // This doesn't change str
System.out.println(str); // Output: Hello

str = str.concat(" World"); // Now str points to a new object
System.out.println(str); // Output: Hello World
```
## Common String Methods
Method	Description
length()	Returns the number of characters in the string
charAt(int index)	Returns the character at a specific index
substring(int start, int end)	Returns substring from start to end-1
toLowerCase() / toUpperCase()	Converts case
equals(String s)	Compares values (case-sensitive)
equalsIgnoreCase(String s)	Compares values ignoring case
contains(String s)	Checks if string contains another
indexOf(String s)	Returns index of substring
replace(char old, char new)	Replaces characters
trim()	Removes leading and trailing spaces
split(String regex)	Splits string into array
startsWith() / endsWith()	Checks how a string begins/ends

## String Comparison
- Using ==
Compares reference (memory address).

```java

String a = "Java";
String b = "Java";
System.out.println(a == b); // true

String c = new String("Java");
System.out.println(a == c); // false
```

- Using .equals()
Compares actual content.

```java
System.out.println(a.equals(c)); // true
```

# StringBuilder and StringBuffer
- StringBuilder (Not Thread-Safe, Faster)
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```
- StringBuffer (Thread-Safe)
```java
StringBuffer sb = new StringBuffer("Java");
sb.append(" Rocks");
System.out.println(sb); // Java Rocks
```

## Converting Between String and Other Types
- String to int
```java
int num = Integer.parseInt("123");
```

- int to String
```java
String str = String.valueOf(123);
```

- String Formatting
```java
String name = "John";
int age = 25;
String formatted = String.format("My name is %s and I am %d years old", name, age);
System.out.println(formatted);
// Output: My name is John and I am 25 years old
```

## 
Important Notes
Strings are immutable, use StringBuilder or StringBuffer for heavy modifications.

Always use .equals() for comparing contents.

Use trim() to remove unwanted spaces from user input.

## Sample Programs
Reverse a String
```java
String original = "Hello";
String reversed = new StringBuilder(original).reverse().toString();
System.out.println(reversed); // olleH
```

- Count Vowels in a String
```java
String str = "Hello World";
int count = 0;
for (char ch : str.toLowerCase().toCharArray()) {
    if ("aeiou".indexOf(ch) != -1) count++;
}
System.out.println("Vowels: " + count);
```