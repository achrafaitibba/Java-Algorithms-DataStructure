# Java-Algorithms-DataStructure
Repository to learn and practice java, algorithms and data structure.
Preparing for oracle OCI certificate

## Data Structures types

| Linear | Non-Linear |
| ----------- | ----------- |
| Elements arranged in sequent maner | Not in sequence |
| Each member connected to previous/next element | Connected to each other throu different parts |
| Easy to traverse them | Slow/Hard to traverse them "More time"
| Stored sequentially in the memory | Rely on pointers to form connections and allow traversal between elements
| Single level traversly | Multi level traversly
| Easy to implement | Not easy hh 

## Time and space complexity
### Time
The amount of time to perform an algorithm
### Space
The amount of memory space taken by an algorithm to run
## Asymptotic analysis of an algorithm 
- ### Omega (Ω)
The lower bound of the algorithm's running time.

Example:
```
If an algorithm has 100s as best amount of time, so the lower bound is 100s, it may take more but not less than 100s
```
- ### Big O (O)
The upper bound of the algorithm's running time.

Example:
```
If an algorithm has 100s as worst amount of time, so the upper bound is 100s, it may take less but not more than 100s
```
- ### Theta (θ)
The average time of several running time excutions.

Example:
```
If an algorithm has (100s,120s,110s,110s), so the average is 110s
```

## Big O
### Rules

- It's a single process
- It perform sequetial execution of statements
- Each of the following operations is 1 unit of time:
   * Assignment
   * Return
   * Arithmetcal
   * Logical
   * Other small/single operations

Example:
```
public int sum(int a, int b){
    int sum = a + b; 
    return sum;
}

Total units of time = 6:
2 units for passing a and b
1 unit for the addition (a + b)
1 unit for assignment to sum
1 unit for fetching sum
1 unit for returning the result
```
### Complexity
- O(1) - 'Contstant Algorithm' 

Example 1:
```
public int num(){
    int num = 1; 
    return num;
}

Total units of time = 4:
1 units for declaring num
1 unit for assignment to num
1 unit for fetching num
1 unit for returning the num
```
```
T = 4 // constant
```
Example 2:
```
public int getElement(int[] array, int i){ 
    return array[i];
}

Total units of time = 3:
1 units for fetching the i
1 unit for accessing the array
1 unit for returning the fetched value
```
```
T = 3 // constant
```


![O(1) graph](/Algorithms-DataStructures/src/main/resources/assets/o(1).png)
