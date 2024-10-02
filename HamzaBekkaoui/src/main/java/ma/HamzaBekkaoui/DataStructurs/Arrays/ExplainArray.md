# **What is an Array ?**

An array is a data structure that stores a collection of elements, typically of the same data type,
in a contiguous block of memory. Each element in the array can be accessed using an index,
which represents its position within the array. In most programming languages, including Java,
arrays are zero-indexed, meaning the first element has an index of 0.

# **Key Characteristics of Arrays:**

## 1. Fixed Size:

When an array is created, its size is defined and cannot be changed. If you need a dynamically sized collection, you would typically use a different data structure like a List (e.g., ArrayList in Java).

## 2. Homogeneous Elements:

All elements in an array must be of the same data type. For example, an array of integers can only store integers, and an array of strings can only store strings.

## 3. Contiguous Memory:

The elements of an array are stored in contiguous (adjacent) memory locations. This ensures that accessing an element by its index is very fast, typically constant time (O(1)).

## 4. Indexed Access:

You can access any element in an array using its index. The index allows you to directly retrieve or modify any element in the array.

# Advantages of Arrays:

## Fast Access:
Arrays provide constant time access to elements if you know the index.

## Memory Efficiency:

Arrays are efficient in terms of memory usage because they store elements in contiguous memory locations.

# Disadvantages of Arrays:

## Fixed Size: 
Once an array is created, its size cannot be changed.

## No Built-in Methods:
Arrays don’t have built-in methods for adding, removing, or resizing elements like other data structures (such as ArrayList in Java).

# Use Cases:

Arrays are used when you need to store multiple values of the same type and when the number of elements is known ahead of time.