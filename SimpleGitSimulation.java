import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class GitRepository {
    private List<String> workingDirectory;
    private Map<String, List<String>> branches;
    private String currentBranch;

    public GitRepository() {
        workingDirectory = new ArrayList<>();
        branches = new HashMap<>();
        currentBranch = "master";
        branches.put(currentBranch, new ArrayList<>());
    }

    public void status() {
        System.out.println("Current Branch: " + currentBranch);
        System.out.println("Working Directory: " + workingDirectory);
        System.out.println("Staging Area: " + branches.get(currentBranch));
    }

    public void add(String file) {
        branches.get(currentBranch).add(file);
        System.out.println("Added " + file + " to the staging area.");
    }

    public void commit(String message) {
        List<String> stagedFiles = branches.get(currentBranch);
        if (!stagedFiles.isEmpty()) {
            branches.put(currentBranch, new ArrayList<>());
            branches.get(currentBranch).addAll(workingDirectory);
            System.out.println("Committed changes with message: " + message);
        } else {
            System.out.println("Nothing to commit.");
        }
    }

    public void switchBranch(String branchName) {
        if (branches.containsKey(branchName)) {
            currentBranch = branchName;
            workingDirectory.clear();
            workingDirectory.addAll(branches.get(currentBranch));
            System.out.println("Switched to branch: " + currentBranch);
        } else {
            System.out.println("Branch does not exist: " + branchName);
        }
    }
}

public class SimpleGitSimulation {
    public static void main(String[] args) {
        GitRepository repository = new GitRepository();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Status\n2. Add <file>\n3. Commit <message>\n4. Switch <branch>\n5. Exit");
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+", 2);

            switch (parts[0].toLowerCase()) {
                case "status":
                    repository.status();
                    break;
                case "add":
                    if (parts.length > 1) {
                        repository.add(parts[1]);
                    } else {
                        System.out.println("Invalid command. Usage: add <file>");
                    }
                    break;
                case "commit":
                    if (parts.length > 1) {
                        repository.commit(parts[1]);
                    } else {
                        System.out.println("Invalid command. Usage: commit <message>");
                    }
                    break;
                case "switch":
                    if (parts.length > 1) {
                        repository.switchBranch(parts[1]);
                    } else {
                        System.out.println("Invalid command. Usage: switch <branch>");
                    }
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
