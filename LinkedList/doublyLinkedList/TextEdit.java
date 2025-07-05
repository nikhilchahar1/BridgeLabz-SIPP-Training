class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    private TextState head = null, current = null;
    private int size = 0;
    private final int MAX_SIZE = 10;

    // Add new text state
    void addState(String content) {
        TextState newState = new TextState(content);

        // Clear forward redo history
        if (current != null) current.next = null;

        newState.prev = current;
        if (current != null) current.next = newState;
        else head = newState;

        current = newState;
        size++;

        // Limit to last 10 states
        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo operation
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Show current state
    void showCurrentState() {
        System.out.println("Current Text: " + (current != null ? current.content : ""));
    }
}
public class TextEdit {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");
        editor.showCurrentState(); // Hello, World!

        editor.undo();
        editor.showCurrentState(); // Hello, World

        editor.undo();
        editor.showCurrentState(); // Hello

        editor.redo();
        editor.showCurrentState(); // Hello, World

        editor.addState("Hi there!");
        editor.showCurrentState(); // Hi there!

        editor.redo(); // Nothing to redo.
    }
}
