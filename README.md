# DSA in Java

Data Structures and Algorithms in Java. Clean, well commented solutions that I write while learning, with a short explanation of the idea behind each one.

I am adding new topics regularly, so this repo grows as I learn.

## Why this repo?

- To practice DSA in Java and build strong problem solving habits
- To keep my code organized in one place
- To show my learning progress in public

## Topics Covered

### 01 Linear Search

| Program | Idea in one line | Time Complexity |
|---------|------------------|-----------------|
| [LinearSearch.java](01-linear-search/LinearSearch.java) | Check every element one by one until the key is found | O(n) |
| [StudentRollNumberLinearSearch.java](01-linear-search/StudentRollNumberLinearSearch.java) | Search a roll number in an array and print its index | O(n) |
| [CountFrequency.java](01-linear-search/CountFrequency.java) | Count how many times a value appears and store all its indices | O(n) |

### 02 Binary Search

| Program | Idea in one line | Time Complexity |
|---------|------------------|-----------------|
| [BinarySearch.java](02-binary-search/BinarySearch.java) | Cut the sorted array in half each step using `mid` | O(log n) |
| [ModifiedBinarySearch.java](02-binary-search/ModifiedBinarySearch.java) | Find the first and last occurrence of a duplicate value | O(log n) |
| [ModifiedBinarySearchOccurrences.java](02-binary-search/ModifiedBinarySearchOccurrences.java) | Count occurrences using: last index - first index + 1 | O(log n) |

## Folder Structure

```
dsa-in-java/
├── 01-linear-search/
│   ├── LinearSearch.java
│   ├── StudentRollNumberLinearSearch.java
│   └── CountFrequency.java
├── 02-binary-search/
│   ├── BinarySearch.java
│   ├── ModifiedBinarySearch.java
│   └── ModifiedBinarySearchOccurrences.java
├── LICENSE
└── README.md
```

## How to Run

Make sure Java (JDK) is installed. Then:

```bash
# 1. Clone the repo
git clone https://github.com/ZimalYousuf3/dsa-in-java.git

# 2. Go to a topic folder
cd dsa-in-java/02-binary-search

# 3. Compile and run a file
javac BinarySearch.java
java BinarySearch
```

## Sample Output

**Binary Search: Count Occurrences**

```
Value found 4 times from index 6 to 9
```

**Linear Search: Count Frequency**

```
Value found 4 times at indices:
0 2 4 6
```

## Key Ideas I Learned

- **Linear search** works on any array, but it can be slow for big data.
- **Binary search** is much faster, but the array must be sorted.
- `mid = low + (high - low) / 2` is safer than `(low + high) / 2` because it avoids integer overflow.
- To find the **first** occurrence, move `high = mid - 1` after a match.
- To find the **last** occurrence, move `low = mid + 1` after a match.

## Progress Tracker

- [x] 01 Linear Search
- [x] 02 Binary Search
- [ ] 03 Sorting (Bubble, Selection, Insertion)
- [ ] 04 Merge Sort and Quick Sort
- [ ] 05 Recursion
- [ ] 06 Stacks
- [ ] 07 Queues
- [ ] 08 Linked Lists
- [ ] 09 Trees
- [ ] 10 Graphs
- [ ] 11 Hashing

## About Me

Hi, I am Zimal, a BSCS student who loves programming and AI. I work with C++, Java and Python.

GitHub: [ZimalYousuf3](https://github.com/ZimalYousuf3)

If you like this repo, feel free to give it a star.

## License

This project uses the license given in the [LICENSE](LICENSE) file.
