package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.tasklist.Tasklist;
import duke.ui.Ui;

public abstract class Command {
    String commandOutput = "";
    boolean isExit = false;

    public abstract void execute(Tasklist list, Ui ui, Storage storage) throws DukeException;

    public boolean isExit() {
        return isExit;
    }

    public String commandOutput() {
        return commandOutput;
    }
}
