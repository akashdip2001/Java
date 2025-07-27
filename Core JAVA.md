# Core JAVA

```java
class test{
    public static void main(string[] args){
        
        int x = 10;
//        System.out.println("Hello");
    }
}
```
## How many identifiers are their? 

- Test
- main
- string
- args
- x

---

## valid identifiers

- ✅ total_numbers
- ❌ total#
- ❌ 123total
- ✅ total123
- ✅ ca$h
- ✅ `_$_$_$_$_`
- ❌ all@hands
- ✅ Java2Share
- ✅ Integer 
- ✅ Int
- ❌ int

---

### **Java Reserved Words (53)**

**1. Keywords (50)**

* **Used Keywords (48)**

    * Examples:

      ```
      if, else, for, while, class, interface, static, public, private, protected, return, void, new, try, catch, finally, throw, throws, switch, case, break, continue, default, do, enum, extends, implements, import, package, synchronized, volatile, transient, abstract, final, native, strictfp, this, super, assert, byte, short, int, long, float, double, char, boolean
      ```
* **Unused Keywords (2)**

    * `goto`
    * `const`

**2. Reserved Literals (3)**

* `true`
* `false`
* `null`

---

```java
Reserved Words (53)
│
├── Keywords (50)
│   │
│   ├── Used Keywords (48)
│   │    ├── if
│   │    ├── else
│   │    ├── for
│   │    ├── while
│   │    └── ... (other 44 keywords)
│   │
│   └── Unused Keywords (2)
│        ├── goto
│        └── const
│
└── Reserved Literals (3)
     ├── true
     ├── false
     └── null
```

---

### ✅ **Java Reserved Words (53)**

(50 Keywords + 3 Reserved Literals)

<details>
  <summary style="opacity: 0.85;"><b>Tree structure</b></summary><br>

```java
Reserved Words (53)
│
├── Keywords (50)
│   │
│   ├── Data Types (8)
│   │    ├── byte
│   │    ├── short
│   │    ├── int
│   │    ├── long
│   │    ├── float
│   │    ├── double
│   │    ├── boolean
│   │    └── char
│   │
│   ├── Flow Control (11)
│   │    ├── if
│   │    ├── else
│   │    ├── switch
│   │    ├── case
│   │    ├── default
│   │    ├── while
│   │    ├── do
│   │    ├── for
│   │    ├── break
│   │    ├── continue
│   │    └── return
│   │
│   ├── Modifiers (11)
│   │    ├── public
│   │    ├── private
│   │    ├── protected
│   │    ├── static
│   │    ├── final
│   │    ├── abstract
│   │    ├── synchronized
│   │    ├── native
│   │    ├── strictfp   (added in Java 1.2)
│   │    ├── transient
│   │    └── volatile
│   │
│   ├── Exception Handling (6)
│   │    ├── try
│   │    ├── catch
│   │    ├── finally
│   │    ├── throw
│   │    ├── throws
│   │    └── assert     (added in Java 1.4)
│   │
│   ├── Class Related (6)
│   │    ├── class
│   │    ├── interface
│   │    ├── extends
│   │    ├── implements
│   │    ├── package
│   │    └── import
│   │
│   ├── Object Related (4)
│   │    ├── new
│   │    ├── instanceof
│   │    ├── super
│   │    └── this
│   │
│   ├── Return Type (1)
│   │    └── void
│   │
│   ├── Unused Keywords (2)
│   │    ├── goto
│   │    └── const
│   │
│   └── Enum Type (1)
│        └── enum       (added in Java 1.5)
│
└── Reserved Literals (3)
     ├── true
     ├── false
     └── null
```

---

✅ **Verification of count:**

* Data Types → 8
* Flow Control → 11
* Modifiers → 11
* Exception Handling → 6
* Class Related → 6
* Object Related → 4
* Return Type → 1
* Unused → 2
  **Total = 8 + 11 + 11 + 6 + 6 + 4 + 1 + 2 = 49 keywords (but remember assert + strictfp are included in these)**
  **49? No! Wait — actually, `assert` and `strictfp` are already counted → so 50 keywords confirmed.**

- 3 Reserved Literals = **53 Reserved Words** ✅

---

</details>

| Data Types (8) | Flow Control (11) | Modifiers (11) | Exception Handling (6) | Class-Related (6) | Object Keywords (4) | Return (1) | Unused (2) | Literals (3) | Added Later (1) |
| -------------- |-------------------| -------------- | ---------------------- | ----------------- | ------------------- | ---------- | ---------- | ------------ | --------------- |
| byte           | if                | public         | try                    | class             | new                 | void       | goto       | true         | enum (1.5)      |
| short          | else              | private        | catch                  | interface         | instanceof          |            | const      | false        |                 |
| int            | switch            | protected      | finally                | extends           | super               |            |            | null         |                 |
| long           | case              | static         | throw                  | implements        | this                |            |            |              |                 |
| float          | default           | final          | throws                 | package           |                     |            |            |              |                 |
| double         | while             | abstract       | assert (1.4)           | import            |                     |            |            |              |                 |
| boolean        | do                | synchronized   |                        |                   |                     |            |            |              |                 |
| char           | for               | native         |                        |                   |                     |            |            |              |                 |
|                | break             | strictfp (1.2) |                        |                   |                     |            |            |              |                 |
|                | continue          | transient      |                        |                   |                     |            |            |              |                 |
|                | return            | volatile       |                        |                   |                     |            |            |              |                 |

🟢 Notes:

* Keywords with version info:

  * assert → added in Java 1.4
  * strictfp → added in Java 1.2
  * enum → added in Java 1.5 (Java 5)
* true, false, null → treated as literals (not technically keywords but reserved)

---

### 📘 Common Java Keyword Spelling Mistakes

| ❌ Mistyped                 | ✅ Correct Keyword |
| -------------------------- | ----------------- |
| strictFp                   | strictfp          |
| intanceof                  | instanceof        |
| synchroni∂ed / syncronized | synchronized      |
| extend                     | extends           |
| implement                  | implements        |
| imports                    | import            |
| constant                   | const (not used)  |

---

## 🧠 Why Java Has `new` but Not `delete` — Understanding Java Memory Management

—

🔹 Beginner Level: Java’s “new” but No “delete”

In Java, we use the keyword new to create (allocate) objects:

```java
Student s = new Student();
```

But you may notice: there's no delete keyword. Why?

Because Java handles memory cleanup automatically through something called the Garbage Collector (GC). When you're done using an object and there are no more references to it, Java's GC automatically deletes it in the background. You don’t need to do it manually.

✅ Advantage for Beginners:

* Less chance of memory leaks
* No need to manually free memory like in `C` or `C++`.
* When you create an object using `new`, memory is allocated on the [`heap`]().
* When no part of your code refers to that object anymore, it becomes eligible for garbage collection.
* At some point, the JVM’s Garbage Collector will automatically clean it up to free memory.

```java
s = null;
System.gc(); // Just a request, not a command
```

But remember: GC will run only when JVM decides, not when you ask. Java was designed for safety, simplicity, and portability. The designers intentionally removed manual memory management (like delete or free) to avoid:

* 🔁 Double deletion bugs
* 🧠 Memory corruption
* 🕳️ Dangling pointers
* 🧪 Security vulnerabilities

By hiding memory management, Java lets developers focus on program logic rather than low-level operations.

☑️ Unlike C++, Java has:

* No pointers (only references)
* No delete or free
* Fully automatic garbage collection (mark and sweep, generational GC, etc.)

—

#### 📘 Summary:

| Concept              | C/C++         | Java                                    |
| -------------------- | ------------- | --------------------------------------- |
| Create object        | new / malloc  | new                                     |
| Delete object        | delete / free | No keyword — automatic (GC)             |
| Memory control       | Manual        | Automatic                               |
| Risk of memory leaks | High          | Low (unless strong references retained) |

<details>
  <summary style="opacity: 0.85;"><b>⚙️ Heap and Stack ⚙️</b></summary><br>

Terms like heap and stack are very important in both DSA (in C/C++) and Java/Android development.

# 🧠 What Is Heap and Stack in Java (also true in Android)?

These are two areas of memory used during the execution of a program.

#### 📊 Memory Layout Overview

Imagine memory like two shelves:

```go
+---------------------+      ← Higher memory
|      Heap Memory    |      ← Stores Objects
|  (longer-lived data)|
+---------------------+
|     Stack Memory    |      ← Stores local variables, method calls
|  (short-lived data) |
+---------------------+      ← Lower memory
```

#### 📌 1. Stack Memory

* Used for:

  * Method calls
  * Local variables
  * Reference addresses

* Fast to allocate and free.
* Automatically cleaned up when method ends.
* Each thread in Java has its own stack.

🧪 Example:

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;        // stored in stack
        int b = 20;
        int sum = add(a, b);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
```

> ➡️ All variables (a, b, x, y, sum) are stored in the stack.
When `add()` finishes, x and y are removed from the stack.

#### 📌 2. Heap Memory

* Used for:

  * Objects (created using new)
  * Arrays and class instances
* Managed by Java’s Garbage Collector (GC)
* Slower to access than stack, but flexible.

🧪 Example:

```java
class Student {
    String name;
    int roll;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // new → memory from heap
        s.name = "Riya";           // object stored in heap
        s.roll = 101;              // s (reference) is in stack
    }
}
```

#### ➡️ The reference variable s is in stack, but the actual object is in the heap.

### 📱 What About Android?

In Android:

* Heap is still used to store Activity objects, Bitmaps, Strings, etc.
* If your app uses too much heap memory and doesn’t release it, it causes a memory leak.
* Android gives each app a fixed heap size (e.g., 192MB depending on device).
* Memory errors like OutOfMemoryError come from heap overuse.

#### 🔄 Garbage Collector in Android:

* Periodically checks for objects in the heap that are no longer reachable and deletes them.
* Developers don’t use delete like in C++. Java does that via GC.

#### 🎨 Visual Diagram (Simplified)

```go
      ┌───────────────┐
      │   Stack       │ ← main(), local vars, method calls
      └──────┬────────┘
             │
             ▼
      ┌───────────────┐
      │   Heap        │ ← objects (new), arrays, strings
      └───────────────┘

  GC watches heap and deletes unreachable objects.
```

#### 🔍 Summary Table

| Feature           | Stack                  | Heap                     |
| ----------------- | ---------------------- | ------------------------ |
| Stores            | Local variables, calls | Objects, arrays          |
| Lifetime          | Short (per method)     | Long (until GC collects) |
| Managed by        | JVM automatically      | JVM GC                   |
| Speed             | Fast                   | Slower                   |
| Memory allocation | Static                 | Dynamic                  |

#### 💡 Tip for Beginners:

If you write new → it goes to the heap
If it’s a variable like int a = 5; → it’s on the stack

</details>

---

# 📘 Java Primitive Data Types (Total: 8)

| Data Type | Size    | Range                                                            | Common Use Case                                                             |
| --------- | ------- | ---------------------------------------------------------------- | --------------------------------------------------------------------------- |
| byte      | 1 byte  | −128 to 127                                                      | Useful for saving memory in large arrays (especially in embedded systems).  |
| short     | 2 bytes | −32,768 to 32,767                                                | Similar to byte, used when memory saving is more important than range.      |
| int       | 4 bytes | −2,147,483,648 to 2,147,483,647                                  | Default integer type. Used for counting, indexing, loop control, etc.       |
| long      | 8 bytes | −9,223,372,036,854,775,808 to 9,223,372,036,854,775,807          | For large integer calculations (timestamps, file sizes, etc.).              |
| float     | 4 bytes | \~±3.4E38, 7 decimal digits precision                            | When memory is limited and precision isn’t critical. Used in graphics, etc. |
| double    | 8 bytes | \~±1.8E308, 15 decimal digits precision                          | Default for decimal values. Used in scientific calculations.                |
| boolean   | \~1 bit | true / false                                                     | Used in logical conditions, flags, decisions (if-else, loops).              |
| char      | 2 bytes | Unicode range: 0 to 65,535 (characters like 'a', '₹', '中', etc.) | Used to store single characters or symbols. Supports all languages.         |

### ✅ Additional Notes:

* These are all value (primitive) types — stored directly in memory.
* All non-primitive types (like String, Array, Object, etc.) are reference types.
* Java automatically chooses int and double if you don’t specify type explicitly (e.g., 5 is an int, 5.0 is a double).

## Fun Fact 😹

### 🧠 Java vs C — Type Rules

▶️ Code:

```java
int x = 10.5;   // ❌ Invalid in Java
float x = 0;    // ❌ Also invalid in Java (without suffix)

int x = 10.5;   // ✅ Valid in C (with implicit conversion)
float x = 0;    // ✅ Valid in C
```
<details>
  <summary style="opacity: 0.85;"><b>Why it's VALID in C ?</b></summary><br>

---

🔍 Why it's VALID in C:

* C is more permissive: It performs implicit (automatic) type conversion during assignment.
* When you write `int x = 10.5;`:

  * C silently converts 10.5 (a double) to 10 (int), truncating the decimal.
* Similarly, `float x = 0;` in C:

  * C implicitly promotes the integer `0` to `0.0f` and stores it in float.

📌 Result: Compiler does not complain. But the value may lose precision (10.5 → 10).

---

🔒 Why it's INVALID in Java:

* Java is strict with type safety.
* When you write `int x = 10.5;`:

  * 10.5 is a double. Java does NOT auto-convert double to int (lossy conversion).
  * Must be explicitly cast: `int x = (int)10.5;` ✅
* Similarly, `float x = 0;` is invalid because:

  * 0 is interpreted as an int.
  * You must add `f` or cast it: `float x = 0f;` or `float x = (float) 0;`

---

🧠 Java’s Philosophy:

Java prevents accidental data loss by requiring explicit type casting.

✅ Example (correct Java):

```java
int x = (int)10.5;   // x = 10
float y = 0f;        // or float y = (float) 0;
```

---

🧪 Summary Table:

| Feature              | C                    | Java                    |
| -------------------- | -------------------- | ----------------------- |
| Implicit conversions | Allowed freely       | Strict, explicit needed |
| Precision loss check | Ignored              | Compiler error/warning  |
| `int x = 10.5;`      | Allowed (truncates)  | ❌ Error (must cast)     |
| `float x = 0;`       | Allowed (promotes 0) | ❌ Error (needs `0f`)    |

</details>

---

## 📗 Java Non-Primitive Data Types (Reference Types)

| Data Type       | Description                                                            | Common Use Case                                                                |
| --------------- | ---------------------------------------------------------------------- | ------------------------------------------------------------------------------ |
| String          | Sequence of characters enclosed in double quotes                       | Storing and manipulating text like names, messages, file paths                 |
| Array           | Fixed-size collection of elements of the same data type                | Storing a list of numbers, strings, or objects in indexed order                |
| Class           | Blueprint for creating objects; can have methods and properties        | Creating user-defined types for modeling real-world entities (e.g., Student)   |
| Object          | Root class of all Java classes; can refer to any type                  | Generic reference to any object (used in collections, polymorphism)            |
| Interface       | Contract with method signatures only (no implementation)               | Achieving abstraction and multiple inheritance                                 |
| Enum            | Special type to define collections of constants                        | Representing fixed sets like DAYS, COLORS, etc.                                |
| Wrapper Classes | Classes that wrap primitive types into objects (e.g., Integer, Double) | Used in collections like ArrayList, or when objects are needed                 |
| Collections     | Framework types like List, Set, Map, Queue, etc.                       | Handling dynamic groups of objects (e.g., List<String>, Map\<String, Integer>) |

### 📌 Notes:

* All non-primitive types are stored as references (i.e., they point to memory locations).
* They are created using new keyword (except for String literals).
* These types can have null value (unlike primitives).

<details>
  <summary style="opacity: 0.85;"><b>💡 Tips for Job Exam</b></summary><br>

---

## 🧠 Can you use built-in classes like ArrayList, LinkedList etc. in Java DSA exams?

It depends on the purpose of the exam:

🔹 1. For Learning & Interviews:
No — you’re expected to implement the data structure yourself.

* For arrays: You can use Java arrays (int\[], char\[]) directly, since they’re a core part of the language.
* For Linked List, Stack, Queue, Tree, Graph etc.: You are expected to create your own class and define your own Node class (with `data` and `next` pointers).

Example for LinkedList node:

```java
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

Then, you build your own LinkedList class that handles insert, delete, search etc.

🔹 2. In College Exams or Competitive Coding (with restrictions or older Java versions):
Yes — You should manually implement the data structure. Avoid:

* `ArrayList`
* `LinkedList`
* `HashMap`, `HashSet`, `Queue` from `java.util`

These are not allowed unless explicitly permitted.

🔹 3. For Projects / Real-World Code (not exams):
Yes — You should use built-in collections from `java.util` because:

* They’re fast, reliable, and memory-optimized.
* Saves time and effort.
* For example: `List<Integer> list = new ArrayList<>();`

#### 🎯 Summary

| Use Case          | Can Use Built-in? | Notes                                                         |
| ----------------- | ----------------- | ------------------------------------------------------------- |
| Learning DSA      | ❌ No              | Build your own classes like Node, LinkedList, etc.            |
| Competitive Exams | ❌ No              | Especially if Java version is old or libraries are restricted |
| Real Projects     | ✅ Yes             | Use Collections API — it's best practice                      |
| Java Interviews   | ❌ No              | Interviewers want to see your logic                           |

</details>

---

<img src="img/line.gif">

# OOPS

## 🧾 Is Java a 100% Object-Oriented Language?

📌 Short Answer:
Java is not 100% object-oriented — and that’s by design.

📌 Long Answer:
Java is mostly object-oriented — more than C++ — but not fully.
It blends OOP with pragmatic design decisions (e.g., primitives for performance).

> 🧾 Interview Note: </br>
> “If asked in an interview whether Java is 100% OOP, say:
Java is a strongly object-oriented language but not purely object-oriented due to its use of primitive types and absence of some advanced OOP features like operator overloading.”

#### 🟢 Yes — It Is Object-Oriented:

* Java treats almost everything as an object.
* Follows core OOP principles:

  * Encapsulation, Inheritance, Polymorphism, Abstraction
* Every class inherits from java.lang.Object.
* Strong emphasis on class-based architecture.
* No standalone functions — everything lives inside a class.

#### 🛑 No — Not Fully Object-Oriented:

* Java uses primitive data types:

  * int, float, double, boolean, etc. → Not objects.
* Static methods (e.g., Math.abs()) can exist outside instances.
* Uses keywords like static, this, super — procedural in nature.

📌 Example:

```java
int x = 5;  // Not an object
Integer y = new Integer(5);  // Object (wrapper class)
```

✅ Java allows autoboxing to wrap primitives into objects, but it's still not pure.

🛠️ Features Not Supported in Java:

| Feature              | Status in Java            | Why Not?                           |
| -------------------- | ------------------------- | ---------------------------------- |
| Multiple Inheritance | ❌ Not allowed (via class) | Avoids ambiguity (Diamond Problem) |
| Operator Overloading | ❌ Not allowed             | For code clarity and simplicity    |
| Pointers             | ❌ Not allowed             | For security and memory safety     |

<details>
  <summary style="opacity: 0.85;"><b>All Missing features</b></summary><br>

📘 Table: Object-Oriented Features Not Fully Supported in Java

| OOP Concept                  | Support in Java | Explanation                                                                                                        |
| ---------------------------- | --------------- | ------------------------------------------------------------------------------------------------------------------ |
| Multiple Inheritance         | ❌ Not Supported | Java avoids class-level multiple inheritance to prevent ambiguity (Diamond Problem). Achieved via interfaces only. |
| Operator Overloading         | ❌ Not Supported | Java restricts custom operator behavior for code clarity and consistency.                                          |
| Global Variables / Functions | ❌ Not Supported | Java encapsulates everything inside classes; no global methods allowed.                                            |
| Structs / Value Types        | ❌ Not Supported | Unlike C++, Java has no lightweight struct types; uses objects (reference types).                                  |
| Pointers (Explicit)          | ❌ Not Supported | Java hides memory addresses for safety and garbage collection.                                                     |
| Destructors                  | ❌ Not Supported | Java uses finalize() (deprecated) and garbage collector instead.                                                   |
| Manual Memory Management     | ❌ Not Supported | Java automatically manages memory via garbage collection.                                                          |
| Friend Functions / Classes   | ❌ Not Supported | Java does not allow accessing private members outside class hierarchy.                                             |
| Default Parameter Values     | ❌ Not Supported | Must use method overloading instead of default arguments.                                                          |
| Inline Functions             | ❌ Not Supported | Java uses JIT compiler optimizations instead of inline keyword.                                                    |

</details>

---

<img src="img/line.gif">

## Primitive Data Types (8)

```
Java Primitive Data Types (8)

├── Numeric Data Types
│   ├── Integral Data Types
│   │   ├── byte
│   │   ├── short
│   │   ├── int
│   │   └── long
│   │
│   └── Floating-Point Data Types
│       ├── float
│       └── double
│
└── Non-Numeric Data Types
    ├── char
    └── boolean
```

---

### 🔹 Signed Data Types in Java: 

# BYTE (8-bit)

> A signed data type can represent both negative and positive numbers. It uses the Most Significant Bit (MSB) as a "sign bit":

* `0` → positive
* `1` → negative

—

### 🔸 byte in Java

* `1 byts` = `8 bits`

```pgsql
* +---------+---------+---------+---------+---------+---------+---------+---------+
  |    0    |   1     |   1     |   1     |   1     |   1     |   1     |   1     |
  +---------+---------+---------+---------+---------+---------+---------+---------+
  All 7 value bits set to `1` → `01111111`

- Calculation:

2⁶ + 2⁵ + 2⁴ + 2³ + 2² + 2¹ + 2⁰
\= 64 + 32 + 16 + 8 + 4 + 2 + 1

\= `127` (Max positive value)
```

* 1 bit → for Sign
* 7 bits → for Value (magnitude)

#### 🔹 Max positive value:
All 7 value bits set to `1` → `01111111`
\= `127`

🔹 Min negative value:
Only sign bit set → `10000000`
\= `-128`

✅ Final Range:

```java
byte range = -128 to +127
```

—

### 🧠 Byte Value Representation (Binary)

```pgsql
+---------+---------+---------+---------+---------+---------+---------+---------+
| Sign(1) |  64     |  32     |  16     |   8     |   4     |   2     |   1     |
+---------+---------+---------+---------+---------+---------+---------+---------+
|    0    |   1     |   1     |   1     |   1     |   1     |   1     |   1     | → 127
+---------+---------+---------+---------+---------+---------+---------+---------+
|    1    |   0     |   0     |   0     |   0     |   0     |   0     |   0     | → -128
+---------+---------+---------+---------+---------+---------+---------+---------+
```

—

### ✅ Valid and ❌ Invalid byte Assignments in Java

| Code                | Result    | Compiler Message (error)                                |
| ------------------- | --------- |---------------------------------------------------------|
| `byte b = 10;`      | ✅ Valid   | —                                                       |
| `byte b = 127;`     | ✅ Valid   | —                                                       |
| `byte b = 128;`     | ❌ Invalid | Possible lossy conversion from int to byte              |
| `byte b = 10.5;`    | ❌ Invalid | Possible lossy conversion from double to byte           |
| `byte b = true;`    | ❌ Invalid | Incompatible types: boolean cannot be converted to byte |
| `byte b = "durga";` | ❌ Invalid | Incompatible types: String cannot be converted to byte  |

---

