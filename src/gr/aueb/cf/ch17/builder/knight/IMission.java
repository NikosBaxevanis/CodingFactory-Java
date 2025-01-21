package gr.aueb.cf.ch17.builder.knight;


public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
