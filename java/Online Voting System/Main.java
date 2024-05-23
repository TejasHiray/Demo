import java.util.*;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}

class Option {
    private String name;
    private int voteCount;

    public Option(String name) {
        this.name = name;
        this.voteCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void incrementVoteCount() {
        voteCount++;
    }
}

class Ballot {
    private String title;
    private List<Option> options;

    public Ballot(String title, List<Option> options) {
        this.title = title;
        this.options = options;
    }

    public String getTitle() {
        return title;
    }

    public List<Option> getOptions() {
        return options;
    }
}

class VotingSystem {
    private List<User> users;
    private List<Ballot> ballots;

    public VotingSystem() {
        users = new ArrayList<>();
        ballots = new ArrayList<>();
    }

    public void registerUser(String username, String password) {
        users.add(new User(username, password));
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                return user;
            }
        }
        return null;
    }

    public void createBallot(String title, List<String> optionNames) {
        List<Option> options = new ArrayList<>();
        for (String optionName : optionNames) {
            options.add(new Option(optionName));
        }
        ballots.add(new Ballot(title, options));
    }

    public Ballot getBallot(String title) {
        for (Ballot ballot : ballots) {
            if (ballot.getTitle().equals(title)) {
                return ballot;
            }
        }
        return null;
    }

    public void vote(User user, Ballot ballot, String optionName) {
        if (user != null && ballot != null) {
            Option selectedOption = null;
            for (Option option : ballot.getOptions()) {
                if (option.getName().equals(optionName)) {
                    selectedOption = option;
                    break;
                }
            }
            if (selectedOption != null) {
                selectedOption.incrementVoteCount();
            }
        }
    }

    public void showResults(Ballot ballot) {
        System.out.println("Results for Ballot: " + ballot.getTitle());
        for (Option option : ballot.getOptions()) {
            System.out.println(option.getName() + ": " + option.getVoteCount() + " votes");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Register users
        votingSystem.registerUser("user1", "password1");
        votingSystem.registerUser("user2", "password2");

        // Create a ballot
        List<String> optionNames = Arrays.asList("Option A", "Option B", "Option C");
        votingSystem.createBallot("Election 2023", optionNames);

        // Authenticate users
        User user1 = votingSystem.authenticateUser("user1", "password1");
        User user2 = votingSystem.authenticateUser("user2", "password2");

        // Cast votes
        Ballot ballot = votingSystem.getBallot("Election 2023");
        votingSystem.vote(user1, ballot, "Option A");
        votingSystem.vote(user2, ballot, "Option B");
        votingSystem.vote(user1, ballot, "Option B");

        // Show results
        votingSystem.showResults(ballot);
    }
}

