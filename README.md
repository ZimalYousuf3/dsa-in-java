# DSA in Java

Data Structures and Algorithms in Java. Clean, well commented solutions that I write while learning, with a short explanation of the idea behind each one.

I am adding new topics regularly, so this repo grows as I learn.

## Why this repo?

- To practice DSA in Java and build strong problem solving habits
- To keep my code organized in one place
- To show my learning progress in public

## Topics Covered

| Topic | Program | Idea in one line | Time Complexity |
|-------|---------|------------------|-----------------|
| Linear Search | Student Roll Number Search | Check every element one by one until the key is found | O(n) |
| Linear Search | Count Frequency and Position Tracking | Count how many times a value appears and store all its indices | O(n) |
| Binary Search | Basic Binary Search | Cut the sorted array in half each step using `mid` | O(log n) |
| Binary Search | First and Last Occurrence | Keep searching after a match to find the first or last duplicate | O(log n) |
| Binary Search | Count Occurrences | Count = last index - first index + 1 | O(log n) |

## Folder Structure

```
dsa-in-java/
├── README.md
└── searching/
    ├── linear-search/
    │   ├── StudentRollNumberLinearSearch.java
    │   └── CountFrequency.java
    └── binary-search/
        ├── BinarySearch.java
        ├── ModifiedBinarySearch.java
        └── ModifiedBinarySearchOccurrences.java
```

## How to Run

Make sure Java (JDK) is installed. Then:

```bash
# 1. Clone the repo
git clone https://github.com/ZimalYousuf3/dsa-in-java.git

# 2. Go to a topic folder
cd dsa-in-java/searching/binary-search

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

- [x] Linear Search
- [x] Binary Search
- [ ] Sorting (Bubble, Selection, Insertion)
- [ ] Merge Sort and Quick Sort
- [ ] Recursion
- [ ] Stacks
- [ ] Queues
- [ ] Linked Lists
- [ ] Trees
- [ ] Graphs
- [ ] Hashing

## About Me

Hi, I am Zimal, a BSCS student who loves programming and AI. I work with C++, Java and Python.

GitHub: [ZimalYousuf3](https://github.com/ZimalYousuf3)

If you like this repo, feel free to give it a star.
