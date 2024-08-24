# Password Cracker in Java

This is a simple password-cracking program implemented in Java. The program attempts to guess a predefined password by generating random combinations from a set of specified characters.

## Features
- Utilizes a customizable set of predefined characters (`1, 2, 3, 4, 5, a, b, c, d`) to generate random combinations. You can easily modify this character set to include more characters.
- Continuously generates and tests random combinations until the correct password is found.
- Provides a straightforward user interface that prompts the user to start the cracking process.

## How it Works
The program follows these steps:
1. The password to be cracked is predefined as `"1cd23abc"`, which can be modified according to your needs.
2. The user is prompted to confirm if they want to begin the cracking process.
3. Once confirmed, the program randomly generates combinations using the predefined characters and compares each attempt to the target password.
4. If the generated combination matches the password, the program displays the cracked password and stops.

## How to Run
1. Clone the project using:
    ```bash
    git clone https://github.com/silvosarogil/Password_Cracker.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Password_Cracker
    ```
3. Compile the Java program:
    ```bash
    javac passwordCracker.java
    ```
4. Run the program:
    ```bash
    java passwordCracker
    ```
5. Follow the prompts to start the password-cracking process.

## Customization
- **Character Set**: You can modify the characters used in cracking by updating the `keysCombination()` method.
- **Target Password**: Change the `password` variable in the `main` method to test a different password.

## Notes
- This program is a simple demonstration of brute-force password cracking. In real-world applications, password security involves more robust measures such as encryption, hashing, and salting.
- The program is intended for educational purposes. Unauthorized password cracking is illegal and unethical.

Enjoy coding and exploring how brute-force techniques work!
