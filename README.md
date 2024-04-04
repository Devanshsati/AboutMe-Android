# AboutMe App

AboutMe is a simple Android application that allows users to enter their name and a nickname. It demonstrates basic UI elements and data binding in Android.

## Features

- Displays a text input field for entering the user's nickname.
- Allows the user to submit the nickname by tapping a button.
- Updates the UI to display the entered nickname.

## Prerequisites

- Android Studio
- Basic understanding of Android development and data binding

## Installation

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Build and run the project on an Android device or emulator.

## Usage

- Upon launching the app, users are presented with a text input field and a button labeled "Submit".
- Users can enter their nickname in the text input field.
- Tapping on the "Submit" button submits the entered nickname.
- The entered nickname is displayed on the screen.

## Implementation Details

- The `MainActivity` sets up the layout using data binding and initializes click listeners for UI components.
- Clicking the "Submit" button triggers the `addNickName()` function, which updates the UI to display the entered nickname.
- Data binding is used to bind the UI elements to data objects, allowing seamless updates to the UI.

## Dependencies

- Data Binding: Used for binding layout components to data objects.
- InputMethodManager: Used for handling the keyboard and hiding it after submitting the nickname.

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments

- Thanks to the Android development community for sharing knowledge and resources.
