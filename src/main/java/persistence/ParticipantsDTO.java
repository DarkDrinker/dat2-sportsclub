package persistence;
public class ParticipantsDTO {
    public String team_id;
    public int noofparticipants;

    public ParticipantsDTO(String team_id, int noofparticipants) {
        this.team_id = team_id;
        this.noofparticipants = noofparticipants;
    }

    public String getTeam_id() {
        return team_id;
    }

    public int getNoofparticipants() {
        return noofparticipants;
    }
}
