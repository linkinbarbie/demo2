package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;




public class PlayerResponse {
    @JsonProperty("response")
    private List<Player> players;

    // Getters and setters

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    // Custom toString() method

    @Override
    public String toString() {
        return "PlayerResponse{" +
                "players=" + players +
                '}';
    }
    @Getter
    @Setter
    public static class Player {
        @JsonProperty("id")
        private int id;

        @JsonProperty("firstname")
        private String firstname;

        @JsonProperty("lastname")
        private String lastname;

        @JsonProperty("birth")
        private Birth birth;

        @JsonProperty("nba")
        private Nba nba;

        @JsonProperty("height")
        private Height height;

        @JsonProperty("weight")
        private Weight weight;

        @JsonProperty("college")
        private String college;

        @JsonProperty("affiliation")
        private String affiliation;

        @JsonProperty("leagues")
        private Leagues leagues;

        // Getters and setters

        // ... (Add the getters and setters for all the fields)

        // Custom toString() method

        @Override
        public String toString() {
            return "Player{" +
                    "id=" + id +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", birth=" + birth +
                    ", nba=" + nba +
                    ", height=" + height +
                    ", weight=" + weight +
                    ", college='" + college + '\'' +
                    ", affiliation='" + affiliation + '\'' +
                    ", leagues=" + leagues +
                    '}';
        }

    }
    @Getter
    @Setter
    public static class Birth {
        @JsonProperty("date")
        private String date;

        @JsonProperty("country")
        private String country;

        // Getters and setters

        // ... (Add the getters and setters for all the fields)

        // Custom toString() method

        @Override
        public String toString() {
            return "Birth{" +
                    "date='" + date + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

    public static class Nba {
        @JsonProperty("start")
        private int start;

        @JsonProperty("pro")
        private int pro;

        // Getters and setters

        // ... (Add the getters and setters for all the fields)

        // Custom toString() method

        @Override
        public String toString() {
            return "Nba{" +
                    "start=" + start +
                    ", pro=" + pro +
                    '}';
        }
    }

    public static class Height {
        @JsonProperty("feets")
        private Integer feets;

        @JsonProperty("inches")
        private Integer inches;

        @JsonProperty("meters")
        private Integer meters;

        // Getters and setters

        // ... (Add the getters and setters for all the fields)

        // Custom toString() method

        @Override
        public String toString() {
            return "Height{" +
                    "feets=" + feets +
                    ", inches=" + inches +
                    ", meters=" + meters +
                    '}';
        }
    }

    public static class Weight {
        @JsonProperty("pounds")
        private Integer pounds;

        @JsonProperty("kilograms")
        private Integer kilograms;

        // Getters and setters

        // ... (Add the getters and setters for all

        // Getters and setters

        // ... (Add the getters and setters for all the fields)

        // Custom toString() method

        @Override
        public String toString() {
            return "Weight{" +
                    "pounds=" + pounds +
                    ", kilograms=" + kilograms +
                    '}';
        }
    }

    public static class Leagues {
        @JsonProperty("standard")
        private Standard standard;

        // Getters and setters

        // ... (Add the getters and setters for all the fields)

        // Custom toString() method

        @Override
        public String toString() {
            return "Leagues{" +
                    "standard=" + standard +
                    '}';
        }
    }

    public static class Standard {
        @JsonProperty("jersey")
        private int jersey;

        @JsonProperty("active")
        private boolean active;

        @JsonProperty("pos")
        private String pos;

        // Getters and setters

        // ... (Add the getters and setters for all the fields)

        // Custom toString() method

        @Override
        public String toString() {
            return "Standard{" +
                    "jersey=" + jersey +
                    ", active=" + active +
                    ", pos='" + pos + '\'' +
                    '}';
        }
    }
}



