# Wordle Solver

## Description
Tired of losing at Wordle? Use this Java-based solution to narrow down your word choices based on given conditions!

## Features
- **Dynamic Word Filtering**: Based on your inputs, the program filters out words from a master list.
- **User-friendly Terminal Interaction**: You can easily specify conditions via the terminal.

## Getting Started

### Prerequisites
- Make sure you have the Java JDK installed on your machine.
- You should have a word list file named `wordlist.txt` placed in the same directory as the Java files. This file should contain one word per line.

### Steps

1. **Compile the Java Code**:
    ```bash
    javac WordLists.java WordTest.java
    ```

2. **Run the Main Program**:
    ```bash
    java WordTest
    ```

3. The program will now guide you through a series of prompts. Here's how to interact with them:

    - **Length of Word**: Enter the desired word length.
    - **Letter Inclusion at a Position**: Specify a letter and its position if you want words with that letter at the specified position.
    - **Letter Exclusion at a Position**: Specify a letter and its position if you want to exclude words with that letter at the specified position.
    - **Letter Exclusion Anywhere in Word**: Specify any letters you want entirely excluded from the words.

4. The program will display words that fit your criteria. You can repeat the filtering process as many times as needed.

## Code Structure
- `WordLists.java`: Contains static methods that handle word filtering based on the conditions.
- `WordTest.java`: Main driver program that interacts with the user and uses `WordLists` to get the desired words.

## Using the Solver
Upon running `WordTest`, the program will prompt you for inputs. Here's a brief overview of what to expect:

```plaintext
Welcome to the Wordle Solver!

Specify the word conditions:
Length of word: 5
Include letter at position (e.g., a3 for letter 'a' at position 3): a2
Exclude letter at position (e.g., e3 to exclude 'e' at position 3): e4
Letters to be completely excluded (comma-separated): i,o

... [Results Displayed Here] ...
