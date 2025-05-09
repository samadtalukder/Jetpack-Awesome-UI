# 🤝 Contribution Guidelines

Thank you for your interest in contributing to **Jetpack Awesome UI** — a Jetpack Compose-based UI
template following clean architecture and Material Design 3.

We welcome all contributions including new components, UI screens, code improvements, bug fixes, or
documentation enhancements.

## 🔧 Getting Started

1. **Fork** the repository.
2. **Clone** your forked copy to your local machine:
   ```bash
   git clone https://github.com/samadtalukder/Jetpack-Awesome-UI.git
   ```
3. **Create a new branch** for your feature or fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```
4. **Make Your Changes**:
    - Use **Jetpack Compose** best practices.
    - Ensure components follow **Material Design 3** guidelines.
    - Emphasize **reusability**, **previewability**, and **clean architecture**.
    - Use **@Preview** annotations and provide light/dark mode variants when applicable.
    - Write **KDoc** for composables, especially public or reusable ones.
    - Structure components in a scalable way (e.g., `feature`, `core-ui`, `theme`, etc.).

5. **Test and Review Locally**:
    - Ensure your code compiles and runs without errors.
    - Validate behavior across different screen sizes and orientations.
    - Run `./gradlew lint` and fix any warnings or errors.
    - If you add new components, include preview screenshots or screen recordings.

6. **Commit Your Changes**:
    - Use meaningful commit messages.
    - Group related changes in the same commit.
    - Avoid committing generated files or personal configurations.

7. **Push and Open a Pull Request**:
    1. Push your branch to your forked repo.
    2. Open a Pull Request (PR) to the main repository.
    3. In your PR description:
        - Summarize what you did and why.
        - Mention any related issues or discussions.
        - Attach **screenshots** of UI changes (required for visual components).

## 📐 Contribution Types

- ✨ New reusable UI components (`Card`, `Button`, `Dialog`, etc.)
- 🖼️ New screens (`Login`, `Dashboard`, `EmptyState`, etc.)
- 🧼 Refactoring code for better structure and performance
- 🐞 Bug fixes
- 📝 Documentation updates

## 🧪 Code Quality Checklist

- [ ] Code builds and runs without issues
- [ ] Followed the existing architecture and naming conventions
- [ ] Added or updated `@Preview` composable where relevant
- [ ] PR includes screenshots or media for UI changes
- [ ] Updated documentation or comments as needed

## 🙌 Thank You

Thank you for contributing to **Jetpack Awesome UI**. Let’s build beautiful Compose UIs — together!