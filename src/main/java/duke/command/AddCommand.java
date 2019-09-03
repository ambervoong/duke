package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.Task;
import duke.tasklist.Tasklist;
import duke.ui.Ui;

public class AddCommand extends Command {
    private Task task;

    // Constructor
    private AddCommand(Task task) {
        this.task = task;
    }

    public static Command createAddCommand(Task task) {
        return new AddCommand(task);
    } // End method.

    @Override
    public void execute(Tasklist tasks, Ui ui, Storage storage) throws DukeException {
        tasks.add(task);
        super.commandOutput = ui.addTaskDialogue(task.toString(), tasks.size());
    }
}
